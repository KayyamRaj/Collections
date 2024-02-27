package Linked_List;


import java.util.LinkedList;
import java.util.List;


public class FirstLinkedList {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		LinkedList LL= new LinkedList();
		System.out.println("We can Add any DataType to Linked List");
		LL.add("Raj");
		LL.add(10);
		LL.add('s');
		LL.add(10.7);
		System.out.println(LL);
		LL.add(3, 12);
		System.out.println(LL);
	System.out.println(LL.peek());	
	System.out.println(LL.poll());	
	System.out.println(LL.peekLast());	
	
	System.out.println(LL.contains(LL));	

	}

}
