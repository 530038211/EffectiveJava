package rule18;

public class ComparebleTest {
    public static void main(String[] args) {
		People p1 = new People("wang",25);
		People p2 = new People("wu",35);
		//people比较年纪,需要重新实现比较的接口
		if(p1.compareTo(p2)==1){
			System.out.println("王 年纪大于 吴");
		}else if(p1.compareTo(p2)==0){
			System.out.println("王 年纪等于 吴");
		}else{
			System.out.println("王 年纪小于 吴");
		}
	}
}
