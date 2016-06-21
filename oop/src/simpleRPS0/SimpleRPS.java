package simpleRPS0;


import javax.swing.JOptionPane;


public class SimpleRPS {
public static void main(String[] args) {
		String result="";
		System.out.println( "=== 가위 바위 보 =====");
		while (true) {
			switch (JOptionPane.showConfirmDialog(null, "go?")){
					
			case 0:

				String p =JOptionPane.showInputDialog("1.가위 2, 바위 3. 보 를 입력");
				result = gameEngine(result, p);
				JOptionPane.showMessageDialog(null, result);	
				break;

			default:
				return;
			}
		}
}

/**
 * @param result
 * @param s
 * @return
 */
public static String gameEngine (String result, String p) {
	switch (p) {
	case "1":
		switch ((int) (Math.random()*3)+1) {
		case 1: result = "Tie"; 	break;
		case 2: result = "Loss"; 	break;
		case 3: result = "Win"; 	break;

		default:
			break;
		}
		break;
	case "2":
		switch ((int) (Math.random()*3)+1) {
		case 1: result = "win"; 	break;
		case 2: result = "tie"; 	break;
		case 3: result = "loss"; 	break;

		default:
			break;
		}

		break;
	case "3":
		switch ((int) (Math.random()*3)+1) {
		case 1: result = "win"; 	break;
		case 2: result = "loss"; 	break;
		case 3: result = "tie"; 	break;
		}	
	case "0":
			result = "colse";
		default:
			break;
		

	}
	return result;

}

}

