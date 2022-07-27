package calculatorProject;

public class Multiply implements Operate{
	@Override
	public Double getResult(Double... numbers) {
		Double product = 1.0;
		
		for(Double num: numbers) {
			product*= num;
		}
		
		return product;
	}
}
