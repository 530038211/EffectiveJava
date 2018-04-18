package rule30;

public class Test {
	public enum Style{aa,bb,cc}
    public final static int apple_small = 0;
	public static void main(String[] args) {
		System.out.println(Runtime.getRuntime().availableProcessors());
		System.out.println(Orange.ORANGE_SMALL.ordinal()==Apple.APPLE_SMALL.ordinal());
		System.out.println(Orange.ORANGE_SMALL.ordinal()==apple_small);
		System.out.println(Orange.ORANGE_SMALL);
		System.out.println(Orange.ORANGE_SMALL.ordinal());
		System.out.println(Orange.ORANGE_BIG.ordinal());
		System.out.println(Orange.ORANGE_OLD.ordinal());
		System.out.println(Style.aa.ordinal());
		//
		float a = Float.parseFloat("11.4");
		System.out.println(a);
	}

}
