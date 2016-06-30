package phone;
/**
 * @date   : ${date}
 * @author : 최인철
 * @file_name : ${file_name}
 * @story : 핸드폰
*/
public class CellPhone extends Phone {
private String move; 
private boolean portable;
public final static String KIND="휴대폰";

public String getMove() {
	return move;
}
public void setMove(String move) {
	this.move = move;
}
public boolean isPortable() {
	return portable;
}
public void setPortable(boolean portable) {
	if (portable) {
		this.setMove("이동가능");
	} else {
		this.setMove("이동 불가능");
	}
	this.portable = portable;
}
/* (non-Javadoc)
 * @see java.lang.Object#toString()
 */
@Override
public String toString() {
	return KIND+ "이기 때문에" +move +super.getCompany() + "제품을" + super.getCall() + "이라고 통화 했다 ";
}
	
	

}
