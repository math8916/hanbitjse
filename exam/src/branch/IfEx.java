/**
 * 
 */
package branch;

import java.util.Scanner;

/**
 * @date   : 2016. 6. 8.
 * @author : 최인철
 * @file_name : IfEx.java
 * @story : Branch 구문예제
*/
public class IfEx {
public static void main(String[] args) {
	Scanner scanner = new Scanner(System.in);
	System.out.println("정수값을 하나 입력 하세요");
	int input=scanner.nextInt();
	if (input>=10) {
			System.out.println("입력된 정수값이 "+input+"는 10보다 큽니다");
		} else {
			System.out.println("입력된 정수값이 "+input+"는 10보다 작거나 같습니다");
		}
}
}
