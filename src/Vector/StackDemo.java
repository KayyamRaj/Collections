package Vector;

import java.util.Enumeration;
import java.util.Stack;

public class StackDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Stack<Integer> s= new Stack();
		s.add(12);
		s.add(1);
		s.add(142);
		s.add(13);
		System.out.println(s);
		
     s.pop();
     System.out.println(s);
     s.push(19);
     System.out.println(s);
     System.out.println(s.peek());
     System.out.println("**********************");
     //Cursor --> getting the collection Objects one by one 
     Enumeration e=s.elements();
     while(e.hasMoreElements()) {
    	 System.out.println(e.nextElement());
     }
  
 
		
	

	}

}
