/**
 * 
 */
package phone;

/**
 * @date   : 2016. 6. 22.
 * @author : 최인철
 * @file_name : IPhone.java
 * @story : 
*/
public class IPhone extends CellPhone {
	private String data;
	public final static String KIND="스마트폰";
	public final static String BRAND="아이폰";
	
	public String getData() {
		return data;
	}
	public void setData(String data) {
		this.data = data;
	
	}
	/* (non-Javadoc)
	 * @see java.lang.Object#toString()
	 */
	@Override
	public String toString() {
		return KIND+ "이기 때문에" +super.getMove() +super.getCompany() + ""
				+ "제품을" + super.getCall() + ""
						+ "이라고 통화 하고 " +this.getData()+""
								+ "를 문자로 보냈다";
	}
		
	

}
