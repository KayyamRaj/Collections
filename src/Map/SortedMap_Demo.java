package Map;

import java.util.SortedMap;
import java.util.TreeMap;

public class SortedMap_Demo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		SortedMap SM= new TreeMap();
		SM.put("shiva", 1004);
		SM.put("raj", 1000);
		SM.put("ravi", 1001);
		SM.put("ambika", 1002);
	//It will print in SortedOrder
		System.out.println(SM);
		System.out.println(SM.headMap("raj"));
		System.out.println(SM.tailMap("ravi"));

	}

}
