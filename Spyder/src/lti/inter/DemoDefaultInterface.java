package lti.inter;

public class DemoDefaultInterface {
	public static void main(String[] args) {
		Employee.showMax(10, 20);
		
		/*Employee emp = new Employee() {
			@Override
			public double getSalary() {
				return 5000;
			}
			
			@Override
			public int getDeptNo() {
				return 10;
			}
		};*/
		
//		Employee emp = () -> 20;
//		Employee emp = () -> { return 20; };
		Employee emp = new Employee() {
			@Override
			public int getDeptNo() {
				return 20;
			}
		};
		
		emp.printDept();
//		emp.printState();
		
		Employee.showDept(emp);
		Employee.showDept(() -> 10);
	}
}
