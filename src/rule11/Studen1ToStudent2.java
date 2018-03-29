package rule11;

import rule11.vo.Student;

public class Studen1ToStudent2 {

	public static void main(String[] args) throws CloneNotSupportedException {
        Student s1 = new Student();
        s1.setName("zhangsan");
        s1.setAge(11);
        //浅拷贝
        Student s2 = (Student) s1.clone();
		System.out.println(s2.getName());
		System.out.println(s2.getAge());
		//s1和s2不是一个对象，修改了s2的值,s1不受影响
		changeInfo(s1,s2);
	}
	
	public static void changeInfo(Student s1,Student s2){
		s2.setName("lisi");
		s2.setAge(12);
		
		System.out.println(s1.getName());
		System.out.println(s1.getAge());
		
		System.out.println(s2.getName());
		System.out.println(s2.getAge());		
	}

}
