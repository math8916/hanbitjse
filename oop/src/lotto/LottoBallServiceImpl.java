/**
 * 
 */
package lotto;

/**
 * @date : 2016. 6. 24.
 * @author : 최인철
 * @file_name : LottoBallServiceImpl.java
 * @story :
 */
public class LottoBallServiceImpl implements LottoBallService {
	private int[] lotto;
	LottoBean lot = new LottoBean();

	/*
	 * (non-Javadoc)
	 * 
	 * @see lotto.LottoBallService#setLottoBall()
	 */
	@Override
	public void setLottoBall(LottoBean lot) {
		// TODO Auto-generated method stub
		this.lotto = new int[6];
		int i = 0;
		while (true) {
			lot.setNumber();
			int num = lot.getNumber();
			if (isDuplication(num)) {
				continue;
			}
			this.lotto[i] = num;
			{
				i++;
	
				if (i == lotto.length) {

					break;
				}
			}
		}
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see lotto.LottoBallService#getLottoBall()
	 */
	@Override
	public int[] getLottoBall() {
		// TODO Auto-generated method stub
		return lotto;
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see lotto.LottoBallService#isDuplication(int)
	 */
	@Override
	public boolean isDuplication(int num) {
		// TODO Auto-generated method stub
		for (int i = 0; i < lotto.length; i++) {
			if (lotto[i] == num) {
				return true;
			}
		}
		return false;
	}

}