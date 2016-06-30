package gmaeRps1;

public class RpsServiceImpl implements RpsService {
	RpsBean rps = new RpsBean();

	@Override
	public void betPlayValue(int play) {
		// TODO Auto-generated method stub
		rps.setPlay(play);
	}

	@Override
	public void setComputerValue() {
		// TODO Auto-generated method stub
		rps.setCom((int) (Math.random() * 3 + 1));
	}

	@Override
	public void whoWin() {
		switch (rps.getPlay() - rps.getCom()) {
		case 0:
			rps.setWinner("무승부");
			break;
		case -1:
		case 2:
			rps.setWinner("컴퓨터 승리");
			break;
		default:
			rps.setWinner("플레이어 승리");
			break;
		}
		// TODO Auto-generated method stub

	}

	@Override
	public String showResult() {
		// TODO Auto-generated method stub
		return rps.toString();
	}

	@Override
	public boolean checkValidation(String rps) {
		int rps1 = Integer.parseInt(rps);
		// TODO Auto-generated method stub
		return rps1==1 || rps1==2 ||rps1==3 ? true : false ;
	}
}
