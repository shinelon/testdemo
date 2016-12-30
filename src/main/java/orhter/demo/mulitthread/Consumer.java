package orhter.demo.mulitthread;

import java.util.concurrent.BlockingQueue;

public class Consumer implements Runnable {
	BlockingQueue<String> queue;

	public Consumer(BlockingQueue<String> queue) {
		this.queue = queue;
	}

	@Override
	public void run() {
		try {
			String temp = queue.take();// �������Ϊ�գ���������ǰ�߳�
			System.out.println(temp);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
	}
}
