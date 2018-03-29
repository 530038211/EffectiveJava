package rule12;

public class Employee implements Comparable<Employee> {

	private int EmpID;
	private String Ename;
	private double Sal;
	private static int i;

	public Employee() {
		EmpID = i++;
		Ename = "dont know";
		Sal = 0.0;
	}

	public Employee(String ename, double sal) {
		EmpID = i++;
		Ename = ename;
		Sal = sal;
	}

	@Override
	public String toString() {
		return "EmpID " + EmpID + "\n" + "Ename " + Ename + "\n" + "Sal " + Sal;
	}
	
	//可添加更多判断
	@Override
	public int compareTo(Employee arg0) {
		if (Sal < arg0.Sal)
			return -1;
		else if (Sal == arg0.Sal)
			return 0;
		else
			return 1;
	}
}
