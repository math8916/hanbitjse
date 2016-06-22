/**
 * 
 */
package matrix;

/**
 * @date   : 2016. 6. 22.
 * @author : 최인철
 * @file_name : Zigzag.java
 * @story : 
*/
public class Zigzag {
public static void main(String[] args) {
	int[][] mtx = new int[5][5];
	int flag =1,k=1,i=0,j=0;
	
	for ( i = 0; i < 5; i++) {
		if(flag ==1){
		for ( j = 0; j < mtx.length; j++) {
			mtx[i][j]=k;
			k++;
		}
	}else { 
		for ( j = 5; j < mtx.length; j--) {
			mtx[i][j]=k;
			k++;
		}

	}
	//여기를 채우세요(flag 값 방향전화
	{
}
for (int j2 = 0; j2 < mtx.length; j2++) {
	
}
}
	}
}
