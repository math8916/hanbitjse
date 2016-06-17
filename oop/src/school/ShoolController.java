/**
 * 
 */
package school;

import javax.swing.JOptionPane;

import bank.Account;

/**
 * @date   : 2016. 6. 16.
 * @author : 최인철
 * @file_name : ShoolController.java
 * @story : 
*/
public class ShoolController {
public static void main(String[] args) {
	Student student =null;
	Gender gender =null;
while (true) {
	
	switch (JOptionPane.showInputDialog(null,"1.등록 2 조회 0. 종료")) {
	
	case "1":
		String name= JOptionPane.showInputDialog("이름 :");
		String ssn= JOptionPane.showInputDialog("주민등록 번호 ");		
		String id= JOptionPane.showInputDialog("ID:");
		String pw= JOptionPane.showInputDialog("PW: ");
		
		student = new Student(name, pw, id, ssn);
		
		
		break;

case "2":
		
	JOptionPane.showMessageDialog(null,student.toString());
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

