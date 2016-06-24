/**
 * 
 */
package lotto;

/**
 * @date   : 2016. 6. 24.
 * @author : 최인철
 * @file_name : LottoballService.java
 * @story : 
*/
public interface LottoBallService {
	public void setLottoBall(LottoBean lot);
	public int[] getLottoBall();
	public boolean isDuplication(int num);
	

}
