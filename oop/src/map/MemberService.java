/**
 * 
 */
package map;

import java.util.List;

/**
 *@date    :2016. 6. 28.
 *@author  :최인철
 *@file    : MemberService.java
 *@story  :
 */
public interface MemberService {
	/*
	 * + "1.회원가입 2.로그인 3.내정보 수정(비밀번호) 4.탈퇴 0.종료 \n"
					+ "-----관리자 화면 ---------\n"
					+ "11회원목록 12검색(ID) 13검색(이름) 14검색(성별) 15회원수"))
	 
	 * **/
	
	
	public String join(MemberBean member);
	public String login(MemberBean member);
	public String detail();
	public List<MemberBean> list();
	public MemberBean findById(String id);
	public List<MemberBean> findByName(String name);
	public List<MemberBean> findByGender(String gender);
	public void updatePW(MemberBean member);
	public String delete(String id);
	public int count();
	
}
