package orhter.demo.Singleton;
/**
 * �̰߳�ȫ�ģ�ʹ�òż��صķ���
 * 
 * 
 * **/
public class SingletonSafe {
	/*
	 * 
	 * ��̬�ڲ������ʱ�ż��� 
	 * ʹ��static ��ֻ֤��һ������
	 * **/
	private static class SingletonHolder {  
		private static final SingletonSafe INSTANCE = new SingletonSafe();  
	}  
    private SingletonSafe (){}  
    public static final SingletonSafe getInstance() {  
    	return SingletonHolder.INSTANCE;  
    } 
}
