package simpleRPS4;

import java.util.Random;

public class SimpleRpsServiceImpl2 implements SimpleRpsService{
SimpleRpsBean rps = new SimpleRpsBean();
	@Override
	public String playGame(int play) {
		// TODO Auto-generated method stub
		
		String result ="";
		
		Random r = new Random();
		int com = rps.getCom();
		int ply = rps.getPlay();
		return result;
	}

	@Override
	public String getResult(String result) {
		// TODO Auto-generated method stub
		return "플레이어는:"+ rps.getWinner();
	}

}
