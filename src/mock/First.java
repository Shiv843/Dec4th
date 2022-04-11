package mock;

public class First {
	
	int a;
	int b;
	int c;
	
	public First()  {
		
		a=10;
		b=20;
		c=30;
		}
	
    public static void main(String[] args) {
		
		test(20, 30);
    	First obj= new First();
		obj.test1();
		
		
	}
public static void test(int x, int y) {
	
	int addition=x+y;
	
	System.out.println("addition is "+addition);
	
	
}

public void test1() {
	
	int substraction=a-b-c;
	System.out.println("substraction is "+substraction);
}
}
