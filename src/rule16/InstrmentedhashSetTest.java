package rule16;

import java.util.Arrays;
import java.util.List;

public class InstrmentedhashSetTest {

	public static void main(String[] args) {
		
		InstrumentedHashSet<String> instrumentedHashSet = new InstrumentedHashSet<String>();
		List<String> sList = Arrays.asList("aa","bb","cc");
		instrumentedHashSet.addAll(sList);
		System.out.println(instrumentedHashSet.getAddCount());
	}

}
