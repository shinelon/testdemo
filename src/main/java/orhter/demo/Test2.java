package orhter.demo;

import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;

public class Test2 {
	private static boolean ready;
	private static int number;

	private static class ReaderThread extends Thread {
		public void run() {
			System.out.println(number);
			while (!ready){
				Thread.yield();
				System.out.println("yield");
			}
				
			System.out.println(number);
		}
	}

	public static void main(String[] args) throws InterruptedException {
		new ReaderThread().start();
		Thread.sleep(10);
		number = 42;
		ready = true;
	}
}
