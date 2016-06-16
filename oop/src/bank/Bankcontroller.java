/**
 * 
 */
package bank;

import java.util.Random;

import javax.swing.JOptionPane;

import com.sun.xml.internal.bind.v2.runtime.Name;

/**
 * @date : 2016. 6. 15.
 * @author : 최인철
 * @file_name : Bankcontroller.java
 * @story :
 */
public class Bankcontroller {
	public static void main(String[] args) {
		String s=null; // =""
		Account account = null;
		

		while (true) {

			switch (JOptionPane.showInputDialog(null, "1.개설 2.입금 3.조회 4.출금 5.통장내역 0.종료:")) {

			case "1":
				int ok = JOptionPane.showConfirmDialog(null, "개좌 개설 yes") ;
				if (ok==0) {
					account = new Account(JOptionPane.showInputDialog("이름"));
					
				}	else {
						continue;
					}
				
				break ;
			case "2":
				String inputMoney = JOptionPane.showInputDialog("입금액 ? ");
				account.setMoney(Integer.parseInt(inputMoney));
				break;
			case "3":
				JOptionPane.showMessageDialog(null, account.getMoney());
				break;
			case "4":
				break;
			case "5":
				JOptionPane.showMessageDialog(null,"이름:"+account.getName()+"계좌번호"+account.getAccountNo());
				break;
			case "0":
				JOptionPane.showConfirmDialog(null, "close?");
				return;

			}
		}
	}
}
