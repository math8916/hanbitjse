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
public class Gugudan2 {
	public static void main(String[] args) {
		for (int i = 2; i < 10; i++) {
			for (int j = 2; j < 10; j++) {
				for (int j2 = 1; j2 < 10; j2++) {
				
				System.out.print(i+"  "+j2+"*"+j+"="+ j*i+"\t");
			}
		System.out.println("");
		}
		
	}
}
}