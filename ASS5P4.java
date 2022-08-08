import java.util.*;
public class ASS5P4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Stack<Integer> stack = new Stack<Integer>();
		stack.push(11);
		stack.push(22);
		stack.push(33);
		stack.push(44);
		stack.push(55);
		stack.push(66);
		stack.push(77);
		stack.push(88);
		
		System.out.println("The Element pushed in Stack is :: "+stack);
		
		int element1 = (int) stack.pop();
		int element2 = (int) stack.pop();
		int element3 = (int) stack.pop();
		
		System.out.println("Poped Elements Are :: "+element1+" , "+element2+" , "+element3);
		
		System.out.println("The Element in Stack After Poped Elements is :: "+stack);

	}

}
