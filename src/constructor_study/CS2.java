package constructor_study;

class CS2 {
	
	int a;
	double b;
	int c;
	
	public CS2(int num, double gum, int cum)  {
		
		a=num;
	    b=gum;
		c=cum;
		
		
		
	}

	public static void main(String[] args) {
		
		CS2 c= new CS2(54, 505.856547, 56);
		
		c.substraction();
		

	}
	
	public void substraction() {
		
		double substraction=b-a-c;
		System.out.println("substraction is "+substraction);
		
		
	}

}
