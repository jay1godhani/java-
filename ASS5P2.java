import java.util.LinkedList;
public class ASS5P2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		LinkedList<Integer> list = new LinkedList<>();

		list.add(11);
		list.add(55);
		list.add(77);
		list.add(22);
		list.add(44);
		list.add(66);

		System.out.println("The Size of LinkedList is :: " + list.size());
		System.out.println("The LinkedList is :: " + list);

		System.out.println("First Element is :: " + list.getFirst());

		System.out.println("Last Element is :: " + list.getLast());

	}

}
