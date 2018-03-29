package rule12;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class ComparableDemo {

	public static void main(String[] args) {

		List<Employee> ts1 = new ArrayList<Employee>();
		ts1.add(new Employee("Tom", 40000.00));
		ts1.add(new Employee("Harry", 20000.00));
		ts1.add(new Employee("Maggie", 50000.00));
		ts1.add(new Employee("Chris", 70000.00));
		Collections.sort(ts1); //集合sort 按照这个对象实现的compareTo方法实现 进行排序的
		ts1.forEach(System.out::println);

		System.out.println("-------------------Array--------------------");
		Employee[] oneArray = { new Employee("Peter", 30000.00), new Employee("Harry", 20000.00),new Employee("Maggie", 50000.00) };
		
		Arrays.sort(oneArray); //数组
		for (Employee one : oneArray) {
			System.out.println(one + "\n");
		}
	}
}