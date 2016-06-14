/**
 * 
 */
package array;

import java.util.Scanner;

/**
 * @date   : 2016. 6. 14.
 * @author : 최인철
 * @file_name : ArrBase.java
 * @story : 배열의 기초  
*/
public class ArrBase {
public static void main(String[] args) {
	Scanner scanner = new Scanner(System.in);
	int[]avg =new int[3];
	avg[0]=0; avg[1]=0 ;avg[2]=0;
	int[]score =new int[3];
	score[0]=0; score[1]=0; score[2]=0;
	
	String[]name =new String[3];
	name[0]=""; name[1]="";name[2]="";
	String[]grade =new String[3];
	grade[0]="";grade[1]="";grade[2]="";
	
	System.out.println("이름,점수 입력");
	name[0]=scanner.next();
	avg[0] =scanner.nextInt();
	System.out.println("이름,점수 입력");
	name[1]=scanner.next();
	avg[1] = scanner.nextInt();
	System.out.println("이름,점수 입력");
	name[2]=scanner.next();
	avg[2] = scanner.nextInt();
	
	
	if (avg[0]>avg[1]&&avg[1]>avg[2]) {
		grade[0]=name[0];
		grade[1]=name[1];
		grade[2]=name[2];
		score[0]=avg[0];
		score[1]=avg[1];
		score[2]=avg[2];
	} else if(avg[0]>avg[1]&&avg[2]>avg[1]){
		grade[0]=name[0];
		grade[1]=name[2];
		grade[2]=name[1];
		score[0]=avg[0];
		score[1]=avg[2];
		score[2]=avg[1];
	}else if(avg[1]>avg[0]&&avg[0]>avg[2])
		{
	grade[0]=name[1];
	grade[1]=name[0];
	grade[2]=name[2];
	score[0]=avg[1];
	score[1]=avg[0];
	score[2]=avg[2];}
	else if(avg[1]>avg[0]&&avg[2]>avg[0]){
		
	
	grade[0]=name[1];
	grade[1]=name[2];
	grade[2]=name[0];
	score[0]=avg[1];
	score[1]=avg[2];
	score[2]=avg[0];
	}else if(avg[2]>avg[0]&&avg[0]>avg[1]){
		grade[0]=name[2];
		grade[1]=name[0];
		grade[2]=name[1];
		score[0]=avg[2];
		score[1]=avg[0];
		score[2]=avg[1];
	}else if(avg[2]>avg[0]&&avg[0]>avg[1]){
		grade[0]=name[2];
		grade[1]=name[0];
		grade[2]=name[1];
		score[0]=avg[2];
		score[1]=avg[0];
		score[2]=avg[1];}
	
		{
	
			System.out.println("1등는"+grade[0]+"점수는"+score[0] );
			System.out.println("2등는+"+grade[1]+"점수는"+score[1] );
			System.out.println("3등는+"+grade[2]+"점수는"+score[2] );
		}


}
}
