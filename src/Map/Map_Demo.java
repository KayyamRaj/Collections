package Map;

import java.util.HashMap;

public class Map_Demo {
	public static void main(String[] args) {
		HashMap hm= new HashMap();
		hm.put("Raj", 10);
		hm.put("Ravi", 11);
		hm.put("Rajender", 12);
		System.out.println(hm);
		System.out.println(hm.keySet());
		System.out.println(hm.entrySet());
	}

}
