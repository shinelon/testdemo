package orhter.demo.atomicdemo;

import java.util.concurrent.atomic.AtomicReference;
/*
 * ģ��ABA���� ҵ����Ϊ���� 
 * ABA���⣬ʲô��ABA�����أ���ĳЩ�����ڴ����������˳��ģ�Ҳ���ǲ������ظ����������£�
 * ��ĳЩ����µ���һ��������A���B�����м���ܾ���0-N�����ں�����A����ʱA�������ٱ��B�ˣ�
 * ��Ϊ��ʱ��״̬�Ѿ������˸ı䣬���磺�����ʽ�������һ����Ŀ������Ҫ���ʽ���80-100Ԫ���ˣ�
 * ����20ԪǮ��ʱ�����һ�죬Ҳ���Ǻ�̨����᲻��ɨ����Щ�û����ʽ��Ƿ����������Χ��
 * ����Ҫ�����ӹ����˾Ͳ����������ˣ��������20�󣬱���ȡ��10Ԫ�����������Χ��
 * ��ô�Ϳ����������ֳ���������ABA�����ˣ�
 * ���ƵĻ�����������н�������ÿ��ÿ��������3����������Ǹ��ȼ��Ľ��ĸ����ȵȡ�
 * 
 * */
public class AtomicReferenceABATest {
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
					if (ATOMIC_REFERENCE.compareAndSet("abc", "abc2")) {
						System.out.println("�����̣߳�" + num + ",�һ�����������˶����޸ģ�");
					}
				}
			}.start();
		}
		new Thread() {
			public void run() {
				while (!ATOMIC_REFERENCE.compareAndSet("abc2", "abc"))
					;
				System.out.println("�Ѿ���Ϊԭʼֵ��");
			}
		}.start();
	}
}
