package automation;

public class Arithmatic {

	public static void main(String[] args) {
		
		Sum(20, 30, 40);
		
		Arithmatic obj2= new Arithmatic();
		
		obj2.Sub(50, 200.54321, 40);

	}
	
	public static void Sum(int a, int b, int c) {
		
		int Sum=a+b+c;
		
		
		System.out.println("Sum is "+Sum);
	}

	public void Sub(int d, double e, int f) {
		
		double Sub=e-d-f;
		
		System.out.println("substraction is "+Sub);
	}
	
}
