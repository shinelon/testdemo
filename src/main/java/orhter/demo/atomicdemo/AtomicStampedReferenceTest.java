package orhter.demo.atomicdemo;

import java.util.concurrent.atomic.AtomicStampedReference;

public class AtomicStampedReferenceTest {
	public final static AtomicStampedReference<String> ATOMIC_REFERENCE = new AtomicStampedReference<String>(
			"abc", 0);

	public static void main(String[] args) {
		for (int i = 0; i < 100; i++) {
			final int num = i;
			final int stamp = ATOMIC_REFERENCE.getStamp();
			new Thread() {
				public void run() {
					try {
						Thread.sleep(Math.abs((int) (Math.random() * 100)));
					} catch (InterruptedException e) {
						e.printStackTrace();
					}
					if (ATOMIC_REFERENCE.compareAndSet("abc", "abc2", stamp,
							stamp + 1)) {
						System.out.println("�����̣߳�" + num + ",�һ�����������˶����޸ģ�");
					}
				}
			}.start();
		}
		new Thread() {
			public void run() {
				int stamp = ATOMIC_REFERENCE.getStamp();
				while (!ATOMIC_REFERENCE.compareAndSet("abc2", "abc", stamp,
						stamp + 1))
					;
				System.out.println("�Ѿ��Ļ�Ϊԭʼֵ��");
			}
		}.start();
	}
}
