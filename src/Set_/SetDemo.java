package Set_;

import java.util.HashSet;
import java.util.SortedSet;
import java.util.TreeSet;

public class SetDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		HashSet s=new HashSet();
		s.add(10);
		s.add("raj");
		s.add('c');
		s.add(13.4);
		System.out.println(s);
		SortedSet<Integer> ss=new TreeSet<>();
		ss.add(10);
		ss.add(2);
		ss.add(1);
		ss.add(5);
		ss.add(4);
		System.out.println(ss);
		System.out.println(ss.tailSet(4));
		System.out.println(ss.subSet(2, 6));
		TreeSet <Integer>ts = new TreeSet<Integer>();
		ts.add(10);
		ts.add(20);
		ts.add(15);
		System.out.println(ts);
		
	
		
		
		
		

	}

}
