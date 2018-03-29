package rule5;

/**
 * 变量sum被声明成Long而不是long，意味着程序构造了大约2的31次方个多余的Long实例
 * （大约每次往Long sum中增加long时构造一个实例）。
 * 将sum的声明从Long改成long，速度快了不是一点半点。
 * 结论很明显：要优先使用基本类型而不是引用类型，要当心无意识的自动装箱。
 *
 * 但是：不要错误地认为"创建对象的代价非常昂贵，我们应该尽可能地避免创建对象"。
 * 相反，由于小对象的构造器只做很少量的显示工作，所以小对象的创建和回收动作是非常廉价的，特别是在现代的JVM实现上更是如此。
 * 通过创建附加的对象，提升程序的清晰性、简洁性和功能性，这通常0是件好事。
 */
public class TestLonglong {
	public static void main(String[] args) {
        long sum = 0L;
        for(long i = 0; i < Integer.MAX_VALUE; i++){
            sum += i;
        }
        System.out.println(sum);
    }
}
