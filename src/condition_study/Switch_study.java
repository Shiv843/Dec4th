package condition_study;

public class Switch_study {

	public static void main(String[] args) 
	{
		int year=2;
		switch (year) 
		{
		case 1:
		   System.out.println("welcome to 1st year");	
		break;
		case 2:
			System.out.println("welcome to 2nd year");
		break;
		case 3:
			System.out.println("welcome to 3rd year");
		break;
		case 4:
			System.out.println("welcome to 4th year");
		break;
		
		default:
			System.out.println("please enter value between 1 to 4");
		break;
		}
	}

}
