package ArrayList;

import java.util.ArrayList;

public class EmployeeArraylist {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Employee emp= new Employee("raj","xx10",10000,"Irving,Texas");
		ArrayList<Object> emplist=new ArrayList<>();
		emplist.add(emp);
		System.out.println(emplist);
		for (int i=0;i<emplist.size();i++) {
			System.out.println(emplist.get(i));
		}

	}

}
