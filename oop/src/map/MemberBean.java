/**
 * 
 */
package map;

/**
 *@date    :2016. 6. 28.
 *@author  :최인철
 *@file    : MemberBean.java
 *@story  :
 */
public class MemberBean {
	private String id,pw,name,gender;

	
	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public String getPw() {
		return pw;
	}

	public void setPw(String pw) {
		this.pw = pw;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getGender() {
		return gender;
	}

	public void setGender(String gender) {
		this.gender = gender;
	}
/**
 * 
 */
public MemberBean() {
	// TODO Auto-generated constructor stub

}

@Override
public String toString() {
	return "회원 아이디" + id + "\n, pw= ******" + ", \n회원이름" + name + "\n 성별" + gender ;
}
}
