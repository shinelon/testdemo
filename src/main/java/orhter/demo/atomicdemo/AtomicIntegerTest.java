package orhter.demo.atomicdemo;

import java.util.concurrent.atomic.AtomicInteger;

public class AtomicIntegerTest {

	/**
	 * �����ķ����б�
	 * 
	 * @see AtomicInteger#get() ֱ�ӷ���ֵ
	 * @see AtomicInteger#getAndAdd(int) ����ָ�������ݣ����ر仯ǰ������
	 * @see AtomicInteger#getAndDecrement() ����1�����ؼ���ǰ������
	 * @see AtomicInteger#getAndIncrement() ����1����������ǰ������
	 * @see AtomicInteger#getAndSet(int) ����ָ�������ݣ���������ǰ������
	 * 
	 * @see AtomicInteger#addAndGet(int) ����ָ�������ݺ󷵻����Ӻ������
	 * @see AtomicInteger#decrementAndGet() ����1�����ؼ��ٺ��ֵ
	 * @see AtomicInteger#incrementAndGet() ����1���������Ӻ��ֵ
	 * @see AtomicInteger#lazySet(int) ������getʱ�Ż�set
	 * 
	 * @see AtomicInteger#compareAndSet(int, int) ����������Աȣ������ӳɹ��򷵻�true���򷵻�false
	 */
	public final static AtomicInteger TEST_INTEGER = new AtomicInteger(1);

	public static void main(String[] args) throws InterruptedException {
		final Thread[] threads = new Thread[10];
		for (int i = 0; i < 10; i++) {
			final int num = i;
			threads[i] = new Thread() {
				public void run() {
					try {
						Thread.sleep(1000);
					} catch (InterruptedException e) {
						e.printStackTrace();
					}
					int now = TEST_INTEGER.incrementAndGet();
					System.out.println("�����̣߳�" + num + "���ҵõ�ֵ�ˣ����Ӻ��ֵΪ��" + now);
				}
			};
			threads[i].start();
		}
		for (Thread t : threads) {
			t.join();
		}
		System.out.println("�������н����" + TEST_INTEGER.get());
	}
}
