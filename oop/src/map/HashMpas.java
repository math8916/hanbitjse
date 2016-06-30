/**
 * 
 */
package map;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;

/**
 *@date    :2016. 6. 28.
 *@author  :최인철
 *@file    : HashMpas.java
 *@story  :
 */
public class HashMpas {
	public static void main(String[] args) {
	String[] msg ={ "Beril","Dortmunt","Frankfurt","Gelsenkirchen","hamburg"};
	Map<Integer, String> map =new HashMap<Integer, String>();
			for (int i = 0; i < msg.length; i++) 
			map.put(i,msg[i]);
			
			Set<Integer> keys=map.keySet();
			for(Integer n :keys)
			System.out.println(map.get(n));
			
				
			}
	
}
