package orhter.demo.mulitthread.producerconsumer;

public class ProduceConsumeTest {
	public static void main(String[] args) {
		SyncStack ss = new SyncStack();// ����һ��װ��ͷ�Ŀ�
		Producer p = new Producer(ss);// �½�һ�������ߣ�ʹ֮���п�
		Consume c = new Consume(ss);// �½�һ�������ߣ�ʹ֮����ͬһ����
		Thread tp = new Thread(p);// �½�һ���������߳�
		Thread tc = new Thread(c);// �½�һ���������߳�
		tp.start();// �����������߳�
		tc.start();// �����������߳�
	}
}
