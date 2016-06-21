package simpleRPS3;

import java.util.Random;

public class SimpleRpsServiceImpl implements SimpleRpsService{
SimpleRpsBean rps = new SimpleRpsBean();
	@Override
	public String playGame(int player) {
		// TODO Auto-generated method stub
		
		String result ="";
		Random r = new Random();
		switch (player) {
		
		case 1:
			switch (r.nextInt(3)+1) {
			case 1: result = "Tie"; 	break;
			case 2: result = "Loss"; 	break;
			case 3: result = "Win"; 	break;

			}
			break;
		case 2:
			switch (r.nextInt(3)+1)  {
			case 1: result = "win"; 	break;
			case 2: result = "tie"; 	break;
			case 3: result = "loss"; 	break;

			}

			break;
		case 3:
			switch (r.nextInt(3)+1)  {
			case 1: result = "win"; 	break;
			case 2: result = "loss"; 	break;
			case 3: result = "tie"; 	break;
			}	
		case 0:
				result = "colse";
				break;
			


		}
		return "플레이어는:"+ rps.getWinner();
	}

	@Override
	public String getResult(String result) {
		// TODO Auto-generated method stub
		return "플레이어는:"+ rps.getWinner();
	}

}
