package rule8;

/**
 * 类 编 号：
 * 类 名 称：Test
 * 内容摘要：对于所有实例都通用的方法
 * 创建日期：2018/2/28
 * @author ：huangchenliang
 */
public class ReflexiveTest
{
//    一.什么情况下重写equals方法，有自己特有的“逻辑相等”概念（不同于对象等同概念）
//    二.遵守的约定：
//    a:自反性  x.equals(x) 一定是true
//    b:对称性   x.equals(y)  和  y.equals(x)结果一致
//    c:传递性 a 和 b equals , b 和 c  equals，那么 a 和 c也一定equals。
//    d:一致性  在某个运行时期间，2个对象的状态的改变不会不影响equals的决策结果，那么，在这个运行时期间，无论调用多少次equals，都返回相同的结果。
//    e:非空性

//    三.为什么覆盖equals时总要覆盖hashcode
    public static void main(String[] args)
    {
        Reflexive r = new Reflexive();
        System.out.println(r.equals(r));
    }
}
