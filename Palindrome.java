import java.util.Scanner;
public class Palindrome {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n,temp,r,s=0;
		Scanner scan = new Scanner(System.in);
		
		System.out.println("Enter Number : ");
		n = scan.nextInt();
		
		temp = n;
		while(n>0) {
			r = n % 10;
			s = (s * 10)+ r;
			n = n / 10;
		}
		if(temp == s) {
			System.out.println(temp+" is Palindrom number");
		}
		else {
			System.out.println(temp+" is not Palindrom number");
		}

	}

}
