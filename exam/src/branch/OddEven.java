/**
 * 
 */
package branch;

import java.util.Random;
import java.util.Scanner;

/**
 * @date : 2016. 6. 10.
 * @author : 최인철
 * @file_name : OddEven.java
 * @story :
 */
public class OddEven {
	/*
	 * 개발자님 홀짝 게임하나 만들어 주세요 사용자가 홀인지 짝인지 
     * win 틀리면 lose가 출려되면 됩니다.
	 **/

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		Random random = new Random();
		int ran = random.nextInt(10) + 1; // 10 까지만 나오게 한다 실제로 9까지 나오와 +1 증가)
		int slect = 0, userNum = 0;
		String result = "Lose";
		System.out.println("개발자만 보이는 화면");
		System.out.println(ran);

		System.out.println("돈을 거시는는 짝이라고 생각 하면[0]을 " + "홀이라고 생각하면[1]을 입력하시오");
		userNum = scanner.nextInt();

		if (userNum == ran % 2) {
			result = "win";
		}
		System.out.println(result);

	}
}
