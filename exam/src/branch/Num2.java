/**
 * 
 */
package branch;

import java.util.Iterator;
import java.util.Scanner;

/**
 * @date   : 2016. 6. 9.
 * @author : 최인철
 * @file_name : Num1.java
 * @story : 
*/
public class Num2 {
/*
 * 저희반은 학생수가 3명입니다.
 * 학생의 평균 점수는 0~100점 사이입니다.
 * 동점은 없습니다.
 * 1등 홍길동
 * 2등 김유신
 * 3등 김구
 * 이렇게 나오도록 해주세요
 * 학생이름은 스캐로 입력받습니다.
 * 1등 김구 90점
 * 2등 김유신 80점
 * 3등 홍길동 49점
 * */
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		String name="",name1="",name2="",name3="",gradeN1="",gradeN2="",gradeN3="";
		int avg=0,avg1=0,avg2=0,avg3=0,gradeA1=0,gradeA2=0,gradeA3=0;
		
		for (int i = 1; i < 3; i++) {
			System.out.print("이름과 점수를 입력하시요 :");
			name = scanner.next();
			avg = scanner.nextInt();
			
		}
		
		
		
		System.out.print("이름을 입력하시요 :");
		name2 = scanner.next();
		System.out.println("평균을 입력하시요");
		avg2 = scanner.nextInt();
		
		System.out.print("이름을 입력하시요 :");
		name3 = scanner.next();
		System.out.println("평균을 입력하시요");
		avg3 = scanner.nextInt();
		
		if (avg1>avg2 && avg2>avg3 ) {
			gradeN1=name1;
			gradeA1=avg1;
			gradeN2=name2;
			gradeA2=avg2;
			gradeN3=name3;
			gradeA3=avg3;
			
		} else if (avg1>avg3 && avg3>avg2) {
			gradeN1=name1;
			gradeA1=avg1;
			gradeN2=name3;
			gradeA2=avg3;
			gradeN3=name2;
			gradeA3=avg2;
		} else if (avg2>avg1 && avg1>avg3) {
			gradeN1=name2;
			gradeA1=avg2;
			gradeN2=name1;
			gradeA2=avg1;
			gradeN3=name3;
			gradeA3=avg3;
		} else if (avg2>avg3 && avg3>avg1) {
			gradeN1=name2;
			gradeA1=avg2;
			gradeN2=name3;
			gradeA2=avg3;
			gradeN3=name1;
			gradeA3=avg1;
		} else if (avg3>avg1 && avg1>avg2) {
			gradeN1=name3;
			gradeA1=avg3;
			gradeN2=name1;
			gradeA2=avg1;
			gradeN3=name2;
			gradeA3=avg2;
		} else  {
			gradeN1=name3;
			gradeA1=avg3;
			gradeN2=name2;
			gradeA2=avg2;
			gradeN3=name1;
			gradeA3=avg1;
		}
			System.out.println("1등 :"+gradeN1+" "+ gradeA1+"점");
			System.out.println("2등 :"+gradeN2+" "+ gradeA2+"점");
			System.out.println("3등 :"+gradeN3+" "+ gradeA3+"점");
		
		}
		
	
}
