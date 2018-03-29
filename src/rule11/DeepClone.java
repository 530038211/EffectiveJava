package rule11;

import java.io.IOException;

import rule11.vo.Professor;

public class DeepClone {
    //深拷贝是从流中读取
	public static void main(String[] args) throws ClassNotFoundException, IOException {
		Professor professor1 = new Professor("professor zhang",20);
		Professor professor2 = (Professor) professor1.deepClone();
		professor1.setName("professor wu");
		professor1.setAge(21);
		
		System.out.println(professor1.getName());
		System.out.println(professor1.getAge());
		System.out.println(professor2.getName());
		System.out.println(professor2.getAge());
	}

}
