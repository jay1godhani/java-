import java.util.*;
public class ASS5P1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayList<Integer> arr = new ArrayList<Integer>();
		arr.add(11);
		arr.add(22);
		arr.add(33);
		arr.add(44);
		arr.add(55);
		arr.add(66);

		System.out.println("The size of array is = " + arr.size());

		System.out.println("The contents of arryalist is =" + arr);

		arr.add(2, 25);
		arr.add(3, 45);

		System.out.println("The contencts of arraylist is =" + arr);

		arr.remove(1);
		arr.remove(4);

		System.out.println("The contents of arryalist is =" + arr);

		arr.clear();
		System.out.println("The size of array is = " + arr.size());

	}

}
