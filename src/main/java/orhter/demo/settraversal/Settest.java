package orhter.demo.settraversal;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

public class Settest {
	public static void main(String[] args) {
		Set<String> set = new HashSet<String>();

		set.add("a");
		set.add("b");
		set.add("c");
		set.add("d");
		set.add("e");

		set.add("e");// ���ܷ����ظ�����

		/**
		 * ��������һ����������
		 */
		for (Iterator<String> iterator = set.iterator(); iterator.hasNext();) {
			System.out.print(iterator.next() + " ");
		}

		System.out.println();
		System.out.println("********************");

		/**
		 * for��ǿѭ������
		 */
		for (String value : set) {
			System.out.print(value + " ");
		}
	}
}
