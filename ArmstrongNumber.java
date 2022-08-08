import java.util.Scanner;
public class ArmstrongNumber {

	public static void main(String[] args) {
		int n,count,a,b,c,s=0;
		System.out.println("Armstrong numbers between 100 to 1000 : ");
		
		for(int i=100;i<=1000;i++) {
			n=i;
			s=0;
			while(n>0) {
				b = n % 10;
				s = s + (b * b * b);
				n = n / 10;
			}
			if(s==i) {
				System.out.print(i+"  ");
			}
		}


	}

}
