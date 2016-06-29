/**
 * 
 */
package map;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Vector;

import com.sun.org.apache.regexp.internal.recompile;

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
		String result = "";
		if (map.containsKey(member.getId())) {
			result = "이미 존재합니다";
		} else {
			map.put(member.getId(), member);
			result = "가입성공";
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
		System.out.println("회원가입시 비번:" + map.get(member.getId()));
		if (map.containsKey(member.getId())) {

			if (findById(member.getId()).getPw().equals(member.getPw())) {
				result = "로그인 성공";
				session = findById(member.getId());

			} else {
				result = "아이디 실패";
			}
		} else {
			result = "Id 없음";
		}
		return result;
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see map.MemberService#detail()
	 */
	@Override
	public MemberBean detail() {

		// TODO Auto-generated method stub
		return session;
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see map.MemberService#list()
	 */
	@Override
	public List<MemberBean> list() {
		List<MemberBean> memberlist = new ArrayList<MemberBean>();
		for (Map.Entry<String,MemberBean> entry : map.entrySet()) {
				memberlist.add(entry.getValue());
			}

		// TODO Auto-generated method stub
		return memberlist;
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

	@Override
	public List<MemberBean> findByName(String name) {
		List<MemberBean> list = new ArrayList<MemberBean>();
		for (String key : map.keySet()) {
			if (name.equals(map.get(key).getName())) {
				list.add(map.get(key));
			}

		}
		// TODO Auto-generated method stub
		return list;
		// TODO Auto-generated method stub
	}
	@Override
	public int countByGender(String gender) {
		int count = 0;

		for (String key : map.keySet()) {
			if (gender.equals(map.get(key).getGender())) {
				count++;
			}

		}
		// TODO Auto-generated method stub
		return count;
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see map.MemberService#updatePW(map.MemberBean)
	 */
	@Override
	public void updatePW(MemberBean member) {
		// TODO Auto-generated method stub
		session.setPw(member.getPw());
		map.put(session.getId(), session);
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see map.MemberService#delete(java.lang.String)
	 */
	@Override
	public String delete() {
		map.remove(session.getId());
		session = null;
		// TODO Auto-generated method stub
		return "삭제성공";
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
