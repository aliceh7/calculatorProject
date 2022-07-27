package calculatorProject;

public interface Operate {
	//only has 1 method accepting variable argument array
	//... means that each numbers will be an array of variable length
	Double getResult(Double... numbers);
}
