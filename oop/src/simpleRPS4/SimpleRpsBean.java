package simpleRPS4;

import java.util.Random;

public class SimpleRpsBean {
	private String winner;
	private int com,play;
	
		public void setPlay(int play){ 
			this.play=play;
		}
		public void setCom(int com){
			Random r = new Random();
			this.com=r.nextInt(3)+1;
		}
		public void setWinner(String winner){
			this.winner=winner;
		}
		public  int getPlay() {
			return play;
		}
		public int getCom(){
			return com;
		}
		public String getWinner(){
			return winner;
		}
		
		
		/* (non-Javadoc)
		 * @see java.lang.Object#toString()
		 */
		@Override
		public String toString() {
			String user="",comp="";
			switch (this.getPlay()) {
			case 1:	user=" 가위 " ;break;
			case 2:	user=" 바위" ;break;
			default :user=" 보 " ;	break;
			}
			switch (this.getCom()) {
			case 1:	comp=" 가위 " ;break;
			case 2:	comp=" 바위" ;break;
			default :comp=" 보 " ;	break;
			}
			return "[배팅값="+"\n사용자"+user + "\n컴퓨터 " + comp + "]";
		}

}
