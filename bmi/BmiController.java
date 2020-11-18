package bmi;

import user.UserDto;

public class BmiController {
	public String getBmi(UserDto user, BmiDto bmi) {
		return String.format("%s님의 BMI 지수는 %f", user.getName(),
				new BmiServiceImpl().calcBmi(bmi));
	}

}
