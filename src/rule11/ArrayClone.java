package rule11;

import java.util.Arrays;

import rule11.vo.Teacher;

public class ArrayClone {
	public static void main(String[] args) {
		simple();
		simple2();
	}

	private static void simple() {
		int[] a1 = { 1, 2, 3, 4 };
		int[] a2 = (int[]) a1.clone();
		System.out.println(Arrays.toString(a2));

		String[] s1 = { "hello", "china" };
		String[] s2 = (String[]) s1.clone();
		System.out.println(Arrays.toString(s2));

	}

	private static void simple2() {
		Teacher p1 = new Teacher("wangwu", 18);
		Teacher p2 = new Teacher("lisi", 28);
		Teacher[] tArray1 = { p1, p2 };
		Teacher[] tArray2 = tArray1.clone();
		
		tArray2[0].setName("wangXXX");
		tArray2[0].setAge(22);
		System.out.println("name=" + p1.getName() + ",age=" + p1.getAge());
	}
}
