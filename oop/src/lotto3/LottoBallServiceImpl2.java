/**
 * 
 */
package lotto3;

/**
 * @date : 2016. 6. 24.
 * @author : 최인철
 * @file_name : LottoBallServiceImpl.java
 * @story :
 */
public class LottoBallServiceImpl2 implements LottoBallService {
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
			boolean flag = false;
			lot.setNumber();
			int num = lot.getNumber();
			for (int j = 0; j < i; j++) {
				if (lotto[j] == num) {
					flag = true;
					break;
				}

			}
			if(!flag){
				this.lotto[i] = num;	
				i++;
			}
			
			if (i == 6) {

				break;
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

}