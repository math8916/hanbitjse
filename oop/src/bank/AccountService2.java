/**
 * 
 */
package bank;

import javax.swing.JOptionPane;

import com.sun.org.apache.regexp.internal.recompile;

/**
 * @date   : 2016. 6. 20.
 * @author : 최인철
 * @file_name : AccountService.java
 * @story : 
*/
public class AccountService2 {
	// 1.개설 2.입금 3.조회 4.출금 5.통장내역
	AccountBean account ; // 중복 정의
	// 1.개설
	public void openAccount(String name,String id, String pw) {
		
		account = new AccountBean(name,id,pw);
	}
	// 2.입금
	public void deposit(int inputMoney){
		int money =account.getMoney();
		money += inputMoney ;
		account.setMoney(money);
	}
	// 3.조회
	public void findAccount() {
		
	}
	// 4.출금
	public  String withdraw(int output){
		String result ="잔액 부족" ;
		int money =account.getMoney();
		if (output <= money) {
			money -=output;	
			account.setMoney(money);
			result = String.valueOf(account.getMoney());
		} 
		return result;
		//		money += inputMoney ;
//		account.setMoney(money);
//		
//		String result ="";
//		int money = account.getMoney();
//		return (output >money)? "출금액이 잔액 보다 큽니다":String.valueOf(money -= output) ;
}
	//5.통장내역
	public String showAccount() {
		return account.toString();
	}
	// 6.해지
	public String deleteAccount() {
		account = null;	
	return "해지";
	}
}
