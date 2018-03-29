package rule8;

/**
 * 类 编 号：
 * 类 名 称：
 * 内容摘要：equals对称性
 * 创建日期：2018/2/28
 */
public class Symmetric
{
    private String s;
    //new Symmetric 给 s 赋值
    public Symmetric(String s)
    {
        this.s = s;
    }

    @Override
    public boolean equals(Object obj)
    {
//        第一种情况
        if(obj instanceof Symmetric){
            return s.equalsIgnoreCase(((Symmetric) obj).s);
        }
        if(obj instanceof  String){
            return s.equalsIgnoreCase((String)obj);
        }
//        也可以写成
        return obj instanceof Symmetric && ((Symmetric)obj).s.equalsIgnoreCase(s);
    }


}
