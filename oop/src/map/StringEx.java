/**
 * 
 */
package map;

/**
 *@date    :2016. 6. 29.
 *@author  :최인철
 *@file    : StringEx.java
 *@story  :
 */
public class StringEx {
	public static void main(String[] args) {
		String name1= "홍길동:";
		String name2= "홍길동:";
		
		if (name1.equals(name2)) {
			System.out.println("name1==name2 는 true");
		}else{
			System.out.println("name1==name2 는 false");
		}
		String name3=new String( "홍길동:");
		String name4=new String( "홍길동:");
		
		if (name3.equals(name4)) {
			System.out.println("name3==name4 는 true");
		}else{
			System.out.println("name3!=name4 는 false");
		}
	
	}
}
