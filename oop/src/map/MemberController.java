/**
 * 
 */
package map;

import javax.swing.JOptionPane;

/**
 *@date    :2016. 6. 28.
 *@author  :최인철
 *@file    : MemberController.java
 *@story  :
 */
public class MemberController {
	public static void main(String[] args) {
		MemberService service = new MemberServiceImpl();
//		MemberBean member = new MemberBean();
		String temp ="";
		while (true) {
			switch (JOptionPane.showInputDialog("---회원이 보는 화면 -----\n "
					+ "1.회원가입 2.로그인 3.내정보 수정(비밀번호) 4.비번 변경 5.탈퇴 0.종료 \n"
					+ "-----관리자 화면 ---------\n"
					+ "11회원목록 12검색(ID) 13검색(이름) 14검색(성별) 15회원수")) {
			case "1":
				
				temp =JOptionPane.showInputDialog("Id ,Pw,이름,성별 입력하시오");
			//	member.setId(id);
				String[] arr = temp.split(",");
				MemberBean member = new MemberBean();
				member.setId(arr[0]);
				member.setPw(arr[1]);
				member.setName(arr[2]);
				member.setGender(arr[3]);
				
				JOptionPane.showMessageDialog(null, service.join(member)+"회원가입을 축하합니다.");
				
				break;
			case "2":

				temp= JOptionPane.showInputDialog("Id ,Pw 입력하시오");
				String[] arr2 = temp.split(",");
				MemberBean member2 = new MemberBean();
				member2.setId(arr2[0]);
				member2.setPw(arr2[1]);
				JOptionPane.showMessageDialog(null, service.login(member2));
						break;
			case "4":
				
				temp=JOptionPane.showInputDialog("새로운 Pw 입력하시오");
	//			JOptionPane.showMessageDialog(null, "변경 되었습니다"+service.updatePW(member));
				break;
			case "5":
				JOptionPane.showMessageDialog(null, "삭제 되었습니다"+service.delete());
				break;
			case "3":
				JOptionPane.showMessageDialog(null, service.detail());
				break;
			case "11":
				service.list();
				JOptionPane.showMessageDialog(null, "전체리스"+service.list());
				break;
			case "12":
				service.findById(temp);
				 JOptionPane.showInputDialog("검색할 Id를 입력하세요");
				break;
			case "13":
				String name="";
				service.findByName(name);
				 name=JOptionPane.showInputDialog("검색할 이름를 입력하세요");
				 JOptionPane.showMessageDialog(null, service.findByName(name));
				break;
			case "14":
				service.countByGender(temp);
				 JOptionPane.showInputDialog("검색할 성별를 입력하세요");
				break;
			case "15":
				service.count();
				JOptionPane.showMessageDialog(null, "전체회원수");
				break;
			case "0":
				JOptionPane.showConfirmDialog(null, "종료하시겠습니까");
				return;
			
			}
		}
	}
}
