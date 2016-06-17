/**
 * 
 */
package exam;

import java.text.SimpleDateFormat;
import java.util.Date;

/**
 * @date   : 2016. 6. 17.
 * @author : 최인철
 * @file_name : whatTimeIsItNow.java
 * @story : 
*/
public class whatTimeIsItNow {
	public static void main(String[] args) {
/*		long time = System.currentTimeMillis();
		System.out.println(time);
		Date date= new Date(time);
		System.out.println(date);
		SimpleDateFormat sdf= new SimpleDateFormat("yyyy-MM-dd hh:mm:ss");
		sdf.format(date);
		System.out.println(sdf.format(date));*/
		
		String now = new SimpleDateFormat("yyyy-MM-dd").format(new Date(System.currentTimeMillis()));
		System.out.println(now);
		String[] arr =now.split("-");
		String year =arr[0];
		System.out.println(year);
/*		
		for (int i = 0; i < arr.length; i++) {
			System.out.println(arr[i]);
			
*/
		for (String string : arr) {
			System.out.println(string);
		}
	}
}
