package rule11;

import rule11.vo.Student;
import rule11.vo.Teacher;

public class StudentAndTeacher {
	public static void main(String[] args) throws CloneNotSupportedException {
	    Teacher teacher = new Teacher("Teacher Zhang", 40);
	    
	    Student student1 = new Student();
	    student1.setName("ZhangSan");
	    student1.setAge(20);
	    student1.setTeacher(teacher);
	    
	    Student student2 = (Student) student1.clone();
	    System.out.println("------------teacher修改前--------------:");
	    System.out.println(student2.getName());
	    System.out.println(student2.getAge());
	    System.out.println(student2.getTeacher().getName());
	    System.out.println(student2.getTeacher().getAge());
	    
	    System.out.println("------------teacher修改后 ------------");
	    // 修改老师的信息
	    teacher.setName("Teacher 王");
	    System.out.println(student1.getTeacher().getName());
	    System.out.println(student2.getTeacher().getName());
	    
	    // 得出结论 :  两个引用student1和student2中的两个teacher引用指向的是同一个对象
	}

}
