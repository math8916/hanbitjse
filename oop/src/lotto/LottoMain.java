/**
 * 
 */
package lotto;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Arrays;

import javax.swing.JOptionPane;

/**
 * @date : 2016. 6. 23.
 * @author : 최인철
 * @file_name : LottoController.java
 * @story :
 */
public class LottoMain {
	public static void main(String[] args) {
		LottoBean lot = new LottoBean();
		LottoService service = new LottoServiceImpl();
		StringBuffer buf = new StringBuffer();
		String input =(JOptionPane.showInputDialog("얼마치 구입 ?"));
		lot.setMoney(Integer.parseInt(input));
		service.setLottos(lot);
		int[][] lottos = service.getLottos();
		for (int i = 0; i < lottos.length; i++) {
//			service.sort(lottos[i]);
			Arrays.sort(lottos[i]);
			for (int j = 0; j < lottos[i].length; j++) {
				buf.append(lottos[i][j] + "\t");
			}
			buf.append("/");
		}
	System.out.println("로또\n"+buf);
	int lottoSerialNo=(int) (Math.random()*999999+100000);
	File output = new File("c:\\eclipse\\lotto\\"+ lottoSerialNo+".txt");
	BufferedWriter bw=null;
	
	String[] myLotto = buf.toString().split("/");
	
	try {
		bw = new BufferedWriter(new FileWriter(output,true));
		for(String lots :myLotto){
			lots +=System.getProperty("line.separator");
			bw.write(lots);
	}
	
	}catch (IOException e){
		e.printStackTrace();//	FileWriter fw = new FileWriter(output,true);
	}finally {
		try{
		bw.flush();
		bw.close();
	}catch(IOException e){
		e.printStackTrace();
	}
	//뒤에 true는 이어써라
} 
}
}