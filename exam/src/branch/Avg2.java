/**
 * 
 */
package branch;

import java.util.Scanner;

/**
 * @date : 2016. 6. 8.
 * @author : 최인철
 * @file_name : Avg.java
 * @story :
 */
public class Avg2 {
	/**
	 * 클라이언트에서 프로그래 개발 요청이 왓습니다. 
	 * 이름과 국,영,수,세과목 점수를 입력받아서 
	 * [홍기동 : 총정 ***점 , 평균 ***점, 합격 :()] 을 출력하는 프로그램을 만들어 주세요. 
	 * 단) 평균은 소수점이하는 절삭합니다. 평균점수가 60점
	 * 미만이면 불합격 , 이상이면 합격입니다.
	 * 90점 이상이면 A
	 * 80점 이상이면 B
	 * 70점 이상이면 C
	 * 60점 이상이면 D
	 * 50점 이상이면 E
	 * 50점 이하이면 F  학점입니다
	 * 	 */

	public static void main(String[] args) {

		// -------------변수 ,선언부,준비,초기화(init)----------------------------
				Scanner scanner = new Scanner(System.in);
				int kor = 0, eng = 0, math = 0, total = 0, ave = 0;
				String grade = "", name = "";
				// -------------------연산부(알고리즘)------------------------------------------
				System.out.print("이름 :");
				name = scanner.nextLine();

				System.out.println(" 점수는 100점을 넘을 수 없습니다. 국어 :  영어  수학");
				kor = scanner.nextInt();
				eng = scanner.nextInt();
				math = scanner.nextInt();
				if (kor > 100 || eng >100 ||math>100 || kor <0||eng<0||math<0) {
					System.out.println("점수가 100점이 넘어습니다 아니면 0 보다 작은 수입니다. 다시 입력하시요");

					return;
				
				}

				total = kor + eng + math;

				ave = total / 3;

				if (ave >= 90) {
					grade = "A";
				} else if (ave >= 80) {
					grade = "B";
				} else if (ave >= 70) {
					grade = "C";
				} else if (ave >= 60) {
					grade = "D";
				} else if (ave >= 50) {
					grade = "E";
				} else if (ave >= 0) {
					grade = "F";
				}
				{
				// ------------------출력부 콘솔------------------------

					System.out.println(name + " " + "총점: " + total + "   평균 :" + ave + "  학점 : " + grade);
					
				}

			}

		}