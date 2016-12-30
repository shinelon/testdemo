package orhter.demo.instance.sort;

public class ComparatorDemo {
	public static void main(String[] args) {

		Student stu[] = { new Student("zhangsan", 20, 90.0f),
				new Student("lisi", 22, 90.0f),
				new Student("wangwu", 20, 99.0f),
				new Student("sunliu", 22, 100.0f) };
		java.util.Arrays.sort(stu, new StudentComparator());
		for (Student s : stu) {
			System.out.println(s);
		}
	}
}
