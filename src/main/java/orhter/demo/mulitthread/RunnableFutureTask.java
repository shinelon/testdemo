package orhter.demo.mulitthread;

import java.util.concurrent.Callable;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;
import java.util.concurrent.FutureTask;

/**
 * 
 * @author  
 *
 */
public class RunnableFutureTask {

	/**
	 * ExecutorService
	 */
	static ExecutorService mExecutor = Executors.newSingleThreadExecutor();

	/**
	 * 
	 * @param args
	 */
	public static void main(String[] args) {
		runnableDemo();
		futureDemo();
	}

	/**
	 * runnable, �޷���ֵ
	 */
	static void runnableDemo() {

		new Thread(new Runnable() {

			@Override
			public void run() {
				System.out.println("runnable demo : " + fibc(20));
			}
		}).start();
	}

	/**
	 * ����Runnableʵ�ֵ���void run()�������޷���ֵ��Callableʵ�ֵ��� V
	 * call()���������ҿ��Է���ִ�н��������Runnable�����ύ��Thread����װ��
	 * ��ֱ������һ���߳���ִ�У���Callable��һ�㶼���ύ��ExecuteService��ִ�С�
	 */
	static void futureDemo() {
		try {
			/**
			 * �ύrunnable��û�з���ֵ, futureû������
			 */
			Future<?> result = mExecutor.submit(new Runnable() {

				@Override
				public void run() {
					fibc(20);
				}
			});

			System.out.println("future result from runnable : " + result.get());

			/**
			 * �ύCallable, �з���ֵ, future���ܹ���ȡ����ֵ
			 */
			Future<Integer> result2 = mExecutor.submit(new Callable<Integer>() {
				@Override
				public Integer call() throws Exception {
					return fibc(20);
				}
			});

			System.out
					.println("future result from callable : " + result2.get());

			/**
			 * FutureTask����һ��RunnableFuture<V>����ʵ����Runnbale��ʵ����Futrue<V>�������ӿڣ�
			 * �����������԰�װRunnable(ʵ���ϻ�ת��ΪCallable)��Callable
			 * <V>������һ��������һ���������ˣ�������ͨ��Thread��װ��ֱ��ִ�У�Ҳ�����ύ��ExecuteService��ִ��
			 * �����һ�����ͨ��v get()����ִ�н�������߳���û��ִ����ɵ�ʱ�����߳�һֱ�����ȴ���ִ������ֱ�ӷ��ؽ����
			 */
			FutureTask<Integer> futureTask = new FutureTask<Integer>(
					new Callable<Integer>() {
						@Override
						public Integer call() throws Exception {
							return fibc(20);
						}
					});
			// �ύfutureTask
			mExecutor.submit(futureTask);
			System.out.println("future result from futureTask : "
					+ futureTask.get());

		} catch (InterruptedException e) {
			e.printStackTrace();
		} catch (ExecutionException e) {
			e.printStackTrace();
		}
	}

	/**
	 * Ч�ʵ��µ�쳲���������, ��ʱ�Ĳ���
	 * 
	 * @param num
	 * @return
	 */
	static int fibc(int num) {
		if (num == 0) {
			return 0;
		}
		if (num == 1) {
			return 1;
		}
		return fibc(num - 1) + fibc(num - 2);
	}

}
