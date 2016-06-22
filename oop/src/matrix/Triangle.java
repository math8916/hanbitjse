/**
 * 
 */
package matrix;

/**
 * @date   : 2016. 6. 22.
 * @author : 최인철
 * @file_name : Triangle.java
 * @story : 
*/
public class Triangle {
public static void main(String[] args) {
	for (int i = 1; i <= 5; i++) {
		for (int j = 5; j >0; j--) {
			if (i<j) {
				System.out.print(" ");	
			}else {
				 System.out.print(j);
			}
		}	
			
			System.out.println();
		}
	
	}
}

