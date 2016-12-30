package orhter.demo.staticblock;

class C extends A {
	/* ����2���췽�� */
	public C() {
		System.out.println("C constructor");
	}

	/* ����2��̬�� */
	static {
		System.out.println("C static Block");
	}

	/* ����2�Ǿ�̬�� */
	{
		System.out.println("C non-static Block");
	}

	/* ����2��̬���� */
	public static void printStaticMethod() {
		System.out.println("C print Static Method");
	}

	/* ����2û��override�������ͨ���� */
}
