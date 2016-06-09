/**
 * 
 */
package branch;

import java.util.Scanner;

/**
 * @date   : 2016. 6. 9.
 * @author : 최인철
 * @file_name : Num1.java
 * @story : 
*/
public class Num1 {
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
		String name1="",name2="",name3="";
		int avg1=0,avg2=0,avg3=0;
		
		System.out.println("이름을 입력하시요");
		name1 = scanner.next();
		System.out.println("평균을 입력하시요");
		avg1 = scanner.nextInt();
		
		
		System.out.println("이름을 입력하시요");
		name2 = scanner.next();
		System.out.println("평균을 입력하시요");
		avg2 = scanner.nextInt();
		
		System.out.println("이름을 입력하시요");
		name3 = scanner.next();
		System.out.println("평균을 입력하시요");
		avg3 = scanner.nextInt();
		
		if (avg1>avg2 && avg2>avg3 ) {
			System.out.println("1등"+name1+" "+ avg1+"점");
			System.out.println("2등"+name2+" "+ avg2+"점");
			System.out.println("3등"+name3+" "+ avg3+"점");
		} else if (avg1>avg3 && avg3>avg2) {
			System.out.println("1등"+name1+" "+ avg1+"점");
			System.out.println("2등"+name3+" "+ avg3+"점");
			System.out.println("3등"+name2+" "+ avg2+"점");
		} else if (avg2>avg1 && avg1>avg3) {
			System.out.println("1등"+name2+" "+ avg2+"점");
			System.out.println("2등"+name1+" "+ avg1+"점");
			System.out.println("3등"+name3+" "+ avg3+"점");
		} else if (avg2>avg3 && avg3>avg1) {
			System.out.println("1등"+name2+" "+ avg2+"점");
			System.out.println("2등"+name3+" "+ avg3+"점");
			System.out.println("3등"+name1+" "+ avg1+"점");
		} else if (avg3>avg1 && avg1>avg2) {
			System.out.println("1등"+name3+" "+ avg3+"점");
			System.out.println("2등"+name1+" "+ avg1+"점");
			System.out.println("3등"+name2+" "+ avg2+"점");
		} else  {
			System.out.println("1등"+name3+" "+ avg3+"점");
			System.out.println("2등"+name2+" "+ avg2+"점");
			System.out.println("3등"+name1+" "+ avg1+"점");
		

		

		}
		
	}
}
