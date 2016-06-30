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
//		StudentBean searchTest =null;
		StudentBean searchMan = new StudentBean();
		StudentBean searchMan2 = new StudentBean();
		StudentBean hong = new StudentBean("hong", "1", "홍길동", "700814-1");
		StudentBean kim = new StudentBean("kim", "1", "이순신", "750814-1");
		StudentBean lee = new StudentBean("lee", "1", "이순신", "705814-1");
	
//		System.out.println("    Vector ===========");
//		System.out.println("size" + v.size());
//		searchMan =null;
		v.add(hong);
		v.add(kim);
		v.add(lee);

//		System.out.println(searchTest.getName());
//		System.out.println(searchMan.getName());
//		System.out.println(hong.getName());
		
//		System.out.println("    요소 추가후 ===========");
//		System.out.println("size" + v.size());
//		System.out.println(v.toString());
//		for (int i = 0; i < v.size(); i++) {
//			System.out.println(v.get(i).getName());
//		}
		String searchname = "이순신";
		for (int i = 0; i < v.size(); i++) {
			if (v.get(i).getName().equals(searchname)) {
			//	System.out.println("이순신 존재");
				searchMan=v.get(i);
				break;
				
	//			searchMan = null;
	//			System.out.println("이순신 없음");
			}
			
		}
/*		if(searchMan.getName() == null){
			System.out.println(searchname +"라는 이름은 없습니다.");		
		}else{
			
			System.out.println(searchMan.toString());
		}
*/
		if(!searchname.equals(searchMan.getName())){
			System.out.println(searchname +"라는 이름은 없습니다.");		
		}else{
			
			System.out.println(searchMan.toString());
	}
		
		if (v.contains(searchname)) {
			v.remove(v.indexOf(searchMan));
		}else{
			System.out.println("not");
}
		System.out.println(v +"\n");
}
}