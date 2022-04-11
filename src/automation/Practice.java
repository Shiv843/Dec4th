package automation;

public class Practice {

	public static void main(String[] args) {
	
		addition();
		Practice m= new Practice();
		m.substraction();

	}
	
	public static void addition() {
		
		int a=30;
		int b=50;
		double c=55.25325;
		double sum=a+b+c;
		System.out.println("addition is "+sum);
	}

	public void substraction() {
		
		int v=45;
		double x=100.235;
		
		double sub=x-v;
		
		System.out.println("substraction is "+sub);
		
	}
	
}
