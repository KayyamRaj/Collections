package Set_;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
class student{
	int age ;
	String name ;
	
	
	
	public student(int age, String name) {
		// TODO Auto-generated constructor stub
		this.age=age;
		this.name=name;
	}




	public int getAge() {
		return age;
	}




	public void setAge(int age) {
		this.age = age;
	}




	public String getName() {
		return name;
	}




	public void setName(String name) {
		this.name = name;
	}




	@Override
	public String toString() {
		return "student [age=" + age + ", name=" + name + "]";
	}
	
}

public class comparableAndcomparatorDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
//		Comparator <Integer> com =  new Comparator<Integer> () {
//
//			@Override
//			public int compare(Integer i, Integer j) {
//				// TODO Auto-generated method stub
//				if(i%10 > j%10)
//					return 1;
//				else 
//					return -1;
//			}
//			
//		};
//		List<Integer> nums=new ArrayList();
//		nums.add(12);
//		nums.add(23);
//		nums.add(51);
//		nums.add(47);
//		System.out.println(nums);
//		Collections.sort(nums,com);
//		
//		System.out.println(nums);
//
//	}
//
//}
		
		//We use comparator for Custom Sorting 
		Comparator <student> com=new Comparator<>() {

			@Override
			public int compare(student i, student j) {
				// TODO Auto-generated method stub
				if (i.age <j.age)
					return 1;
				else
					return -1;
			}
			
		};
		
		List<student>students=new ArrayList();
		students.add(new student(21,"Raj"));
		students.add(new student(11,"Ravi"));
		students.add(new student(23,"Raju"));
		students.add(new student(13,"shiva"));
		for (student x:students) {
			System.out.println(x);
		}
		System.out.println("***********************");
		
		Collections.sort(students,com);
		for (student x:students) {
			System.out.println(x);
		}
		
		
		
		
		
		
	}
}
