package Map;

import java.util.WeakHashMap;

public class WeakHashMap_Demo {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		
		/*
		 * The following code will not kill the object by garbage collector because 
		 * Hashmap is Stronger  than Garbage collector in this case , So it will display raj 2 times 
		 */
		
//		HashMap HM= new HashMap();
//		temp t= new  temp();
//		HM.put(t, "raj");
//		System.out.println(HM);
//		t=null;
//		System.gc();
//		Thread.sleep(5000);
//		System.out.println(HM);
		/*
		 * The following code will  kill the object by garbage collector because 
		 * WeakHashmap not stronger   than Garbage collector in this case  it will call the finalize method kills the object
		 */
		WeakHashMap HM= new WeakHashMap();
		temp t= new  temp();
		HM.put(t, "raj");
		System.out.println(HM);
		t=null;
		System.gc();
		Thread.sleep(5000);
		System.out.println(HM);
		
		
	}

}
class temp {
	public String toString() {
		return "temp";
	}
	public void finalize() {
		System.out.println("Finalize method is called");
	}
	
	
}
