/**
 * 
 */
package matrix;

/**
 * @date   : 2016. 6. 22.
 * @author : 최인철
 * @file_name : Gugudan.java
 * @story : 
*/
public class Gugudan {
	public static void main(String[] args) {
		for (int i = 1; i < 10; i++) {
			for (int j = 2; j < 6; j++) {
				System.out.print( j+"*"+i+"="+ j*i+"\t");
			}
			
		System.out.println("");
		}
		System.out.println("");
		System.out.println("");
		for (int i = 1; i < 10; i++) {
			for (int j = 6; j < 10; j++) {
				System.out.print( j+"*"+i+"="+ j*i+"\t");
			}
			
		System.out.println("");
		}
	}
}
