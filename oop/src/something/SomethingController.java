/**
 * 
 */
package something;

import javax.swing.JOptionPane;

import school.StudentBean;

/**
 * @date   : 2016. 6. 17.
 * @author : 최인철
 * @file_name : SomethingController.java
 * @story : 
*/
public class SomethingController {
public static void main(String[] args) {
	Something something= null;
	while (true) {
		switch (JOptionPane.showInputDialog(null,"1.등록 2 조회 0. 종료")) {
		
		case "1":
			String aaa= JOptionPane.showInputDialog("aaa : ");
			String bbb= JOptionPane.showInputDialog("bbb:");
			int ccc=Integer.parseInt(JOptionPane.showInputDialog("ccc"));
			int ddd=Integer.parseInt(JOptionPane.showInputDialog("ddd"));
			something = new Something(aaa, bbb, ccc,ddd);
						
			break;

	case "2":
		JOptionPane.showMessageDialog(null,"aaa: "+something.getAaa()+"bbb:"+something.getBbb()+"ccc"+something.getCcc()+"ddd"+something.getDdd());
			break;
	case "0":
		JOptionPane.showConfirmDialog(null, "close?");
		return;

		default:
			break;
		}
	}
}
}
