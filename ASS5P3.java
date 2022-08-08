import java.util.*;
public class ASS5P3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int i;
		System.out.println("1.HashSet---------Press 1 for displaying HashSet");
		System.out.println("2.TreeSet---------Press 2 for displaying TreeSet");
		System.out.println("Choose Which You Want to Perform Action : ");
		i = sc.nextInt();
		
		switch(i)
		{
			case 1:
				HashSet<Integer> set = new HashSet<Integer>();
				
				set.add(100);
				set.add(200);
				set.add(300);
				set.add(400);
				set.add(500);
				set.add(600);
				set.add(700);
				
				System.out.println("The Size Of HashSet Is : "+set.size());
				System.out.println("The Elements in HashSet Is : "+set);
				
				set.remove(300);
				System.out.println("The Elements in HashSet After Removing 20 : "+set);
				
				System.out.println("Is 100 is HashSet : "+set.contains(100));
				
				set.clear();
				System.out.println("The Elements in HashSet After Clear : "+set);
				
				break;
			case 2:
				TreeSet<Integer> list = new TreeSet<Integer>();
				
				list.add(100);
				list.add(200);
				list.add(300);
				list.add(400);
				list.add(500);
				list.add(600);
				list.add(700);
				
				System.out.println("The Size Of TreeSet Is : "+list.size());
				System.out.println("The Elements in TreeSet Is : "+list);
				
				list.remove(200);
				System.out.println("The Elements in TreeSet After Removing 300 : "+list);
				
				System.out.println("Is 10 is TreeSet : "+list.contains(150));
				
				list.clear();
				System.out.println("The Elements in TreeSet After Clear : "+list);
				
				break;
			default :
				System.out.println("Please Enter Valid Number....");
		}

	}

}
