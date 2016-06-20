/**
 * 
 */
package bank;

import java.util.Random;

import javax.swing.JOptionPane;

import com.sun.xml.internal.bind.v2.runtime.Name;

import global.MyConstants;

/**
 * @date : 2016. 6. 15.
 * @author : 최인철
 * @file_name : Bankcontroller.java
 * @story :
 */
public class Bankcontroller {
	public static void main(String[] args) {
		AccountService2 service = new AccountService2();
		int y=0;

		while (true) {

			switch (JOptionPane.showInputDialog(null, "1.개설 2.입금 3.조회 4.출금 5.통장내역 6.해지 0.종료:")) {

			case "1":
				String spec = JOptionPane.showInputDialog("이름,ID,PW");
			
				String[] specArr= spec.split(",");
				service.openAccount(specArr[0],specArr[1],specArr[2]);
				
				break ;
			case "2":
				String inputMoney = JOptionPane.showInputDialog("입금액 ? ");
		//		account.setMoney(Integer.parseInt(inputMoney));
				service.deposit(Integer.parseInt(inputMoney)) ;
				break;
			case "3":
	//			JOptionPane.showMessageDialog(null, service.findAccount());
				break;
			case "4":
				String output = JOptionPane.showInputDialog("출금액 ? ");
				service.withdraw(Integer.parseInt(output));
				JOptionPane.showMessageDialog(null, service.withdraw(Integer.parseInt(output)));
				
				break;
			case "5":
				JOptionPane.showMessageDialog(null,service.showAccount());
				break;
			case "6":
				JOptionPane.showMessageDialog(null,service.deleteAccount());
				break;
			case "0":
				JOptionPane.showConfirmDialog(null, "close?");
				
				return;

			}
		}
	}
}
