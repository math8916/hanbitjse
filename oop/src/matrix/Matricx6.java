/**
 * 
 */
package matrix;

/**
 * @date : 2016. 6. 22.
 * @author : 최인철
 * @file_name : Matricx5.java
 * @story :
 */
public class Matricx6 {
	public static void main(String[] args) {
		int z = 1, k = 5;
		for (int i = 1; i < 10; i++) {
			for (int j = 1; j < 10; j++) {
				int result = i*j;
				System.out.print(j + "*"+ i+"="+ result+ "\t");
			}
			System.out.println("");
		}
	}
}
