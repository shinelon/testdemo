package orhter.demo.jdk8;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class TestTime {
	public static void main(String[] args) {
		//字符串换新日期类型 并比较是20ms左右
		//而直接访问redis是8ms左右
		
		DateTimeFormatter formatter = DateTimeFormatter.ofPattern("yyyyMMdd");
		long start = System.currentTimeMillis();
	    LocalDate defaulMarkTime = LocalDate.parse("20160721", formatter);
	    LocalDate now=LocalDate.now();
	    

	    if(now.isBefore(defaulMarkTime)){
	    	System.out.println("now.isBefore(defaulMarkTime)");
	    }else{
	    	System.out.println("now.isNOtBefore(defaulMarkTime)");
	    }
	    
	    long end = System.currentTimeMillis();
	    System.out.println("共耗时：" + (end - start));
	    
	}
}
