package rule18;
/**
 * 类实现接口，必须实现接口的所有方法
 * Comparable这个接口就是用来比较大小的,当必须特定操作，就要实现这个接口
 *
 */
public class People extends Object implements Comparable<Object>{

	private String name;
	
	private int age;
	
	public People(String name,int age){
		this.name = name;
		this.age = age;
	}
	
	@Override
	public int compareTo(Object o) {
		People p = (People) o;
		if(this.age > p.age){
			return 1;
		}else if(this.age == p.age){
			return 0;
		}else{
			return -1;
		}
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

}
