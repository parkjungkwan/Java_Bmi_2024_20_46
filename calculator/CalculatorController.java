package calculator;

import user.*;
import bmi.*;
public class CalculatorController {
	
	public int execute(CalculatorDto calculator) {
		CalculatorService service = new CalculatorServiceImpl();
		int res = 0;
		String op = calculator.getOpcode();
		if(op.equals("+")) {
			res = service.add(calculator);
		}else if(op.equals("-")){
			res = service.minus(calculator);
		}else if(op.equals("*")){
			res = service.multi(calculator);
		}else if(op.equals("/")){
			res = service.divid(calculator);
		}else if(op.equals("%")){
			res = service.modul(calculator);
		}
		return res;
	}

	
}












