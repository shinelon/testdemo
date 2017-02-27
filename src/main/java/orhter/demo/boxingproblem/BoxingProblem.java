package orhter.demo.boxingproblem;

public class BoxingProblem {
	/**自动装箱和拆箱的结果（反编译class获得）
	 * Integer a = Integer.valueOf(1);
		Integer b = Integer.valueOf(2);
		Integer c = Integer.valueOf(3);
		Integer d = Integer.valueOf(3);
		Integer e = Integer.valueOf(123);
		Integer f = Integer.valueOf(123);
		Long g = Long.valueOf(3L);
		System.out.println(c == d);
		System.out.println(e == f);
		System.out.println(c.intValue() == a.intValue() + b.intValue());
		System.out.println(c.equals(Integer.valueOf(a.intValue() + b.intValue())));
		System.out.println(g.longValue() == (long)(a.intValue() + b.intValue()));
		System.out.println(g.equals(Integer.valueOf(a.intValue() + b.intValue())));
	 *
	 *结论：包装类的“==”运算在不遇到算术运算的情况下不会自动拆箱，他们的equals()方法不处理数据转型的关系 
	 * */
	public static void main(String[] args) {
		Integer a = 1;
		Integer b = 2;
		Integer c = 3;
		Integer d = 3;
		Integer e = 123;
		Integer f = 123;
		Long g = 3l;
		System.out.println(c == d);
		System.out.println(e == f);
		System.out.println(c == (a + b));
		System.out.println(c.equals(a + b));
		System.out.println(g == (a + b));
		System.out.println(g.equals(a + b));
	}
}
