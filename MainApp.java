package calculatorProject;
import java.util.*;

public class MainApp {
	public static void main (String[] args) {
		final String inputExp = ReadInput.read();
		
		Queue<String> operations;
		Queue<String> numbers;
		
		String numbersArr[] = inputExp.split("[-+/*]");
		String operArr[] = inputExp.split("[0-9]");
		
		numbers = new LinkedList<String>(Arrays.asList(numbersArr));
		operations = new LinkedList<String>(Arrays.asList(operArr));
		//4*5+3/2
		
		Double res = Double.parseDouble(numbers.poll()); //poll gets the first element of the Queue
		//in this case res = 4
		
		while(!numbers.isEmpty()) {
			String opr = operations.poll();
			
			Operate operate; //this uses dynamic binding where we assign an object to an interface type 
			switch(opr) {
			case "+": 
				operate = new Add();
				break;
			case "-": 
				operate = new Subtract();
				break;
			case "*": 
				operate = new Multiply();
				break;
			case "/": 
				operate = new Divide();
				break;
			default:
				continue;
			}
			
			Double num = Double.parseDouble(numbers.poll()); //in this example, num is 5
			
			res = operate.getResult(res, num); //res will keep being updated
			
		}
		
		System.out.println(res);
		
	}
}
