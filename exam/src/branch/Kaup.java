/**
 * 
 */
package branch;

import java.util.Scanner;

/**
 * @date   : 2016. 6. 10.
 * @author : 최인철
 * @file_name : Kaup.java
 * @story : 카우푸 지수 구하는 프로그램
 *  
*/
public class Kaup {
/*
 * 개발자님 프로그램 제작의뢰 입니다.
 * 비만지수를 구하는 것인데요
 * 키와 몸무게를 입력하면 당사자가
 * 비만ㅇ니지 저체중인 알려주는 
 * 프로그램을 만들어 주세요
 * 돈은 입금 했습니다.
 * 잘은 모르는데 ㅏkauo 공식을 쓰면
 * 된다고 하네요
 * * **/
	
	public static void main(String[] args) {
	Scanner scanner = new Scanner(System.in);
	
	double  weight = 0.0, tall = 0.0 , kaup=0.0;
	String name = "",result ="";
		
		System.out.println("이름을 입력하시오 :");
	    name = scanner.next();
	    
	    System.out.println("몸무게 입력하시오 Kg :");
	    weight = scanner.nextDouble();
	    
	    System.out.println("키를 입력하시오 cm :");
	    tall = scanner.nextDouble();
	    // 공식 부분 
	    kaup =weight/(tall/100)/(tall/100) ;
	    		
	    if (kaup<18.5) { 
	    	result = "저체중 ";
			
		} else if ( kaup >= 18.5 && kaup <22.9 ) {
			result = "정상체중";
		
		} else if ( kaup >= 23.0 && kaup <24.9 ) {
			result = "위험체중";
		
		} else if ( kaup >= 25.0 && kaup <29.9 ) {
			result = "비만 1단계";
		
		} else if ( kaup >= 30.0 && kaup <39.9 ) {
			result = "비만 2단계";
			
		} else if ( kaup >= 40 ) {
			result = "비만 3단계";
		return;
		}
	    
	    {
			System.out.println(name +" 는 "+ result + "입니다"+kaup);
		}
}
}
