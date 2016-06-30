/**
 * 
 */
package controller;

import java.util.Scanner;

/**
 * @date   :2016. 6. 9. 
 * @author :pakjkwan@gmail.com
 * @file   :Num1.java
 * @story  :
*/
public class Num1_1 {
	/**
	 * 저희 반은 학생수가 3명입니다.
	 * 학생의 평균점수는 0~100점사이입니다.
	 * 3명의 평균점수를 입력하면
	 * 1등 홍길동
	 * 2등 김유신
	 * 3등 김구
	 * 이렇게 나오도록 해주세요.동점은 없습니다.
	 * 단, 학생이름은 스캐너로 입력받습니다.
	 * 홍길동
	 * 49
	 * 김유신
	 * 78
	 * 김구
	 * 96
	 * ==============
	 * 1등 김구 96점
	 * 2등 김유신 78점
	 * 3등 홍길동 49점
	 * ==============
	 * */
	public String judg1(String nameI1,int inputavg1,String nameI2,int inputavg2,String nameI3,int inputavg3) {
		String name1="",name2="",name3="";
		name1=nameI1;
		name2=nameI2;
		name3=nameI3;
		int avg1=inputavg1 , avg2=inputavg2 , avg3=inputavg3 =0, gradeA1=0,gradeA2=0,gradeA3=0;
		String grade1="",grade3="",grade2="";
		
		
		
		if (avg1>avg2&&avg2>avg3) {
			grade1=name1;
			grade2=name2;
			grade3=name3;
			gradeA1=avg1;
			gradeA2=avg2;
			gradeA3=avg3;
		} else if(avg1>avg2&&avg3>avg2){
			grade1=name1;
			grade2=name3;
			grade3=name2;
			gradeA1=avg1;
			gradeA2=avg3;
			gradeA3=avg2;
		}else if(avg2>avg1&&avg1>avg3)
			{
		grade1=name2;
		grade2=name1;
		grade3=name3;
		gradeA1=avg2;
		gradeA2=avg1;
		gradeA3=avg3;}
		else if(avg2>avg1&&avg3>avg1){
			
		
		grade1=name2;
		grade2=name3;
		grade3=name1;
		gradeA1=avg2;
		gradeA2=avg3;
		gradeA3=avg1;
		}else if(avg3>avg1&&avg1>avg2){
			grade1=name3;
			grade2=name1;
			grade3=name2;
			gradeA1=avg3;
			gradeA2=avg1;
			gradeA3=avg2;
		}else if(avg3>avg1&&avg1>avg2){
			grade1=name3;
			grade2=name1;
			grade3=name2;
			gradeA1=avg3;
			gradeA2=avg1;
			gradeA3=avg2;}
		
			{
		
				
			}
			return "1등:"+grade1+"점수는"+gradeA1 + "2등:"+grade2+"점수는"+gradeA2+"3등+"+grade3+"점수는"+gradeA3;
			
	}
	
}