package array;

import java.util.Scanner;

public class Singledimensional {
	
	public static void main(String[] args) {
		int[] a=new int[3];
Scanner sc=new Scanner(System.in);
System.out.println("enter numbers");
for(int i=0;i<3;i++)
{
a[i]=sc.nextInt();
}

		for(int i=0;i<3;i++)
		{
			System.out.println(a[i]);
		}

	}

}
