/**
 * 
 */
package controller;

import java.util.Scanner;

/**
 * @date   : 2016. 6. 9.
 * @author : 최인철
 * @file_name : MonthEnd.java
 * @story : 
*/
public class MonthEnd {
/**
 * 개발자 년,월을 입력하면 말일인지 알려 주는 프로그램
 *  단) 윤년 2월은 29일로 한정함 , 나머지 해는 28일로 마감합니다.
 *  1~12를 벗어난 숫자를 입력하면
 *  잘못된 입력값입니다.라고 뜬다 
 *  **/
	
	/**
	 * 윤년의 조건 
	 * 연도를 4로 나눈값이 0이면 윤년일 수 있다
	 * 그러나 해당 연수가 100으로 나누어 떨어지면 평년이다.
	 * 2000년은 4로 나눈값이 0이지만 100으로 나누어 떨어져 평년이다.
	 * 평년이라도 400으로 나누어 떨어지면 년도는 윤년이다.
	 * */
		public String judg3(int inputyear,int inputmonth){
		 int day=0 ;
		 int year=inputyear;
		 int month=inputmonth;
		 
		  
		  switch (month) {
		  

		  case 1:case 3:case 5:case 7:case 8:case 10:case 12:
			day = 31;
		
			break;
		case 4:case 6:case 9:case 11:
			day = 30;
			break;
		case 2:
				day =(year%4==0 && year%100 !=0  || year%400==0)? 29:28;
			break;

		default:
			System.out.println("1-12사이만 입력하시오");
			break;
		}


		 return year+"년"+month+"월"+day+"일";
	}
	
}