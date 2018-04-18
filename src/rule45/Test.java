package rule45;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;

public class Test {
    /**
     * 将局部变量最小化
     * @param args
     */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int sum = 0;
        for(int i = 0;i< 10 ;i++){
        	sum += i;
        }
    	System.out.println(sum);
    	
        Collection<String> c2= Arrays.asList("3","4","5");
        for(Iterator<String> i = c2.iterator();i.hasNext();){
        	i.next();
        }
        //增强for循环
        for(String c:c2){
        	c = "0";
        }
        System.out.println(String.join("", c2));
        
        
        List<String> l = new ArrayList<>();
        l.add("1");
        l.add("2");
        for(int i = 0;i<l.size();i++){
        	if(l.get(i).equals("2")){
                l.remove("2");
        	}
        }
	}

}
