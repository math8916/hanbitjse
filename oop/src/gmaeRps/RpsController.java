package gmaeRps;

import javax.swing.JOptionPane;

public class RpsController {
	public static void main(String[] args) {
		RpsService service = new RpsServiceImpl();
		while (true) {
			switch (JOptionPane.showInputDialog("1.계속 2.종료")) {
			case "1":
				String rps = JOptionPane.showInputDialog("1.가위 2.바위 3.보 0.종료");
				if (!service.checkValidation(rps)){
					JOptionPane.showMessageDialog(null,	"잘못된 값입니다.");
					break;
				}
//
				// service.betPlayValue(Integer.parseInt(rps);
			default:
				JOptionPane.showConfirmDialog(null, "close?");
				return;
				}
		break;
		}
		
}
}
