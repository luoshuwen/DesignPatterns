package ch1._08;

public class Operation {
	public static double getResult(double a,double b,String operand) {
		double result=0;
		
		switch (operand) {
		case "+":
			result=a+b;
			break;
		case "-":
			result=a-b;
			break;
		case "*":
			result=a*b;
			break;
		case "/":
			result=a/b;		
			break;

		default:
			break;
		}
		
		return result;
	}
}
