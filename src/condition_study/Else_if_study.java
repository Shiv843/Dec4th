package condition_study;

public class Else_if_study 
{

	public static void main(String[] args) 
	{
		int marks=35;
		if(marks>=75) 
		{
			System.out.println("i am in distinction");
		}
			else if(marks<75) 
			{
				System.out.println("i am in 1st class");
			}
			else if(marks<=60) 
			{
				System.out.println("i am in second class");
			}
			else 
			{
				System.out.println("i am fail");
			}
	}

}


