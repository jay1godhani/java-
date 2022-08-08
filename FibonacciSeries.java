import java.util.Scanner;
public class FibonacciSeries {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
			
			int n1=0,n2=1,num,n;
			
			Scanner scan = new Scanner(System.in);
			System.out.println("Enter number to print Fibonacci Series : ");
			n = scan.nextInt();
			
			System.out.println("Fibonacci Series : ");
			if(n==1) {
				System.out.println(n1);
			}
			else if(n==2) {
				System.out.println(n1+","+n2);
			}
			else {
				System.out.print(n1+","+n2);
				for(int i=2;i<n;i++) {
					num = n1 + n2;
					System.out.print(","+num);
					n1 = n2;
					n2 = num;
				}
			}

		

	

	}

}
