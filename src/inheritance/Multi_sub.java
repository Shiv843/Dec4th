package inheritance;

public class Multi_sub extends Multi_level_super{

	public static void main(String[] args) 
	{
		Multi_sub m= new Multi_sub();
		m.scooty();
		m.type();
		m.color();
		m.avg();

	}
public void avg() {
	
	System.out.println("avg is 45 kmph");
}
}
