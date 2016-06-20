/**
 * 
 */
package bank;

/**
 * @date   : 2016. 6. 20.
 * @author : 최인철
 * @file_name : accountServiceImpl.java
 * @story : 계좌 인터페이스
*/
public class accountServiceImpl implements Accountservice {

	
	public void openAccount(String name, String id, String pw) {
		// TODO Auto-generated method stub
		AccountBean account ;
		
	}

	/* (non-Javadoc)
	 * @see bank.Accountservice#deposit(int)
	 */
	public void deposit(int inputMoney) {
		// TODO Auto-generated method stub
		
	}

	/* (non-Javadoc)
	 * @see bank.Accountservice#findAccount()
	 */
	@Override
	public void findAccount() {
		// TODO Auto-generated method stub
		
	}

	/* (non-Javadoc)
	 * @see bank.Accountservice#withdraw(int)
	 */
	@Override
	public String withdraw(int output) {
		// TODO Auto-generated method stub
	
		
		return null;
	}

	/* (non-Javadoc)
	 * @see bank.Accountservice#showAccount()
	 */
	@Override
	public String showAccount() {
		// TODO Auto-generated method stub
		return null;
	}

	/* (non-Javadoc)
	 * @see bank.Accountservice#deleteAccount()
	 */
	@Override
	public String deleteAccount() {
		// TODO Auto-generated method stub
		return null;
	}

}
