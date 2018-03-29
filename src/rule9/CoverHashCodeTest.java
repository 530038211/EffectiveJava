package rule9;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;

public class CoverHashCodeTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        HashSet<CoverHashCode> hashSet = new HashSet<CoverHashCode>();
        hashSet.add(new CoverHashCode(1,1,1));
        hashSet.add(new CoverHashCode(1,1,1));
        for (Object hs : hashSet) {
            System.out.println(hs);
        }

        CoverHashCode c1 = new CoverHashCode(1, 1, 1);
        CoverHashCode c2 = new CoverHashCode(1, 1, 1);
        System.out.println(c1.equals(c2));
        System.out.println(c1.hashCode());
        System.out.println(c2.hashCode());

        Map<CoverHashCode, String> map = new HashMap<CoverHashCode, String>();
        map.put(c1, "jack");
        System.out.println(map.get(c1));
	}

}
