package constructor_study;

public class CS1 {
	
	int a;
	int b;
	int c;
	
	
	public CS1() {
		
		a=252;
		b=351;
		c=420;
		
	}

	public static void main(String[] args) {
		
		CS1 b= new CS1();
		b.Addition();
		

	}
	
	public void Addition() {
		
		int addition=a+b+c;
		System.out.println("addition is "+addition);
	}

}
