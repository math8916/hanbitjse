package simpleRPS4;

import javax.swing.JOptionPane;

public class SimpleRpsController {
	public static void main(String[] args) {
		System.out.println( "=== 가위 바위 보 =====");
		SimpleRpsService service =new SimpleRpsServiceImpl();
		int player=0,computer=0;
//		String result="",match="";
//			Random r =new Random();
		
			
			while (true) {
				switch (JOptionPane.showConfirmDialog(null, "go?")){
						
				case 0:

					
					JOptionPane.showMessageDialog(null, service.getResult(service.playGame(Integer.parseInt(JOptionPane.showInputDialog("1.가위 2, 바위 3. 보 를 입력")))));	
					break;

				default:
					return;
				}
			}
	}
}
