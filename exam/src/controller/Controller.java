/**
 * 
 */
package controller;

import java.util.Scanner;

import javax.swing.JOptionPane;

/**
 * @date : 2016. 6. 14.
 * @author : 최인철
 * @file_name : Controller.java
 * @story :
 */
public class Controller {
	public static void main(String[] args) {
		String menu="";
		Scanner s = new Scanner(System.in);
		Calc calc =new Calc();
		Kaup kaup =new Kaup();
		MonthEnd monthEnd=new MonthEnd();
		Num1_1 num1_1=new Num1_1();
		Arrassign arr=new Arrassign();
		Num1 jmax = new Num1();
		Tex jtex = new Tex();
		Gender jgender = new Gender();
		TimeCalc jTimeCalc =new TimeCalc();
		while (true) {
			
			menu = JOptionPane.showInputDialog("1.계산기\n"
					+ "2.카우푸 구하기\n"
					+ "3.년월말구하기 \n"
					+ "4.1등 구하기\n"
					+ "5. 학번/나이\n"
					+ "6.최고최저점수\n"
					+ "7.세금액\n"
					+ "8.성별판별\n"
					+ "9.시분초구하기\n"
					+ "0.종료\n");
			
			// / if (s.nextInt()>4) {
			// System.out.println( "다시 입력하시요"); /

			// }
			switch (menu) {
			case "1": // 계산기 사칙 연산
				System.out.print("정수1 의 값을 입력하시오 :");
				System.out.print("덧셈+ , 뺄셈 - , 곱셉 * ,나눗셈 / 나머지 % 를 입력하세요");
				System.out.println("정수2 의 값을 입력하시오 :");
				System.out.println(calc.execute(s.nextInt(),s.next(),s.nextInt()));
				break;
			case "2":
				System.out.println("이름");
				System.out.println("키");
				System.out.println("몸무게");
				// String kaup1=kaup.judg(s.next(),s.nextInt(),s.nextInt());
				System.out.println(kaup.judg(s.next(),s.nextInt(),s.nextInt()));
				break;
			case"3":
				System.out.print("년을 입력하시오 예(2016)  :");
				System.out.print("월을 입력하시오 예(6)  :");
				System.out.println(monthEnd.judg3(s.nextInt(),s.nextInt()));

			break;
			case "4":
				System.out.println("1.이름,점수 입력");
				System.out.println("2. 이름,점수 입력");
				System.out.println("3. 이름,점수 입력");
				System.out.println(num1_1.judg1(s.next(),s.nextInt(),s.next(),s.nextInt(),s.next(),s.nextInt()));
				break;

			case "5":
				System.out.println("학생수");
				System.out.println("이름 , 나이");
				System.out.println(arr.jarr(s.nextInt(),s.next(),s.nextInt()));
				break;
			case "6":
				System.out.println("학생수");
				int[] score=new int[s.nextInt()];
				System.out.println("점수");
				for (int i = 0; i < score.length; i++) {
					score[i] = s.nextInt();
				
				}
				System.out.println(jmax.cmax(score));
				break;
			case "7":
				System.out.println("직원 이름 : [ ]");
				System.out.println("연봉 : [ ]");
				System.out.println("세율이 바귀어씁니가? 바뀌었으면 0 , 아니면 1을 입력하세요");
				
				 
				System.out.println(jtex.ctex(s.next(),s.nextInt(),s.nextInt(),s.nextDouble()));
				
				break;
			case "8":
				System.out.println("이름을 입력 하세요 :");
				System.out.println("주민번호를 다음 형식으로 입력하세요 000000-0 :");
				System.out.println(jgender.cgender(s.next(),s.next()));
				break;
			case "9":
				System.out.println("시간을 입력하세요 :");
				System.out.println(jTimeCalc.cTimeCalc(s.nextInt()));
				break;
			case "0":
				JOptionPane.showConfirmDialog(null, "종료 하시겠니까");
				System.out.printf("종료합니다");

				return;

			default:
				JOptionPane.showMessageDialog(null,"메뉴에 없습니다");
				System.out.println("다시 입력하시오");
				break;
			}
		}
	}

	/**
	 * @param s
	 */
	private static void monthend(Scanner s) {
		int day = 0;

		System.out.print("월을 입력하시오");

		switch (s.nextInt()) {
		case 1:
		case 3:
		case 5:
		case 7:
		case 8:
		case 10:
		case 12:
			day = 31;

			break;
		case 4:
		case 6:
		case 9:
		case 11:
			day = 30;
			break;
		case 2:
			day = 28;
			break;

		default:
			System.out.println("1-12사이만 입력하시오");
			return;
		}
		System.out.println(" 월" + day + "일");
	}

	/**
	 * @param s
	 */
	private static void kaup(Scanner s) {

	}

	/**
	 * @param s
	 */
//	private static void calc(Scanner s) {
		


		}
	

