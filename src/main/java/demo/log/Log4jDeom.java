package demo.log;


import org.apache.logging.log4j.Logger;
import org.apache.logging.log4j.LogManager;

public class Log4jDeom {
	private static final Logger logger2= LogManager.getLogger("rolling");
	private static final org.apache.log4j.Logger logger1 = org.apache.log4j.Logger.getLogger("sysLog");
	//log4j1共耗时：2779
	//3761
	public static void main(String[] args) {
		log4j1();

	}
	public static void log4j1(){
		long start = System.currentTimeMillis();
		for(int i=0;i<100000;i++){
			logger1.info("log4j1log4j1log4j1log4j2log4j2log4j2log4j2log4j2log4j2log4j2log4j2log4j2log4j2log4j2");
		}
		long end = System.currentTimeMillis();
		System.out.println("log4j1共耗时：" + (end - start));
	}
	public static void log4j2(){
		long start1 = System.currentTimeMillis();
		for(int i=0;i<100000;i++){
			logger2.debug("log4j2log4j2log4j2log4j2log4j2log4j2log4j2log4j2log4j2log4j2log4j2log4j2log4j2log4j2");
		}
		long end1 = System.currentTimeMillis();
		System.out.println("log4j2共耗时：" + (end1 - start1));

	}

}
