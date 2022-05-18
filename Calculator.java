package week1.day2;

public class Calculator {

	public int add(int a, int b) {
     
		int sum = a+b;
		
		return sum;

	}
	
	public double sub(double a, double b) {
		
		return a-b;
		
	}
	
	public double mul(double a, double b) {
		
		return a*b;

	}
	
	public int div(int a, int b) {
		
		return a/b;
	}
	
	public static void main(String[] args) {
		
		Calculator myCalc = new Calculator();
		System.out.println(myCalc.add(5, 4));
		System.out.println(myCalc.sub(9, 2));
		System.out.println(myCalc.mul(6, 5));
		System.out.println(myCalc.div(10, 5));

	}

}

