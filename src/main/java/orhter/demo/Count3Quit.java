package orhter.demo;

public class Count3Quit {

	public static void main(String[] args) {
		boolean[] arr = new boolean[500]; // ���������飬true��ʾ���ڣ�false��ʾ�˳���
		for (int i = 0; i < arr.length; i++) {
			arr[i] = true;
		}

		int leftCount = arr.length; // ʣ�µ���������ֵΪ500
		int countNum = 0; // ������һ��
		int index = 0; // �����ڼ�����

		while (leftCount > 1) { // ֻҪʣ����������1���ͼ�����
			if (arr[index] == true) { // ��������index���ˣ�����û���˳����ͼ�����
				countNum++;
				if (countNum == 3) { // ����3����С����Ȧ
					countNum = 0;
					arr[index] = false;
					leftCount--;
				}
			}
			index++;

			if (index == arr.length) {
				index = 0;
			}
		}

		for (int i = 0; i < arr.length; i++) {
			if (arr[i] == true) {
				System.out.println(i);
			}
		}

	}
}
