package rule5;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

/**
 * Map接口的keySet方法返回该Map对象的Set视图，其中包含该Map中所有的键（key）。
 * 粗看起来，好像每次调用keySet都应该创建一个新的Set实例，
 * 但是，对于一个给定的Map对象，实际上每次调用keySet都返回同样的Set实例。
 * 虽然被返回的Set实例一般是可改变的，但是所有返回的对象在功能上是等同的：
 * 当其中一个返回对象发生变化的时候，所有其他返回对象也要发生变化，
 * 因为它们是由同一个Map实例支撑的。虽然创建keySet视图对象的多个实例并无害处，却也是没有必要的。
 *
 */
public class TestKeySet {
	public static void main(String[] args) {
        
        Map<String,Object> map = new HashMap<String,Object>();
        map.put("A", "A");
        map.put("B", "B");
        map.put("C", "C");
        
        Set<String> set = map.keySet();
        Iterator<String> it = set.iterator();
        while(it.hasNext()){
            System.out.println(it.next()+" aaaaa");
        }
        
        System.out.println("---------------");
        
        map.put("D", "D");
        set = map.keySet();
        it = set.iterator();
        while(it.hasNext()){
            System.out.println(it.next()+" bbbb");
        }
        
    }
}
