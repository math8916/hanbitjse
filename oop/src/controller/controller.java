/**
 * 
 */
package controller;

import java.util.Scanner;

import javax.swing.JOptionPane;

/**
 * @date   : 2016. 6. 15.
 * @author : 최인철
 * @file_name : controller.java
 * @story : 
*/
public class controller {
	public static void main(String[] args) {
		Scanner s =new Scanner(System.in);
		Calc jCalc = new Calc(); 
		Num1 jNum1 = new Num1();
		while (true) {
			System.out.println("메뉴"
					+ "1. 계산기"
					+ "2  카우푸"
					+ "3. 학생수?"
					+ "0. 종료");
			switch (s.next()) {
			case "1":
				System.out.println("inputNum1,opcode,inputNum2 입력하시오");
				System.out.println(jCalc.cCalc(s.nextInt(),s.next(),s.nextInt()));
				break;
			
			case "2":break;
			
			case "3":
				System.out.println("학생수");
				int[] score = new int[s.nextInt()];
				System.out.println("점수");
				for (int i = 0; i < score.length; i++) {
					score[i] = s.nextInt();
				}
				System.out.println(jNum1.cmax(score));
				break;
			case "0":
			JOptionPane.showConfirmDialog(null, "Closeing ok?");
			break;
			default:
				break;
			}
		}

	}
}
