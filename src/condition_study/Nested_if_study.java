package condition_study;

public class Nested_if_study 
{

	public static void main(String[] args) 
    {
		String Username="Shiv";
		String Password="Shiv123";
		if(Username=="Shiv") 
		{
			System.out.println("Username is correct, Please enter password");
			if(Password=="Shiv123") 
			{
				System.out.println("Logging in");
			}
			else 
			{
				System.out.println("please check password");
			}
		}
		else 
		{
			System.out.println("please enter correct username");
		}
		

	}

}
