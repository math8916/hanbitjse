package gmaeRps1;

import javax.swing.JOptionPane;

public class RpsController {
	public static void main(String[] args) {
		RpsService service = new RpsServiceImpl2();
		while (true) {
			switch (JOptionPane.showInputDialog("1.계속 2.종료")) {
			case "1":
				String rps = JOptionPane.showInputDialog("1.가위 2.바위 3.보 0.종료");
				if (!service.checkValidation(rps)){
					JOptionPane.showMessageDialog(null,	"잘못된 값입니다.");
					break;
				}
//
				service.betPlayValue(Integer.parseInt(rps));
				service.setComputerValue();
				service.whoWin();
				JOptionPane.showMessageDialog(null, service.showResult());
				break;
			default:
				JOptionPane.showConfirmDialog(null, "close?");
				return;
				}
		
		}
		
}
}
