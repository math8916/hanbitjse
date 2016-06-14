/**
 * 
 */
package loop;

import java.util.Scanner;

/**
 * @date : 2016. 6. 14.
 * @author : 최인철
 * @file_name : WhileLoopBase.java
 * @story :
 */
public class WhileLoopBase {
	public static void main(String[] args) {
Scanner scanner = new Scanner(System.in);

		while (true) {
			System.out.println("메뉴를 선택하세요");
			System.out.println("1. 출력 2.종료 ");
			switch (scanner.nextInt()) {
			case 1:
				for (int i = 0; i <10; i++) {
					System.out.printf("%d",(i+1));
					break;
				}
			case 2:
					System.out.printf("종료합니다");
				
				return;
			default:
				System.out.println("다시 입력하시오");
				break;
			
		
			}
		}
}
}
