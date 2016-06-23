/**
 * 
 */
package collection;

import java.util.List;
import java.util.Vector;

/**
 * @date   : 2016. 6. 23.
 * @author : 최인철
 * @file_name : ListExe.java
 * @story : 
*/
public class VectorExe {
public static void main(String[] args) {
	List<String> v= new Vector<String>(2,5);
	System.out.println("    Vector ===========");
	System.out.println("size"+v.size());
	
	v.add("박지성");
	v.add("박  성");
	v.add("박 1 성");
	v.add("박 2 성");
	
	System.out.println("    요소 추가후 ===========");
	System.out.println("size"+v.size());

}
}
