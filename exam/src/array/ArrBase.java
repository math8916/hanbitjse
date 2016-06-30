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
	
	

	int i = 0; // 바깥으로 나오며 메모리 처리 속도 증가
	for ( ;i <avg.length; i++) {
		System.out.println("이름,점수 입력");
		name[i]=scanner.next();
		avg[i] =scanner.nextInt();
	}
	
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
	

		
	for (int j= 0; j <avg.length; j++) {
		

			System.out.printf("%d 등는 %s 이고 %d \n",j+1,grade[j],score[j] );
		}
}

}

