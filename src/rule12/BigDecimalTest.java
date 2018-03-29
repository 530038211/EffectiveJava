package rule12;

import java.math.BigDecimal;
import java.util.HashSet;
import java.util.Set;
import java.util.TreeSet;

public class BigDecimalTest {

	public static void main(String[] args) {
		
		
		BigDecimal b1 = new BigDecimal("1.0");
		BigDecimal b2 = new BigDecimal("1.00");
		
		System.out.println(b1.equals(b2));
		System.out.println(b1.compareTo(b2));
		
		System.out.println("====================================");
		
		Set<BigDecimal> set1 = new HashSet<>();
		set1.add(b1);
		set1.add(b2);
		System.out.println(set1.size());
		
		Set<BigDecimal> set2 = new TreeSet<>();
		set2.add(b1);
		set2.add(b2);
		System.out.println(set2.size());
	}
}
