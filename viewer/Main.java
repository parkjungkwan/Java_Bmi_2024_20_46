package viewer;
import java.util.Scanner;

import bmi.*;
import calculator.*;
import user.*;
public class Main {
	
	public static void main(String[] args) {
		Scanner scanner =  new Scanner(System.in);
		CalculatorDto calculator = new CalculatorDto();
		CalculatorController calculatorController = new CalculatorController();
		BmiController bmiController = new BmiController();
		BmiDto bmi = new BmiDto();
		UserDto user = new UserDto();
		System.out.println("MENU : 0. 종료  1.계산기 2.BMI");
		switch(scanner.next()) {
		case "1":
			System.out.println("계산기 시작");
			System.out.println("수 입력");
			calculator.setNum1(scanner.nextInt());
			System.out.println("연산자 입력 +, -, *, /, %");
			calculator.setOpcode(scanner.next());
			System.out.println("수 입력");
			calculator.setNum2(scanner.nextInt());
			System.out.println("답: "+calculatorController.execute(calculator));
			break;
		case "2":
			System.out.println("Bmi 계산 시작");
			System.out.println("이름 입력 : ");
			user.setName(scanner.next());
			System.out.println("키 입력: ");
			bmi.setHeight(scanner.nextDouble());
			System.out.println("몸무게 입력: ");
			bmi.setWeight(scanner.nextDouble());
			System.out.println(bmiController.getBmi(user , bmi));
			break;
		case "0":
			System.out.println("시스템 종료");
			break;
		}
		scanner.close();
	}
}












