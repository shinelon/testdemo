package orhter.demo;

import java.util.HashMap;

public class TestHashMapSize {
	public static void main(String[] args) throws InterruptedException {

		String a = "requestURI:/a?did=abc&bid=8619114808&p=1&app=0&ts=1234";
        long start = 0;
        long end = 0;
        // 先垃圾回收
//        System.gc();
        start = Runtime.getRuntime().freeMemory();
        HashMap<Integer, String> map = new HashMap<>();
        for (int i = 0; i < 1000000; i++) {
            map.put(i, a);
        }
        // 快要计算的时,再清理一次
//        System.gc();
        end = Runtime.getRuntime().freeMemory();
        System.out.println("一个HashMap对象占内存:" + (end - start)/1024/1024);
        
        long start1 = System.currentTimeMillis();
        map.get(99999);
        long end1 = System.currentTimeMillis();
        System.out.println("共耗时：" + (end1 - start1));

	}
}
