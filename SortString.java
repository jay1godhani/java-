import java.util.Scanner;
public class SortString {

	public static void main(String[] args) {
		
		
		int n;
		System.out.print("How many string do you enter : ");
		Scanner sc=new Scanner(System.in);
		n=sc.nextInt();
		String s1[]=new String[n];
		for(int i=0;i<n;i++){
		System.out.print("Enter String"+(i+1)+" : ");
		s1[i]=sc.next(); 
		}
		for(int i = 0; i<n-1; i++)   { 
		   for (int j = i+1; j<n; j++)   {  
		        if(s1[i].compareTo(s1[j])>0) {  
		           String temp =s1[i];  
		           s1[i] = s1[j];  
		           s1[j] = temp;  
		        }  
		    }  
		}  
		 System.out.print("After Sort: ");
		 for(int i=0;i<n;i++){
		System.out.print(s1[i]+" , ");
		}
		 sc.close();
		}

}

	


