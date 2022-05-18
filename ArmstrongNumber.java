package week1.day2;

public class ArmstrongNumber {
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int input = 1524;
		int orgNumber = input;
		int sum = 0;
		int rem = 0;
		int qut = 0;
		int cal = 0;
		
		//ArmstrongNumber myArmsNo = new ArmstrongNumber();
		
		while(input > 0) {
		
			rem = input % 10;
			cal = rem * rem * rem;
			sum = sum + cal;
			qut = input / 10;
			input = qut;
		
		}
		
		System.out.println(sum);
			
	
		if (sum == orgNumber) {
			System.out.println("Armstrong Number");
		}else System.out.println("Not an Armstrong Number");
				

	}

}
