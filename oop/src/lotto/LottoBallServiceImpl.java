/**
 * 
 */
package lotto;

import java.util.Arrays;

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
	/**
	 * 
	 */
	public LottoBallServiceImpl() {
		this.lotto = new int[6];
		// TODO Auto-generated constructor stub
	}
	@Override
	public void setLottoBall() {
		// TODO Auto-generated method stub
		LottoBean lot = new LottoBean();
		for (int i = 0; i < lotto.length; i++) {
			lotto[i]=0;
		}
		for (int i = 0; i < lotto.length; i++) {
			lot.setNumber();
			int num =lot.getNumber();
			boolean exist =false;
			for (int j = 0; j < lotto.length; j++) {
				if (lotto[j]==num) {
					exist =true;
				}
			}
			if (exist) {
				i--;
				continue;
			}else {
				lotto[i]=num;
			}
		}
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
		Arrays.sort(lotto);
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