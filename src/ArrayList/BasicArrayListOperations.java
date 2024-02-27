package ArrayList;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;

public class BasicArrayListOperations {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayList AL=new ArrayList<> ();
		AL.add("raj");
		AL.add(10);
		AL.add('c');
		AL.add(10.8);
	System.out.println( AL);
	System.out.println(AL.isEmpty());
	 AL.toArray();
	System.out.println(AL);
	//AL.clear();
	ArrayList list=new ArrayList(AL);
	System.out.println(list);
	System.out.println(list.indexOf('c'));
	
	//Type Safety Collections
	ArrayList <String>list2 = new ArrayList();
	list2.add("shiva");
	list2.add("sheela");
	list2.add("mala");
	list2.add("ravi");
	
	Iterator <String >itr =list2.iterator();
	System.out.println("*****************");
	while (itr.hasNext()) {
		System.out.println(itr.next());
	}
	System.out.println("***********************");
	System.out.println(list2);
	//We are Making Collection As Read only if we want to add any element to it
	//it will throw the exception as 
	//Before java 9
//	list2=(ArrayList<String>) Collections.unmodifiableList(list2);
//	list2.add("ram");
	System.out.println(list2);
	//in java 9
	ArrayList<String > list3= new ArrayList();
	list3.add("shiva");
	list3.add("raghav");
	list3.add("keahsva");
	list3.add("madhu");
//	list3=Collections.unmodifiableList(list3);
//	System.out.println(list3);
	
	//Sorting the list 3
	Collections.sort(list3);
	System.out.println(list3);
	//Clonning of an Arraylist
	ArrayList clonedlist= (ArrayList) list3.clone();
	System.out.println(clonedlist);
	
	
	
	
	
  

	}

}
