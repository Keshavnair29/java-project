package array;

import java.util.Scanner;

public class Stringprogramms {

	public static void main(String[] args) {
		//1
		
		String a="jmeter ";
		String b="performance testing tool";
		System.out.println(a.concat(b));
		
		
		//2
		String c="java language is platform dependant";
		System.out.println(c.contains("language"));
		
		//4
		String d="selenium webdriver is used for webapplication testing";
		
		
		
		
		//3
		System.out.println("enter a string");
		Scanner sc=new Scanner(System.in);
		String s1=sc.nextLine();
		int f=0;
		
		for(int i=0;i<s1.length();i++)
		{
			if(s1.charAt(i) == 'a'||s1.charAt(i)=='e'||s1.charAt(i)=='i'||s1.charAt(i)=='o'||s1.charAt(i)=='u')
			{
				f++;
			}
		}
			
			System.out.println("vowel count="+f);
			
			}			
					
		
	}
		

	
