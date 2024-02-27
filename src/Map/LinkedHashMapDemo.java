
package Map;

import java.util.Iterator;
import java.util.LinkedHashMap;

public class LinkedHashMapDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		LinkedHashMap<String,Integer> LHM= new LinkedHashMap();
		
		LHM.put("ravi",1000);
		LHM.put("rajender", 1003);
		LHM.put("shiva", 1000);
		LHM.put("raj", 1000);
		//Insertion OrderPreserved
		System.out.println(LHM);
	
		

}

}
