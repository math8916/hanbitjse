/**
 * 
 */
package bank;

import javax.swing.JOptionPane;

/**
 * @date : 2016. 6. 15.
 * @author : 최인철
 * @file_name : Bankcontroller.java
 * @story :
 */
public class Bankcontroller {
	public static void main(String[] args) {
		int ok=0;
		String spec ="";
		AccountService service = new AccountServiceImpl();
		AccountBean bean = new AccountBean();
		BankService bankService = new BankServiceImpl();

		while (true) {

			switch (JOptionPane.showInputDialog(null, "1.개설 2.입금 3.조회 4.출금 5.통장내역 6.해지 \n"
					+ "관리자 모드 11.개설 12.조회 13. 조회(계좌번호) 14.이름 조회 0.종료:")) {

			case "1":
				spec = JOptionPane.showInputDialog("이름,ID,PW");
			
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
			case "11":
				String list = JOptionPane.showInputDialog("이름,ID,PW");
				
				String[] listArr= list.split(",");
	//			listArr = new ArrayList<AccountBean>();
//				service.openAccount(listArr[0],listArr[1],listArr[2]);
				AccountBean acc = new AccountBean();
				acc.setAccountNo();
				acc.setName(listArr[0]);
				acc.setId(listArr[1]);
				acc.setPw(listArr[2]);
				bankService.openAccount(acc);
				break ;
			case "12":
				// 조회
				JOptionPane.showMessageDialog(null, bankService.list());
				break;
			case "13":
				// 계좌번호 조회
				String searchAccount=JOptionPane.showInputDialog("검색 계좌 번호 입력하세요");
				bankService.findByAccountNo(searchAccount);
				JOptionPane.showMessageDialog(null, bankService.findByAccountNo(searchAccount));
				break;
			case "14":
				String searchName=JOptionPane.showInputDialog("검색 이름 입력하세요");
				bankService.findByName(searchName);
				JOptionPane.showMessageDialog(null, bankService.findByAccountNo(searchName));
				
				// 이름 조회
				break;
			case "15":
				JOptionPane.showMessageDialog(null, bankService.count());
				break;
			case "16": break;
			
			case "0":
				JOptionPane.showConfirmDialog(null, "close?");
				
				return;

			}
		}
	}
}
