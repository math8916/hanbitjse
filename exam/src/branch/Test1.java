/**
 * 
 */
package branch;

import java.util.Scanner;

/**
 * @date   : 2016. 6. 8.
 * @author : 최인철
 * @file_name : Test1.java
 * @story : 
*/
public class Test1 {
	/**
	 * 클라이언트에서 프로그램 개발 요청이 왓습니다.
	 * 이름과 연봉을 입력받아서
	 * 연봉 ***만원을 받으시는 xxx께서는 납부할 세금은 ????만원입니다.
	 * 로 출력하는 프로그램을 만들어 주세요
	 * 단) 세율이 정책에 바꿀 때 마다 변하니
	 * 관리자가 쉽게 적용가능하도록 만들어 주세요
	 * 현재는 서울이 9.7프로라고 합니다 만약 세율이 바꾸면 세율을 적용바랍니다.
	 */
public static void main(String[] args) {
	Scanner scanner = new Scanner(System.in);
	int sal =0,ans=0,tax=0;
	double taxRate =0.0;
	 System.out.println("이름을 입력하세요 : ");
	 String name= scanner.next();
	 
	 System.out.println("연봉을 입력 :");
	 sal = scanner.nextInt();
	 
	 System.out.println("세율이 변했으면 1을 안변했으면 2을 입력하세요");
	 ans = scanner.nextInt();
	 if (ans ==1) {
		taxRate = 0.097;
		
	} else {
		System.out.println("변동된 세율을 입력하세요 : ");
		taxRate =scanner.nextDouble();
		
	}
	 tax = (int) (sal * taxRate) ;
		System.out.println("연봉 "+sal+"만원을 받으시는 "+name+"께서는 납부할 세금은 "+tax+"만원입니다.");	

}
}
