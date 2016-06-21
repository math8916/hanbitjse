package simpleRps;

public class SimpleRpsImpl implements SimpleRpsService{

	@Override
	public String gameEngine(String result, String s) {
		// TODO Auto-generated method stub
		switch (s) {
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
				return result;
			default:
				break;
			


		}
		return s;
	}

}
