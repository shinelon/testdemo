package orhter.demo.mulitthread.callable;

import java.util.HashMap;
import java.util.Map;
import java.util.concurrent.Callable;
import java.util.concurrent.CompletionService;
import java.util.concurrent.ExecutorCompletionService;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;

public class CallableAndFuture {

    public static void main(String[] args) {

//        ExecutorService threadPool = Executors.newSingleThreadExecutor();
//
//        // future���ڵõ�����ִ����֮��ķ��� ֵ
//        Future<Person> future = threadPool.submit(new Callable<Person>() {
//
//            /**
//             * �ص�����
//             */
//            @Override
//            public Person call() throws Exception {
//
//                Person p = new Person("СС", 22);
//                return p;
//            }
//        });
//
//        try {
//            // �õ��߳̽����󷵻صĽ��
//            System.out.println(future.get());
//        } catch (Exception e) {
//            e.printStackTrace();
//        }
//
//        // ======================================================
//
//        // ����һ���̳߳أ����̳߳�����3�� �߳�
//        ExecutorService threadPool2 = Executors.newFixedThreadPool(3);
//
//        CompletionService<Integer> completionService = new ExecutorCompletionService<Integer>(threadPool2);
//
//        // �ύ10������
//        for (int i = 0; i < 3; i++) {
//            final int value = i;
//            completionService.submit(new Callable<Integer>() {
//                @Override
//                public Integer call() throws Exception {
//                    // Thread.sleep(1000);
//                    return value;
//                }
//            });
//        }
//
//        try {
//            // �õ��߳�ִ����֮��Ľ�����Ǹ��߳�������ִ������ȷ��أ���Ϊ�ύ��10������
//            // ���Եõ���ʱ��ҲҪ��10�εõ�
//            for (int i = 0; i < 10; i++) {
//                System.out.println(completionService.take().get());
//            }
//        } catch (Exception e) {
//            e.printStackTrace();
//        }

        // ����һ���̳߳أ����̳߳�����3�� �߳�
        ExecutorService threadPool3 = Executors.newFixedThreadPool(3);

        CompletionService<Map<String, Integer>> completionService2 = new ExecutorCompletionService<Map<String, Integer>>(threadPool3);
        for (int i = 0; i < 3; i++) {
            final int value = i;
            completionService2.submit(new Callable<Map<String, Integer>>() {
                @Override
                public Map<String, Integer> call() throws Exception {
                    // Thread.sleep(1000);
                    Map<String, Integer> retMap=new HashMap<String, Integer>();
                    retMap.put(String.valueOf(value), value);
                    return retMap;
                }
            });
        }
        try {
            System.out.println("get map:");
            // �õ��߳�ִ����֮��Ľ�����Ǹ��߳�������ִ������ȷ��أ���Ϊ�ύ��10������
            // ���Եõ���ʱ��ҲҪ��10�εõ�
            for (int i = 0; i <3; i++) {
                //Thread.sleep(3000);
                System.out.println(completionService2.take().get().get(String.valueOf(i)));
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
        threadPool3.shutdown();
        
        
        
    }
}
