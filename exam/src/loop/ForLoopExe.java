/**
 * 
 */
package loop;

/**
 * @date   : 2016. 6. 14.
 * @author : 최인철
 * @file_name : ForLoopExe.java
 * @story : int =0 , limit=0 ,diff=2 reverse seq 
*/
public class ForLoopExe {
	public static void main(String[] args) {
	int i=10,sum=0;
	for (; i > -1; i-=2) { // 역수열인 경우 limit 조건에 유의 한다) 
		System.out.printf("%d\t",i);
		// sum +=i ;
		
	}
	// System.out.println("\n"+sum);
}
}
