package orhter.demo.factory.simplefactory;

public class Computer {
	private Output out;

	public Computer(Output out) {
		this.out = out;
	}

	public void keyIn(String str) {
		out.getData(str);
	}

	public void print() {
		out.out();
	}

	public static void main(String[] args) {
		OutputFactory of = new OutputFactory();
		Computer c = new Computer(of.getOutput());
		c.keyIn("����ģʽ֮");
		c.keyIn("�򵥹���ģʽ");
		c.print();
	}
}
