package travis_ci_tutorial_java;

public class SimpleCalculator {
	/*public int add(int a, int b) {
		return a + b;
	}*/
	
	/*
	public int minus(int a, int b) {
		return a - b;
	}*/
	

	/*public int multiply(int a, int b) {
		return a * b;
	}
	*/
	 
	public double divide(double a, double b) {
		if(b==0) {
			throw new IllegalArgumentException("Number can not be divide by 0!");
			
		}
		return a / b;
	}
}
