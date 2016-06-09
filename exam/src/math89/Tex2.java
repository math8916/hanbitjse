/**
 * 
 */
package math89;

import java.util.Scanner;

/**
 * @date   : 2016. 6. 8.
 * @author : 최인철
 * @file_name : Tex2.java
 * @story : 
*/
public class Tex2 {
public static void main(String[] args) {
	Scanner scanner = new Scanner(System.in);
	int sal=0,tax=0;
	
	System.out.println("이름");
	String name = scanner.next();
	
	System.out.println("연봉");
	sal = scanner.nextInt();
	
	System.out.println("세율");
	double taxRate =scanner.nextDouble();
	
	tax = (int) (sal*taxRate);
	
	System.out.println(name+sal+tax);
	
	
}
}
