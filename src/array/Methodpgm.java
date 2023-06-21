package array;

public class Methodpgm {

	public static void main(String[] args) {
Methodpgm ob=new Methodpgm();
ob.add();
//int d=ob.sub();
System.out.println(ob.sub());
System.out.println(ob.mul(10, 20));
ob.div(6,2);



	}
public  void add()
{
	int a=10,b=20;
	int c=a+b;
	System.out.println(c);
	
}
//2.Method with return type and without parameter
public int sub()
{
	int a=30,b=20;
	int c=a-b;
	return c;
}
//3.method with return type and with parameter
public int mul(int a,int b)
{
	int c=a*b;
	return c;
}
//4.Method without return type and with parameter
public void div(int a,int b)
{
	double c=a/b;
	System.out.println(c);
}
}
