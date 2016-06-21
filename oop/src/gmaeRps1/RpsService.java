package gmaeRps1;

public interface RpsService {
	public void betPlayValue(int playValue);
	public void setComputerValue();
	public void whoWin();
	public String showResult();
	public boolean checkValidation(String rps); // 유효성 체크
}
