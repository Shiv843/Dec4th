package automation;

public class Assignment {

	public static void main(String[] args) {
	
	Student_data();
	Assignment obj= new Assignment();
	obj.Student_info("Nikhil", 21, 'A', 95);

	}
	
	public static void Student_data() {
		
		String Name="shiva";
		int roll_no=45;
		char grade='A';
		double marks=85.45;
		System.out.println("...........................");
		System.out.println("My name is "+Name);
		System.out.println("My roll no is "+roll_no);
		System.out.println("My grade is "+grade);
		System.out.println("My marks are "+marks);
		System.out.println("...............................");	
	}
	
	public void Student_info(String name, int roll, char grade, double marks) {
		
		System.out.println("***************************************");
		System.out.println("My name is "+name);
		System.out.println("My roll no is "+roll);
		System.out.println("My grade is "+grade);
		System.out.println("My marks are "+marks);
		System.out.println("*******************************************");
	}
	

}
