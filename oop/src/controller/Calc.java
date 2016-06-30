/**
 * 
 */
package controller;

/**
 * @date   : 2016. 6. 14.
 * @author : 최인철
 * @file_name : Calc.java
 * @story : 
*/
public class Calc {
	public String cCalc(int inputNum1,String opcode,
			int inputNum2){
		int num1=inputNum1;
		String op =opcode;
		int num2=inputNum2;
		int result=0;
		// ---------------------------------------------------------
		
		switch (op) {
		case "+":
			
			result = num1 + num2;
			opcode = "+";
			break;
		case "-":
			result = num1 - num2;
			opcode = "-";
			break;
		case "*":
			result = num1 * num2;
			opcode = "*";
			break;
		case "/":
			result = num1 / num2;
			opcode = "/";
			break;
		case "%":
			result = num1 % num2;
			opcode = "%";
			break;

		default:
			System.out.println("1-5까지 다시 입력 하세요");
break;
	}
return num1 +op +num2+"="+ result;
	}
}
	
	
	
