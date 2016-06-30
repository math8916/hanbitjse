/**
 * 
 */
package series;

/**
 * @date   : 2016. 6. 15.
 * @author : 최인철
 * @file_name : Series01.java
 * @story : 
*/

public class Series01 {
	public static void main(String[] args) {
		/**
		 * 1+2+4+7+11+16+...의 순서로 
		 * 나열되는 수열의 
		 * 20번째 항까지의 합계
		 * for문 사용
		 * */
		int i=0, j=0,sum=1, sum1=0;
		for (i = 0; i < 20; i++) {
			sum = sum+i;
			sum1 +=sum;
		//	System.out.println(j);
				
	//		}
		}
	System.out.println(sum1);		
		
	}
}