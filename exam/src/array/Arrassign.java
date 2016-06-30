/**
 * 
 */
package array;

import java.util.Scanner;

/**
 * @date : 2016. 6. 14.
 * @author : 최인철
 * @file_name : Arrassign.java
 * @story :
 */
public class Arrassign {
	public static void main(String[] args) {
		/**
		 * 전교생이 5명인 학생의 이름과 나이를 입력받고 이것을 이것을 출력하세요. 전교생 입력받고 이것을 출려하시오
		 */
		Scanner scanner = new Scanner(System.in);
		int i = 0, c = 0;

		System.out.println("학생수가 몇명입니까 ?");
		c = scanner.nextInt();

		int[] old = new int[c];
		int[] hakbun = new int[c];
		int[] sn = new int[c];
		String[] name = new String[c];

		System.out.println("학생 이름과 나이를 입력하시오");
		for (; i < old.length; i++) {

			name[i] = scanner.next();
			old[i] = scanner.nextInt();

		}
		System.out.println("================================== \n");
		System.out.println("학번    |   이름  |      나이 \n");
		System.out.println("================================== \n");
		for (i = 0; i < old.length; i++) {
			c += 1;

			System.out.printf("%d           %s        %d \n", c, name[i], old[i]);
		}
	}
}
