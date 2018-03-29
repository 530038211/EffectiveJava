package rule13;

public class Static {
    //成员变量定义为静态私有不可被访问的
	private static final String[] values = {"aa","bb","cc"};
	
	public static final String[] values(){
		return values.clone();
	}
}
