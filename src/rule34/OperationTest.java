package rule34;

import java.util.Arrays;
import java.util.List;

import com.sun.corba.se.spi.orb.Operation;

@SuppressWarnings("unused")
public class OperationTest {

	public static void main(String[] args) {
		int[] x = {1,3,4,5,7};
		List<int[]> a = Arrays.asList(x);
        System.out.println(a.get(0));
	}
	
	private static <A  extends Enum<A>& Operation> void test(Class<A> opSet,double x,double y){
		Operation[] enumConstants = opSet.getEnumConstants();
		for (int i = 0; i < enumConstants.length; i++) {
			Operation op = enumConstants[i];
			System.out.println(op);
		}
	}

}
