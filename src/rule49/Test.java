package rule49;

public class Test {
   static Integer num; //static 默认初始化

  public static void main(String args[]){
	  if(num == 0){
		  System.out.print(true); //nullPointerException num是引用数据类型 默认null
	  }
	  
	  Long sum = 0l;
	  for(long i =0;i<0;i++){
		  sum = sum + i; //效率更慢 需要自动拆装箱
	  }
  }
}
