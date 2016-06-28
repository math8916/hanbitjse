/**
 * 
 */
package map;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * @date :2016. 6. 28.
 * @author :최인철
 * @file : MemberServiceImpl.java
 * @story :
 */
public class MemberServiceImpl implements MemberService {
	Map<String, MemberBean> map;
	MemberBean session;

	/*
	 * (non-Javadoc)
	 * 
	 * @see map.MemberService#join(map.MemberBean)
	 */
	public MemberServiceImpl() {
		map = new HashMap<String, MemberBean>();
	}

	@Override
	public String join(MemberBean member) {
		// TODO Auto-generated method stub
		String result="";
		if(map.containsKey(member.getId())){
			result = "이미 존재합니다";
		}else{
			map.put(member.getId(), member);
			result ="가입성공";
		}
		return result;
	}


	/*
	 * (non-Javadoc)
	 * 
	 * @see map.MemberService#login(map.MemberBean)
	 */
	@Override
	public String login(MemberBean member) {
		// TODO Auto-generated method stub\
		String result = "";
		if (map.containsKey(member.getId())) {
			
			if (findById(member.getId()).getPw().equals(member.getPw())) {
				result ="로그인 성공";
				session = findById(member.getId());	
			}
			}else{
			result = "아이디 실패";
		}
		return result;
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see map.MemberService#detail()
	 */
	@Override
	public String detail() {
		String result= "";
		// TODO Auto-generated method stub
		return null;
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see map.MemberService#list()
	 */
	@Override
	public List<MemberBean> list() {
		// TODO Auto-generated method stub
		return null;
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see map.MemberService#findById(java.lang.String)
	 */
	@Override
	public MemberBean findById(String id) {
		// TODO Auto-generated method stub
		return map.get(id);
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see map.MemberService#findByName(java.lang.String)
	 */
	@Override
	public List<MemberBean> findByName(String name) {
		// TODO Auto-generated method stub
		return null;
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see map.MemberService#findByGender(java.lang.String)
	 */
	@Override
	public List<MemberBean> findByGender(String gender) {
		// TODO Auto-generated method stub
		return null;
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see map.MemberService#updatePW(map.MemberBean)
	 */
	@Override
	public void updatePW(MemberBean member) {
		// TODO Auto-generated method stub

	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see map.MemberService#delete(java.lang.String)
	 */
	@Override
	public String delete(String id) {
		// TODO Auto-generated method stub
		return null;
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see map.MemberService#count()
	 */
	@Override
	public int count() {
		// TODO Auto-generated method stub

		return map.size();
	}

}
