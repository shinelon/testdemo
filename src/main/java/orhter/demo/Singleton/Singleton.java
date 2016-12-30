package orhter.demo.Singleton;
/*
 * �̲߳���ȫ
 * 
 * */
public class Singleton {
	private static Singleton singleton=null;
	
	private Singleton(){};
	
	private static Singleton getInstance(){
		if (singleton==null) {
			singleton=new Singleton();
		}
		return singleton;
	}
}
