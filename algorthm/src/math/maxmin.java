/**
 * 
 */
package math;

import java.util.Scanner;

import com.sun.glass.ui.Screen;

/**
 * @date : 2016. 6. 14.
 * @author : 최인철
 * @file_name : Num1.java
 * @story :
 */
public class maxmin {
	/**
	 * 학생수는 입력 받습니다 학생의 점수만 입력해서 최고점과 최저점만 출력하시오.
	 * 
	 * 최고 점수는 : xxxx 최저 점수는 :
	 */

	public String cmax(int[] score) {

		int max = 0, min = 101, i=0;
		
	
		for (; i < score.length; i++) {
			if (score[i] > max) {
				max = score[i];
			} 
			if (score[i] < min) {
				min = score[i];
			}
		}
		return "최고점수"+max+"  최저 점수는 " +min;

	}
}
