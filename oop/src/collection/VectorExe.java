/**
 * 
 */
package collection;

import java.util.List;
import java.util.Vector;

import school.StudentBean;

/**
 * @date : 2016. 6. 23.
 * @author : 최인철
 * @file_name : ListExe.java
 * @story :
 */
public class VectorExe {
	public static void main(String[] args) {
		List<StudentBean> v = new Vector<StudentBean>();

		StudentBean hong = new StudentBean("hong", "1", "홍길동", "700814-1");
		StudentBean kim = new StudentBean("kim", "1", "김길동", "750814-1");
		StudentBean lee = new StudentBean("lee", "1", "lee길동", "705814-1");
		System.out.println("    Vector ===========");
		System.out.println("size" + v.size());

		v.add(hong);
		v.add(kim);
		v.add(lee);

		System.out.println("    요소 추가후 ===========");
		System.out.println("size" + v.size());
//		System.out.println(v.toString());
		for (int i = 0; i < v.size(); i++) {
			System.out.println(v.get(i).getName());
		}
	}
}
