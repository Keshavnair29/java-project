package array;

import java.util.Scanner;

public class Methodsum {
	
	

	public static void main(String[] args) {
		System.out.println("enter a number");
		Scanner sc=new Scanner(System.in);
		int a=sc.nextInt();
		Methodsum ob=new Methodsum();
		ob.sumofintegers(a);
		System.out.println(ob.sumofintegers(a));
		
		
		
		
		
	}
	public int sumofintegers(int a)
	{
		int r,s=0;
		while(a>0)
		{
			r=a%10;
			s=s+r;
			a=a/10;
		}
		return s;
	}

}
