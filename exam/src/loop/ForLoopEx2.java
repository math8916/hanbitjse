/**
 * 
 */
package loop;

/**
 * @date : 2016. 6. 13.
 * @author : 최인철
 * @file_name : ForLoopEx.java
 * @story : 3의 배수를 제외한 1 부터 10까지 수열은(단 공차는 1) (단 not 사용금지 if-else 사용금지
 */
public class ForLoopEx2 {
	public static void main(String[] args) {
		int i = 0;
		for (i = 0; i <= 10; i++) {
			if (i % 3 == 0)		{
				continue;
			}
			
			System.out.print(i+"\n");
		
		}
		// System.out.printf("3의 배수를 합은 %d 제외한 급수는 %d", mul, sum);
	System.out.println("for loop의 바깥");
	}
}
	

