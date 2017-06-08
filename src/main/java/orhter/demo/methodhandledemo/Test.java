package orhter.demo.methodhandledemo;

public class Test {
	
	public static void main(String[] args) {
//		((Father)new Son()).thinking();
		String insertSqlFinal = "123)";
		System.out.println(insertSqlFinal);
        // 判断是否是已逗号结尾，如结尾删除
        if (insertSqlFinal.endsWith(",")) {
            insertSqlFinal = insertSqlFinal.substring(0, insertSqlFinal.length() - 1);
        }
        System.out.println(insertSqlFinal);
	}
}
