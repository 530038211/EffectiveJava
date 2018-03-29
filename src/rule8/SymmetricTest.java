package rule8;

import java.util.ArrayList;
import java.util.List;

public class SymmetricTest {

    public static void main(String[] args)
    {
        Symmetric symmetric = new Symmetric("Avv");
        String s= "avv";
        //重写Symmetric类的equal方法,忽视大小写
        System.out.println(symmetric.equals(s));
        //s自带equals方法要求每一个字符都相等
        System.out.println(s.equals(symmetric));

        List<Symmetric> list = new ArrayList<>();
        list.add(symmetric);
        System.out.println(list.contains(symmetric));
    }

}
