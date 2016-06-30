/**
 * 
 */
package controller;

/**
 * @date   : 2016. 6. 14.
 * @author : 최인철
 * @file_name : Kaup.java
 * @story : 
*/
public class Kaup {
	public String cKaup(String kaufname, int inputheight,int inputweight){
	String na = kaufname;
	int height=inputheight;
	int weight=inputweight;
	String result="";
	double  kaup = 0.0;
	// --------- op------------
	
	// 공식 부분
	kaup = weight*10000 / (height* height );

	if (kaup < 18.5) {
		result = "저체중 ";
	} else if (kaup >= 18.5 && kaup < 22.9) {
		result = "정상체중";
	} else if (kaup >= 23.0 && kaup < 24.9) {

		result = "위험체중";
	} else if (kaup >= 25.0 && kaup < 29.9) {
		result = "비만 1단계";
	} else if (kaup >= 25.0 && kaup < 29.9) {
		result = "비만 2단계";
	} else if (kaup >= 40) {
		result = "비만 3단계";
	}

	double d = Double.parseDouble(String.format("%.2f", kaup));
	// System.out.println(name+"은 BMI지수는 "+d+"이고,"+result+"이다");
	// 위 문장을 printf 로 변경하시오
	return na+"은 "+"BMI지수는 "+d+"이고"+result+ "이다";
}
}