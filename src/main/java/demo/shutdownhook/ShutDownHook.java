package demo.shutdownhook;

public class ShutDownHook {
	public static void main(String[] args) {
		System.out.println("do something");
		try {
			Thread.sleep(5000);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		
		//addShutdownHook
		Runtime.getRuntime().addShutdownHook(new Thread(() -> {
			System.out.println("do resource clean");
		}));
	}
}
