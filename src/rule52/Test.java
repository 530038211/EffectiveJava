package rule52;

import java.util.ArrayList;
import java.util.List;
import java.util.Set;
import java.util.Vector;

public class Test {

	public static void main(String[] args) {
		// list是接口可以向下兼容 转型
        List<String> l = new Vector<String>();
        List<String> a = new ArrayList<String>();
        
        try {
			Class<?> c1 = Class.forName(args[0]);
			Set<String> s = (Set<String>) c1.newInstance();

		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IllegalAccessException e) {
			System.exit(1);
			e.printStackTrace();
		}catch (InstantiationException e) {
			System.exit(1);
			e.printStackTrace();
		}
	}

}
