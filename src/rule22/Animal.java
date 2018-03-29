package rule22;

public class Animal extends Thread{
    //内部类静态成员
	public static class Cat{
		public static String name;
	}
	
	public class Dog{
		public  void eat(){
			System.out.println("dog eat meet");
		}
	}
	
}
