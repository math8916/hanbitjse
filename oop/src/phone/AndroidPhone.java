/**
 * 
 */
package phone;

/**
 * @date   : 2016. 6. 22.
 * @author : 최인철
 * @file_name : AndroidPhone.java
 * @story : 
*/
public class AndroidPhone extends IPhone {
	private String size,data ;
	public final static String BRAND="갤럭시 노트";
	
	public String getSize() {
		return size;
	}
	public void setSize(String size) {
		this.size = size;
	}
	public String getData() {
		return data;
	}
	public void setData(String call, String size, String data) {
		super.setCompany(BRAND);
		super.setPortable(true);
		super.setCall(call);
		this.setSize(size);
		this.data =KIND+ "이기 때문에" 
		+super.getMove() +super.getCompany() + "제품을\n" + super.getCall() + "이라고 통화 하고 "
				+ "\n카톡으로"+data+"메세지를 보냈다";
	}
	/* (non-Javadoc)
	 * @see java.lang.Object#toString()
	 */
	@Override
	public String toString() {
		return getData();
	}


}
