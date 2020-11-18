package calculator;

public class CalculatorServiceImpl implements CalculatorService{

	@Override
	public int add(CalculatorDto calculator) {
		
		return calculator.getNum1() + calculator.getNum2();
	}

	@Override
	public int minus(CalculatorDto calculator) {
		return calculator.getNum1() - calculator.getNum2();
	}

	@Override
	public int multi(CalculatorDto calculator) {
		return calculator.getNum1() * calculator.getNum2();
	}

	@Override
	public int divid(CalculatorDto calculator) {
		return calculator.getNum1() / calculator.getNum2();
	}

	@Override
	public int modul(CalculatorDto calculator) {
		return calculator.getNum1() % calculator.getNum2();
	}


}








