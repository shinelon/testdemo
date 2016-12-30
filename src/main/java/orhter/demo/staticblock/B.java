package orhter.demo.staticblock;

class B extends A {
	/* ����1���췽�� */
	public B() {
		System.out.println("B constructor");
	}

	/* ����1��̬�� */
	static {
		System.out.println("B static Block");
	}

	/* ����1�Ǿ�̬�� */
	{
		System.out.println("B non-static Block");
	}

	/* ����1��̬���� */
	public static void printStaticMethod() {
		System.out.println("B print Static Method");
	}

	/* ����1��ͨ���� */
	public void printNormalMethod() {
		System.out.println("B print Normal Method");
	}
}
