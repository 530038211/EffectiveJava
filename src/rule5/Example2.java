package rule5;

/**
 * 2、用valueOf()静态工厂方法代替构造器
 * 对于同时提供了静态工厂方法和构造器的不可变类，
 * 通常可以使用静态工厂方法而不是构造器，以避免创建不必要的对象。
 * 例如，静态工厂方法Boolean.valueOf(String)几乎总是优先于构造器Boolean(String)。
 * 构造器在每次被调用的时候都会创建一个新的对象，而静态工厂方法则从来不要求这样做，实际上也不会这样做。
 */
public class Example2 {
	public static void main(String[] args) {
        // 使用带参构造器
        Integer a1 = new Integer("1");
        Integer a2 = new Integer("1");
        
        //使用valueOf()静态工厂方法
        Integer a3 = Integer.valueOf("129");
        Integer a4 = Integer.valueOf("129");
        
        //结果为false，因为创建了不同的对象
        System.out.println(a1 == a2);
        
        //结果为true，因为不会新建对象
        System.out.println(a3 == a4);
    }
}
