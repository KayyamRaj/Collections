package Map;

import java.util.HashMap;
import java.util.IdentityHashMap;

public class IdentityHashMapDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		HashMap h= new HashMap();
		Integer i1= new Integer (10);
		Integer i2= new Integer (10);
		h.put(i1,"raj");
		h.put(i2,"shekar");
		//(In normal HashMap objects )raj will replace by shekar(Map means no duplicate keys ) beacuse JVM Will check equals meathods b/w i1 and i2
		System.out.println(h);
		
	
		
		
		
		System.out.println("**********************************************");
		//To Remove Above problem we need to go for IdentityHashmap == operator internally used by the JVM
		IdentityHashMap IH= new IdentityHashMap();
		Integer i3= new Integer (10);
		Integer i4= new Integer (10);
		
		IH.put(i3, "raj");
		IH.put(i4, "shekar");
		System.out.println(IH);

	}

}
