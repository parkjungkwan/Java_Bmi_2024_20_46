package bmi;

public class BmiServiceImpl implements BmiService{

	@Override
	public double calcBmi(BmiDto bmi) {
		// TODO Auto-generated method stub
		return bmi.getWeight()/bmi.getHeight()/bmi.getHeight() * 10000;
	}

}
