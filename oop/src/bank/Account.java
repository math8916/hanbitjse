/**
 * 
 */
package bank;

import java.util.Random;

/**
 * @date : 2016. 6. 16.
 * @author : 최인철
 * @file_name : Account.java
 * @story :
 */
public class Account { // 클래스 ,헤더 접근제한 -클래스 종류
	private int accountNo; // 인스턴스 변수는 초기화 하지 않는다.
	private String name;
	private int money;
	
	private String id;
	private String pw;
	
	/**
	 * @param name
	 * 
	 */
	public Account(String name) {
		this.accountNo = (int) ((Math.random() * 99999) + 100000);
		this.name = name;
	}

	public void setMoney(int money) {
		this.money = money;
	}


	public void setId(String id) {
		this.id = id;
	}

	public void setPw(String pw) {
		this.pw = pw;
	}

	public int getAccountNo() {
		return this.accountNo;
	}

	public String getName() {
		return this.name;
	}

	public int getMoney() {
		return this.money;

	}
	public String getId() {
		return this.id;
	}

	public String getPw() {
		return this.pw;
	}

}
