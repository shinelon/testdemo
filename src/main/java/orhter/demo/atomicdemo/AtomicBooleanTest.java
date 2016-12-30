package orhter.demo.atomicdemo;

import java.util.concurrent.atomic.AtomicBoolean;

public class AtomicBooleanTest {
	/**
	 * ��Ҫ������
	 * 
	 * @see AtomicBoolean#compareAndSet(boolean, boolean)
	 *      ��һ������Ϊԭʼֵ���ڶ�������ΪҪ�޸ĵ���ֵ�����޸ĳɹ��򷵻�true�����򷵻�false
	 * @see AtomicBoolean#getAndSet(boolean) ���������µ�booleanֵ��ֱ���ɹ�Ϊֹ����������ǰ������
	 */
	public final static AtomicBoolean TEST_BOOLEAN = new AtomicBoolean();

	public static void main(String[] args) {
		for (int i = 0; i < 10; i++) {
			new Thread() {
				public void run() {
					try {
						Thread.sleep(1000);
					} catch (InterruptedException e) {
						e.printStackTrace();
					}
					if (TEST_BOOLEAN.compareAndSet(false, true)) {
						System.out.println("�ҳɹ��ˣ�");
					}
				}
			}.start();
		}
	}
}
