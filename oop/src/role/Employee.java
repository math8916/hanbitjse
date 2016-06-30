/**
 * 
 */
package role;

/**
 * @date   : 2016. 6. 22.
 * @author : 최인철
 * @file_name : Employee.java
 * @story : 
*/
public class Employee extends Man {

	/* (non-Javadoc)
	 * @see role.Man#role()
	 */
	@Override
	public void role() {
		// TODO Auto-generated method stub
		super.role();
		System.out.println("직원의 역할");
	}
	
	public void worry() {
		System.out.println("직원의 고민");
}
}