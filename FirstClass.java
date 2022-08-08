import java.util.*;
import java.io.*;



class A
{

	
	public void print(int age)
	{
		if(age <18)
		{
			System.out.println("you can't use Services");
		}
		else
		{
			System.out.println("you can  use Services");
		    
			
		}
	}
}

public class FirstClass extends A
{
	
	public static void main(String[] args)
	{
		A a = new A();
		
		
		Scanner sc = new Scanner(System.in);
		int age = sc.nextInt();
		a.print(age);
	}
}
	
	
