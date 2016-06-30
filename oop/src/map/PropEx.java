/**
 * 
 */
package map;

import java.util.ArrayList;
import java.util.Enumeration;
import java.util.List;
import java.util.Properties;


/**
 *@date    :2016. 6. 29.
 *@author  :최인철
 *@file    : MapEx.java
 *@story  :
 */
public class PropEx {
	public static void main(String[] args) {
		Properties prop = new Properties();
		prop.put("신촌역","서울특별시 마포구 신촌로 90");// alias
		prop.put("kim","김유신");
		prop.put("lee","홍길동");
		prop.put("park","박길동");
		List<String> list = new ArrayList<String>();
		Enumeration keys = prop.propertyNames();
		while (keys.hasMoreElements()) {
	//		list.add(String) keys.nextElement());
		}
		}
}
