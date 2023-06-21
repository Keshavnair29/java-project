package oops;



public class Polimorphism {

	public static void main(String[] args) {
	Polimorphism ob=new Polimorphism();
	ob.add();
	ob.add(5, 4);
	ob.add(83, 0);
	ob.add(3, 0);
	}
	public void add()
	{
		int a=20,b=20,c;
		c=a+b;
		System.out.println(c);
	}
		
		public void add(int a,int b)
		{
			int c=a+b;
			System.out.println(c);
		}
		public void add(int a,double b)
		{
			double c=a+b;
			System.out.println(c);
		}
		public void add(double a,int b)
		{
			double c=a+b;
			System.out.println(c);
		}
	}


