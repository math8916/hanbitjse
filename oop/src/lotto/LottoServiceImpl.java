/**
 * 
 */
package lotto;

/**
 * @date : 2016. 6. 23.
 * @author : 최인철
 * @file_name : LottoServiceImpl.java
 * @story :
 */
public class LottoServiceImpl implements LottoService {
	private int[][] lottos;
	private int[] lotto;
	private int count;
	LottoBean lot = new LottoBean();

	/*
	 * (non-Javadoc)
	 * 
	 * @see lotto.LottoService#setLottos(lotto.LottoBean)
	 */
	@Override
	public void setLottos(LottoBean lot) {
		// 회전수를 매트릭스로 로또 추첨
		this.count = count(lot);
		this.lottos = new int[count][6];
		this.lotto = new int[6];
		int i = 0;
		if (count < 0) {
			this.lottos = null;
		} else {
			for (count = 0; count < lottos.length; count++) {
				while (true) {
					lot.setNumber();
					int num = lot.getNumber();
					if (isDuplication(count, num)) {
						continue;
					}
					this.lottos[count][i] = num;
					{
						i++;
						if (i == lottos[count].length) {
							i = 0;
							break;
						}
					}
				} 				//while
			}
		}
	}

	@Override
	public int[][] getLottos() {
		// 로또를 가져온다
		return lottos;
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see lotto.LottoService#isDuplication(int, int)
	 */
	@Override
	public boolean isDuplication(int count, int num) {
		// TODO Auto-generated method stub 중복 방지
		for (int i = 0; i < lottos[count].length; i++) {
			if (lottos[count][i] == num) {
				return true;
			}
		}
		return false;
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see lotto.LottoService#sort(int[])
	 */
	@Override
	public void sort(int[] lot) {
		// 오름차순을 정렬 (줄단위로 해당)
		for (int i = 0; i < lot.length - 1; i++) {
			for (int j = 0; j < lot.length - 1; j++) {
				if (lot[j] > lot[j + 1]) {
					int temp =lot[j];	
					lot[j] =lot[j+1];
					lot[j+1] = temp;
					
				}
			}
		}
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see lotto.LottoService#count(lotto.LottoBean)
	 */
	@Override
	public int count(LottoBean lot) {
		// TODO Auto-generated method stub
		return lot.getMoney() / 1000;
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see lotto.LottoService#count(lotto.LottoBean)
	 */

}
