package testers;

import classes.SLL;

public class ReverseTester {

	public static void main(String[] args) {
		SLL<Integer> list = new SLL<Integer>();
		
		list.addFirst(1);
		list.addFirst(2);
		list.addFirst(3);
		list.addFirst(4);
		list.addFirst(5);
		
		System.out.println("Original list: " + list.toString());
		
		list.reverse();
		
		System.out.println("Reversed list: " + list.toString());
	}

}
