package orhter.demo.dispatch;
/**
 * 这个地方需要和多态进行区分
 * 多态，需要1继承2覆盖3父类引用指向子类
 * 
 * 这个StaticDispatch例子检验的是重载overload
 * 
 * */

public class StaticDispatch {
	static abstract class Human{}
	static class Man extends Human{}
	static class Woman extends Human{}
	
	public void sayHello(Human guy){
		System.out.println("hello ,guy");
	}
	public void sayHello(Man guy){
		System.out.println("hello ,man");
	}
	public void sayHello(Woman guy){
		System.out.println("hello ,woman");
	}
	public void sayHello(OtherMan guy){
		System.out.println("hello ,OtherMan");
	}
	public static void main(String[] args) {
		Human man=new Man();
		Human woman=new Woman();
		Human ohterMan=new OtherMan();
		
		StaticDispatch sd=new StaticDispatch();
		sd.sayHello(man);
		sd.sayHello(woman);
		sd.sayHello(ohterMan);
	}
}
