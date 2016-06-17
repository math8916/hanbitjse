/**
 * 
 */
package school;

import java.text.SimpleDateFormat;

/**
 * @date : 2016. 6. 16.
 * @author : 최인철
 * @file_name : Student.java
 * @story :
 */
public class Student {
	private String ssn;
	private String name;
	private String id;
	private String pw;
	private String gender;
	private int age;
	private String reg;
	public final static String SCHOOL_NAME = "한빛학원"; // 변경 불가능한 초기 고정값

	// public void setSsn(String ssn) {
	// this.ssn = ssn;
	// }

	// public void setName(String name) {
	// this.name = name;
	// }

	// public void setId(String id) {
	// this.id = id;
	// }
	/**
	 * 
	 */
	public Student(String name, String pw, String id, String ssn) {
		this.name = name;
		this.pw = pw;
		this.id = id;
		this.ssn = ssn;

		String now = new SimpleDateFormat("yyyy-MM-dd").format(System.currentTimeMillis());
		this.reg = now;

		String[] arr = ssn.split("-");
		int c = Integer.parseInt(arr[1]);
		if (c == 0 || c == 9) {
			System.out.println("잘못 입력 하셨습니다.");
			return;
		}
		// -- up casting c가 char에서 정수로 치환
		// 실제 문자 1은 49번 이다
		if (c % 2 == 1) {
			this.gender = "남";

		} else {
			this.gender = "여";
		}
		int dage = Integer.parseInt(arr[0]);
		age = 2016 - (dage / 10000 + 1900);
	}

	public void setPw(String pw) {
		this.pw = pw;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public String getSsn() {
		return this.ssn;

	}

	public String getName() {
		return this.name;

	}

	public String getId() {
		return this.id;
	}

	public String getPw() {
		return this.pw;

	}

	public int getAge() {
		return this.age;
	}

	public String getGender() {
		return this.gender;
	}

	public String getReg() {
		return this.reg;

	}

}