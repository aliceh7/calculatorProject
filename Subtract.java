package calculatorProject;

public class Subtract implements Operate{
	@Override
	public Double getResult(Double... numbers) {
		Double difference = numbers[0];
		
		for(int i = 1; i < numbers.length; i++) {
			difference-= numbers[i];
		}
		
		return difference;
	}
}