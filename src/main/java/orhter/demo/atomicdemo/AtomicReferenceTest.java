package orhter.demo.atomicdemo;

import java.util.concurrent.atomic.AtomicReference;

public class AtomicReferenceTest {
	/**
	 * ��ط����б�
	 * 
	 * @see AtomicReference#compareAndSet(Object, Object)
	 *      �Ա�����ֵ������1��ԭʼֵ������2���޸�Ŀ������
	 * @see AtomicReference#getAndSet(Object) �����õ�Ŀ���޸�Ϊ���õĲ�����ֱ���޸ĳɹ�Ϊֹ�������޸�ǰ������
	 */
	public final static AtomicReference<String> ATOMIC_REFERENCE = new AtomicReference<String>(
			"abc");

	public static void main(String[] args) {
		for (int i = 0; i < 100; i++) {
			final int num = i;
			new Thread() {
				public void run() {
					try {
						Thread.sleep(Math.abs((int) (Math.random() * 100)));
					} catch (InterruptedException e) {
						e.printStackTrace();
					}
					if (ATOMIC_REFERENCE
							.compareAndSet("abc", new String("abc"))) {
						System.out.println("�����̣߳�" + num + ",�һ�����������˶����޸ģ�");
					}
				}
			}.start();
		}
	}
}
