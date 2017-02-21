package orhter.demo.dispatch;

public class DynamicDispatch {
	static abstract class Human {
		protected abstract void sayHello();
	}

	static class Man extends Human {

		@Override
		protected void sayHello() {
			System.out.println("man");
		}
	}

	static class Woman extends Human {

		@Override
		protected void sayHello() {
			System.out.println("woman");
		}
	}
	public static void main(String[] args) {
		Human man=new Man();
		Human woman=new Woman();
		man.sayHello();
		woman.sayHello();
		man=new Woman();
		man.sayHello();
	}
}
