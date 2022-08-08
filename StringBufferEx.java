import java.util.Scanner;
public class StringBufferEx {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		StringBuffer sb=new StringBuffer("Computer ");
		System.out.println("Initial String : "+sb);
		sb.append("Engineering ");
		System.out.println("After append java : "+sb);
		sb.insert(9,"Science ");
		System.out.println("After insert Advance at 6 : "+sb);
		sb.replace(0,5,"Hii");  
		System.out.println("capacity now : " +sb.capacity());
		System.out.println("After replace Hello with Hii : "+sb);
		sb.delete(4,12);  
		System.out.println("After delete Advance : "+sb);
		sb.reverse(); 
		System.out.println("After reverse : "+sb);
		System.out.println("capacity : "+sb.capacity());
		sb.delete(0,9); 
		sb.append("append large to check capacity incresing");  
		System.out.println("After append : "+sb);
		System.out.println("new capacity : "+sb.capacity());
		System.out.println("Char At 10: "+sb.charAt(10));
		System.out.println("length of string : "+sb.length());
		System.out.println("Sub string at index 31 : "+sb.substring(31));
		System.out.println("ubstring from the specified 7 and 12 : "+sb.substring(7,12));
		 

	}

}
