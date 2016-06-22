package phone;

import javax.swing.JOptionPane;

public class PhoneController {
public static void main(String[] args) {
	Phone phone = new Phone();
	CellPhone cellPhone = new CellPhone();
	IPhone iPhone = new IPhone();
	AndroidPhone androidPhone =new AndroidPhone();
	while (true) {
		
		switch (JOptionPane.showInputDialog("1.유선폰 2. 휴대폰 3. 아이폰 4.안드로이든 폰0 종료")) {
		case "1":
			phone.setCompany(JOptionPane.showInputDialog("어느회사 제품?"));
			phone.setCall( JOptionPane.showInputDialog("통화내용"));
			
			JOptionPane.showConfirmDialog(null, phone.toString());
			break;
		case "2":
			cellPhone.setCompany(JOptionPane.showInputDialog("어느회사 제품?"));
			cellPhone.setCall( JOptionPane.showInputDialog("통화내용"));
			cellPhone.setPortable(true);// 이동 가능
			
			JOptionPane.showConfirmDialog(null, cellPhone.toString());
		case "3" : 
			iPhone.setCompany(JOptionPane.showInputDialog("어느회사 제품?"));
			iPhone.setCall( JOptionPane.showInputDialog("통화내용"));
			iPhone.setData(JOptionPane.showInputDialog("문자내용"));
			iPhone.setPortable(true);// 이동 가능
			JOptionPane.showConfirmDialog(null, iPhone.toString());
			break;
		case "4" :
			androidPhone.setData(JOptionPane.showInputDialog("통화내용"), JOptionPane.showInputDialog("사이즈"), JOptionPane.showInputDialog("문자내용"));
			androidPhone.setPortable(true);// 이동 가능
			JOptionPane.showConfirmDialog(null, androidPhone.toString());
		
			break;
		case "0":
			return;
		default:
			break;
		}
	}
}
}
