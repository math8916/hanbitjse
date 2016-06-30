/**
 * 
 */
package branch;

import java.util.Scanner;

/**
 * @date : 2016. 6. 8.
 * @author : 최인철
 * @file_name : Calc.java
 * @story :
 */
public class Calc2 {
	/*
	 * 두개의 정수를 입력받아서 numRuslt 값이 1이면 덧셈 2이면 뺄셈 3면 곱셈 4면 나누셈
	 */
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int x1 = 0, x2 = 0, x = 0, count = 0;
		String numRuslt2 = "";
		// ---------------------------------------------------------
		System.out.print("정수1 의 값을 입력하시오 :");
		x1 = scanner.nextInt();

		System.out.print("덧셈 1 , 뺄셈 2 , 곱셉 3 ,나눗셈 4 나머지 5 를 입력하세요");
		count = scanner.nextInt();

		System.out.println("정수2 의 값을 입력하시오 :");
		x2 = scanner.nextInt();

		switch (count) {
		case 1:
			x = x1 + x2;
			numRuslt2 = "+";
			break;
		case 2:
			x = x1 - x2;
			numRuslt2 = "-";
			break;
		case 3:
			x = x1 * x2;
			numRuslt2 = "*";
			break;
		case 4:
			x = x1 / x2;
			numRuslt2 = "/";
			break;
		case 5:
			x = x1 % x2;
			numRuslt2 = "%";
			break;

		default:
			System.out.println("1-5까지 다시 입력 하세요");
			return;

		}
	
		
	//---------------------------------------------------------
	System.out.println(x1+numRuslt2+ x2 +" = " +x );
}
}

