package constructor_study;

public class CS3 {
	
	int a;
	int b;
	int c;
	int d;
	int e;
	public CS3(int x, int y, int z) {
		
		a=x;
		b=y;
		c=z;
			
}
	
	public CS3(int m, int n, int o, int p) {
	
	a=m;
	b=n;
	c=o;
	d=p;
}
	
	public CS3(int s, int t, int u, int v, int w) {
		
          a=s;
          b=t;
          c=u;
          d=v;
          e=w;
          	
}

	public static void main(String[] args) {
		
		CS3 m= new CS3(32, 1, 2);
		m.addition();
		CS3 p= new CS3(25, 35, 45, 58);
		p.addition();
		CS3 z= new CS3(45, 50, 60, 70, 80);
		z.addition();
}

public void addition() {
	
	int addition=a+b+c+d+e;
	
	System.out.println("the addition is "+addition);
}

}


