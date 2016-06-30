/**
 * 
 */
package kaup;

import java.util.Scanner;

import javax.swing.JOptionPane;

/**
 * @date : 2016. 6. 15.
 * @author : 최인철
 * @file_name : KaupController.java
 * @story :
 */
public class KaupController {
	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		Kaup jKaup = new Kaup();
		while (true) {

			switch (JOptionPane.showInputDialog("1;실행,0:종료")) {
			case "1":

				String name = JOptionPane.showInputDialog("이름");
				String height = JOptionPane.showInputDialog("키");
				String weight = JOptionPane.showInputDialog("몸무게");
				jKaup.setName(name);
				jKaup.setHeight(height);
				jKaup.setWeight(weight);
				JOptionPane.showMessageDialog(null,jKaup.cKaup());

				break;

			default:
				JOptionPane.showConfirmDialog(null, "종료하시겠습니가?");
				return;

			}
		}
	}
}
