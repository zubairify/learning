package lti.sam;

public class TestHello implements Hello {
	
	@Override
	public void sayHello() {
		System.out.println("First Hello");
	}
	
	static class InnerHelloImpl implements Hello {
		@Override
		public void sayHello() {
			System.out.println("Second Hello");
		}
	}
	
	public void tryingHello() {
		class FunctionInnerHelloImpl implements Hello {
			@Override
			public void sayHello() {
				System.out.println("Third Hello");
			}
		};
		Hello h = new FunctionInnerHelloImpl();
		h.sayHello();
	}
	
	public void tryingHelloAgain() {
		new Hello() {
			@Override
			public void sayHello() {
				System.out.println("Forth Hello");
			}
		}.sayHello();
	}
	
	public static void main(String[] args) {
		TestHello test = new TestHello();
		test.sayHello();
		
//		InnerHelloImpl inner = test.new InnerHelloImpl();	-> Non-static inner class
		InnerHelloImpl inner = new TestHello.InnerHelloImpl();	// Instantiating static inner class
		inner.sayHello();
		
		test.tryingHello();
		test.tryingHelloAgain();
		
		Hello hey = () -> System.out.println("Fifth Hello");
		hey.sayHello();
	}
}
