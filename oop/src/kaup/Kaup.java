/**
 * 
 */
package kaup;

/**
 * @date : 2016. 6. 14.
 * @author : 최인철
 * @file_name : Kaup.java
 * @story :
 */
public class Kaup {
	String name, height, weight; // 인스턴스의 변수라 한다

	public void setName(String name) {
		this.name = name; // 외부에서 입력된 n읠 값을 필드값의 name 의 변환
	}

	public void setHeight(String height) {
		this.height = height;
	}

	public void setWeight(String weight) {
		this.weight = weight;
	}

	public String getName(String name) {
		return this.name;
	}

	public String getHeight(String height) {
		return this.height;
	}

	public String getWeight(String weight) {
		return this.weight;
	}

	
	public String cKaup() {
		double height = Double.parseDouble(this.height), weight = Double.parseDouble(this.weight);
		String result = "";
		double kaup = 0.0;
		// --------- op------------

		// 공식 부분
		kaup = weight * 10000 / (height * height);

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

		// System.out.println(name+"은 BMI지수는 "+d+"이고,"+result+"이다");
		// 위 문장을 printf 로 변경하시오
		return name + "은 " + "BMI지수는 " + Double.parseDouble(String.format("%.2f", kaup)) + "이고 " + result + "이다";
	}
}