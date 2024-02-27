package Vector;

import java.util.Collections;
import java.util.Vector;

public class BasicsOfVector {
	public static void main(String[] args) {
		Vector v= new Vector ();
		v.add(10);
		v.add("raj");
		v.add('s');
		v.add(10.8);
		System.out.println(v);
	
		System.out.println(v);
		
		for (int i=0;i<v.size();i++) {
			System.out.println(v.get(i));
			  
		}
		 System.out.println(v.capacity());  
	}

}
