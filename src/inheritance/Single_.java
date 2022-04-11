package inheritance;

public class Single_ extends Single_level_inheritance{

	public static void main(String[] args) {
		
		Single_ s= new Single_();
		s.avg();
		s.price();

	}
	
	public void price() {
		
		System.out.println("Price is 1,20,000rs");
	}

}
