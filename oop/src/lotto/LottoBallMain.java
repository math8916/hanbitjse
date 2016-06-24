/**
 * 
 */
package lotto;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Arrays;

/**
 * @date : 2016. 6. 24.
 * @author : 최인철
 * @file_name : SBSmain.java
 * @story :
 */
public class LottoBallMain {
	public static void main(String[] args) {
		LottoBean lot = new LottoBean();
		LottoBallService service = new LottoBallServiceImpl();
		StringBuffer buf = new StringBuffer();
		service.setLottoBall(lot);
		int[] lotto = service.getLottoBall();
		Arrays.sort(lotto);
		for (int i = 0; i < lotto.length; i++) {
			// service.sort(lottos[i]);
			// for (int j = 0; j < lotto.length; j++) {
			buf.append(lotto[i] + "\t");
		}
		buf.append("/");
		System.out.println("로또\n" + buf);

//		int lottoSerialNo = (int) (Math.random() * 999999 + 100000);
		File output = new File("c:\\eclipse\\lotto\\LottoBall.txt");
		BufferedWriter bw = null;

		String[] myLotto = buf.toString().split("/");

		try {
			bw = new BufferedWriter(new FileWriter(output, true));
			for (String lots : myLotto) {
				lots += System.getProperty("line.separator");
				bw.write(lots);
			}

		} catch (IOException e) {
			e.printStackTrace();// FileWriter fw = new FileWriter(output,true);
		} finally {
			try {
				bw.flush();
				bw.close();
			} catch (IOException e) {
				e.printStackTrace();
			}
			// 뒤에 true는 이어써라
		}
	}
}