package orhter.demo.factory.simplefactory;

/*
 * ����Ĳ�Ʒ
 * 
 * */
public class Printer implements Output {
	
	private String[] printData = new String[MAX_CACHE_LINE];
	// ���Լ�¼��ǰ���ӡ����ҵ��
	private int dataNum = 0;
	@Override
	public void getData(String str) {
		if (dataNum >= MAX_CACHE_LINE) {
			System.out.println("�������һ�������ʧ��");
		}else{
			printData[dataNum++] = str;
		}
	}

	@Override
	public void out() {
		 while (dataNum > 0) { 
			 System.out.println("��ӡ����ӡ��" + printData[0]);
			// ����ҵ����ǰ��һλ������ʣ�µ���ҵ����һ  
			 System.arraycopy(printData, 1, printData, 0, --dataNum); 
		 }
	}

}
