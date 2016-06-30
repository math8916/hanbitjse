/**
 * 
 */
package collection;

import java.util.HashSet;
import java.util.Set;
import java.util.TreeSet;

import school.StudentBean;

/**
 * @date   : 2016. 6. 23.
 * @author : 최인철
 * @file_name : QueueExe.java
 * @story : 
*/
public class QueueExe {
	public static void main(String[] args) {
		// String[] str ={"Java","Beans","java","XML"};
		
		Set<StudentBean> stu = new HashSet<StudentBean>();
		StudentBean hong =new StudentBean("hong","1", "홍길동","700814-1");
		StudentBean kim =new StudentBean("kim","1", "김길동","750814-1");
		StudentBean lee=new StudentBean("lee","1", "lee길동","705814-1");
		
		stu.add(hong);
		stu.add(kim);
		stu.add(lee);
		
		
			System.out.println(stu.toString());
		}
			

		
}
