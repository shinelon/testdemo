package demo.annotation;

import java.lang.reflect.Field;

public class Test {
	public static void main(String[] args) {
		// Bean bean = new Bean();
		// bean.setAttribute1("1");
		// bean.setAttribute2("2");
		// bean.setAttribute3("3");
		// bean.setAttribute4("4");
		// Class<? extends Object> clz = bean.getClass();
		// Field[] fields = Bean.class.getDeclaredFields();
		// for (Field field : fields) {
		// IsNotNull is = field.getAnnotation(IsNotNull.class);
		// if(is!=null){
		// System.out.println(is.value());
		// }
		//
		// }
		int x = 5, y = 10; // 定义两个变量

		x = x ^ y;
		y = x ^ y; // y=(x^y)^y
		x = x ^ y; // x=(x^y)^x
		System.out.println("x=" + x + " y=" + y);
	}
}
