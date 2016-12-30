package orhter.demo.sort;

public class QuickSort {
	
	public static void quickSort(int a[], int start, int end) {
		int i, j;
		i = start;
		j = end;
		if ((a == null) || (a.length == 0))
			return;

		while (i < j) {// ���һ�׼���±�
			while (i < j && a[i] <= a[j]){
				// ������start�±������Ϊkey���Ҳ�ɨ��
				j--;				
			}
				
			if (i < j) { // �Ҳ�ɨ�裬�ҳ���һ����keyС�ģ�����λ��
				int temp = a[i];
				a[i] = a[j];
				a[j] = temp;
			}
			while (i < j && a[i] < a[j]){				
				// ���ɨ�裨��ʱa[j]�д洢��keyֵ��
				i++;				
			}
				
			if (i < j) { // �ҳ���һ����key��ģ�����λ��
				int temp = a[i];
				a[i] = a[j];
				a[j] = temp;
			}
		}
		if (i - start > 1) { // �ݹ���ã���keyǰ����������
			quickSort(a, 0, i - 1);
		}
		if (end - j > 1) {
			quickSort(a, j + 1, end); // �ݹ���ã���key������������
		}
	}
	
	
	public static void main(String args[]){
		int a[] = { 49, 38, 65, 97, 76, 13, 27, 49, 78, 34, 12, 64, 5, 4, 62,
				99, 98, 54, 56, 17, 18, 23, 34, 15, 35, 25, 53, 51 };
		
		quickSort(a,0,a.length-1);
		for(int i:a){
			System.out.print("-----");
			System.out.println(i);
		}
	}
}
