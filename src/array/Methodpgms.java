package array;

public class Methodpgms {

	public static void main(String[] args) {
		Methodpgms ob=new Methodpgms();
		ob.square();
		System.out.println(ob.triangle());
	

	}
	//without return type and without parameter
	public void square()
	{
		int a=4;
		int s=a*a;
		
		System.out.println(s);
	}
//2.Method with return type and without parameter
	public double triangle()
	{
		double b=4, h=4;
		double a=0.5*b*h;
		return a;
		
	}
	
}
