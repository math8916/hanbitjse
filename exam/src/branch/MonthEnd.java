/**
 * 
 */
package branch;

import java.util.Scanner;

/**
 * @date   : 2016. 6. 9.
 * @author : 최인철
 * @file_name : MonthEnd.java
 * @story : 
*/
public class MonthEnd {
/**
 * 월을 입력하면 말일인지 알려 주는 프로그램
 *  단) 2월은 29일로 한정함
 *  1~12를 벗어난 숫자를 입력하면
 *  잘못된 입력값입니다.라고 뜬다 
 *  **/
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		 int day=0;
		 
		 System.out.print("월을 입력하시오");
		 
		 switch (scan.nextInt()) {
		case 1:case 3:case 5:case 7:case 8:case 10:case 12:
			day = 31;
		
			break;
		case 4:case 6:case 9:case 11:
			day = 30;
			break;
		case 2:
			day = 28;
			break;
			
		default:
			System.out.println("1-12사이만 입력하시오");
			return;
		}
		 System.out.println(" 월"+day+"일");
	} // main end
	
} // Class end