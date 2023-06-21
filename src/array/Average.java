package array;

import java.util.Scanner;

public class Average {

	public static void main(String[] args) {
		System.out.println("enter 3 numbers");
		Scanner sc=new Scanner(System.in);
		int a=sc.nextInt();
		int b=sc.nextInt();
		int c=sc.nextInt();
		Average ob=new Average();
		ob.Averageofnumbers(a,b,c);

	}
public void Averageofnumbers(int a,int b,int c)
{
	int s=a+b+c;
	int r=s/3;
	System.out.println(r);
	
}

}