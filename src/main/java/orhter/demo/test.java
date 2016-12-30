package orhter.demo;

public class test {
	public static void main(String[] args) {

		int[] arr = new int[] { 1, 2, 4, 5, 7, 8, 10, 11, 12, 13 };

		int[] arr_hash = new int[100];

		for (int i : arr) {
			if (arr_hash[i] != 0) {
				System.out.println("第一个：" + arr_hash[i] + ", 第二个：" + i);
			} else if (12 - i > 0) {
				arr_hash[12 - i] = i;
			}
		}

	}
}
