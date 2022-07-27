package calculatorProject;

public class Divide implements Operate{
	@Override
	public Double getResult(Double... numbers) {
		Double quotient = numbers[0];
		
		for(int i =1; i < numbers.length; i++) {
			quotient/= numbers[i];
		}
		
		return quotient;
	}
}