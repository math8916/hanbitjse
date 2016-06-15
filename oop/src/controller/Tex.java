/**
 * 
 */
package controller;

import java.util.Scanner;

/**
 * @date   : 2016. 6. 8.
 * @author : 최인철
 * @file_name : Tex.java
 * @story : 
*/
public class Tex {
	
		/**
		 * 클라이언트에서 프로그램 개발 요청이 왓습니다.
		 * 이름과 연봉을 입력받아서
		 * 연봉 ***만원을 받으시는 xxx께서는 납부할 세금은 ????만원입니다.
		 * 로 출력하는 프로그램을 만들어 주세요
		 * 단) 세율이 정책에 바꿀 때 마다 변하니
		 * 관리자가 쉽게 적용가능하도록 만들어 주세요
		 * 현재는 서울이 9.7프로라고 합니다 만약 세율이 바꾸면 세율을 적용바랍니다.
		 */
		  
		public String ctex(String inputname, int inputsal,int inputans,double inputtaxRate) {
			int sal=0, ans=0, tax=0;
			double taxRate=0.0;
			String name=inputname;
			sal= inputsal;
			ans= inputans;
				
		if (ans > 0) {
			taxRate=0.097;

		} else  {
			System.out.println("그럼 바뀐세율을 입력바랍니다");
			taxRate = inputtaxRate;
		}		
		tax = (int) (sal * taxRate);
		return "연봉 " + sal + "만원을 받으시는 " + name + "께서는 납부할" + " 세금은" + tax + "만원입니다.";
			
		}

}