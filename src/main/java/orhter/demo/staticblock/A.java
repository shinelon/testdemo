package orhter.demo.staticblock;

public class A {
	/* ���๹�췽�� */
	public A() {
		System.out.println("A constructor");
	}

	/* ���ྲ̬�� */
	static {
		System.out.println("A static Block");
	}

	/* ����Ǿ�̬�� */
	{
		System.out.println("A non-static Block");
	}

	/* ���ྲ̬���� */
	public static void printStaticMethod() {
		System.out.println("A print Static Method");
	}

	/* ������ͨ���� */
	public void printNormalMethod() {
		System.out.println("A print Normal Method");
	}
}
