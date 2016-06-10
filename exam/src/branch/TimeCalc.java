/**
 * 
 */
package branch;

import java.util.Scanner;

/**
 * @date : 2016. 6. 10.
 * @author : 최인철
 * @file_name : TimeCalc.java
 * @story : 초를 가지고 시간 분 초로 환산하기
 */
public class TimeCalc {
	/**
	 * 개발자님 타이머로 작업시간을 기록하고 있는데요 결과가 50000초로 나오네요 그런데 이게 감이 잘 안 와서요 시간 분 초로 나우러
	 * 보게 해주세요 예를 들면 50000초가 입력 괸면 출력은 25시간 20분 30초
	 */
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);

		System.out.println("시간을 입력하세요 :");
		int second = scanner.nextInt();

		System.out.println((second / 3600) + "시간" + (second / 60) % 60 + "분" + (second % 60) + "초");
	}
}
