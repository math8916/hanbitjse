/**
 * 
 */
package array;

import java.util.Scanner;

import com.sun.glass.ui.Screen;

/**
 * @date : 2016. 6. 14.
 * @author : 최인철
 * @file_name : Num1.java
 * @story :
 */
public class Num1 {
	/**
	 * 학생수는 입력 받습니다 학생의 점수만 입력해서 최고점과 최저점만 출력하시오.
	 * 
	 * 최고 점수는 : xxxx 최저 점수는 :
	 */

	public static void main(String[] args) {

		Scanner scanner = new Scanner(System.in);

		int counter = 0,j=0,max=0,min=101;
		System.out.println("학생수가 몇명입니까 ?");
		counter = scanner.nextInt();

		int[] score = new int[counter];
		System.out.println("학생의 점수를 입력 하시오");
		for (int i = 0; i < score.length; i++) {
			score[i] = scanner.nextInt();
			
			if (score[i]>max) {
				max=score[i];				
			}
			else if (score[i]<min) {
				min=score[i];
			}
		}
		System.out.printf("최고점수  %d   최저 점수는 %d \n",max,+min);			
				
			

		}
}
