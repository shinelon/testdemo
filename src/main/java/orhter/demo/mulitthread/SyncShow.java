package orhter.demo.mulitthread;


import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

public class SyncShow implements Runnable {
	static int value = 0;

	private /*synchronized*/ void show() {
		Lock l= new ReentrantLock();
		l.lock();
		value = value+1;
		System.out.println(Thread.currentThread().getName()+":"+value);
		l.unlock();
	}

	@Override
	public void run() {
		show();
	}

	public static void main(String[] args) {
		for (int i = 0; i < 10; i++) {
			new Thread(new SyncShow()).start();
		}

	}
}
