/**
 * 
 */
package math89;

import java.util.Scanner;

/**
 * @date   : 2016. 6. 8.
 * @author : 최인철
 * @file_name : Result.java
 * @story : 
*/
public class Result {
	/**
	 * 클라이언트에서 프로그래 개발 요청이 왓습니다.
	 * 이름과 국,영,수,세과목 점수를 입력받아서
	 * [홍기동 : 총정 ***점 , 평균 ***점]
	 * 을 출력하는 프로그램을 만들어 주세요.
	 * 단) 평균은 소수점이하는 절삭합니다.
	 */
	
	public static void main(String[] args) {
		Scanner scanner =new Scanner(System.in);
		int kor=0, eng=0,math=0,total=0, ave=0;
		String name ="";
		System.out.println("이름 : [ ]");
		name = scanner.nextLine();
		
		System.out.println("국어점수 :  영어  수학");
		kor = scanner.nextInt();
		eng = scanner.nextInt();
		math = scanner.nextInt();
		
		total = kor + eng +math;
		
		ave = total / 3 ;
		
		System.out.println("["+name+"]" + "총점"+total+"평균" + ave+"점");
		
	}



}
