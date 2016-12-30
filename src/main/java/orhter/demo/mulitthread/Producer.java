package orhter.demo.mulitthread;

import java.util.concurrent.BlockingQueue;

public class Producer implements Runnable {
	BlockingQueue<String> queue;

	public Producer(BlockingQueue<String> queue) {
		this.queue = queue;
	}

	@Override
	public void run() {
		try {
			
			String temp = "A Product, �����̣߳�" + Thread.currentThread().getName();
			queue.put(temp);// ������������Ļ�����������ǰ�߳�
			System.out.println("I have made a product:"
					+ Thread.currentThread().getName());			
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
	}

}