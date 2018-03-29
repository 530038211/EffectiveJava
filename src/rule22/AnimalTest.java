package rule22;

public class AnimalTest extends Thread{
	
    public static void main(String[] args) {
    	
    	Animal.Cat.name = "mimi";
    	//匿名类
    	new Thread(new Runnable() {				
			public void run() {
				System.out.println(Animal.Cat.name);

			}
		}).start();
    }
}
