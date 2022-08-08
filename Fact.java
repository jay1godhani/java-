import java.util.Scanner;
public class Fact {

	public static void main(String[] args) {
		int i,fact=1;
		Scanner scan = new Scanner(System.in);
		
		System.out.println("Enter Number to find factorial : ");
		int num = scan.nextInt();
		
		for(i=1;i<=num;i++) {
			fact = fact * i;
		}
		System.out.println("Factorial of "+num+" is "+fact);

	}


	}


