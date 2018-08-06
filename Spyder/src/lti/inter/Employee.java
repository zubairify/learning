package lti.inter;

@FunctionalInterface
public interface Employee {
//	double getSalary();
	int getDeptNo();
	
	default void printDept() {
		System.out.println(getDeptNo()==10?"Sales":"Accounts");
	}
	
	static void showDept(Employee e) {
		System.out.println(e.getDeptNo());
	}
	
//	default void printState() {
//		System.out.println("Salary: " + getSalary() + "\tDept NO:" + getDeptNo());
//	}
	
	static void showMax(int a, int b) {
		System.out.println(a>b?a:b);
	}
}
