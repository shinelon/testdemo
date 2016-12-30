package orhter.demo.mulitthread.producerconsumer;

//�������࣬ʵ����Runnable�ӿڣ��Ա��ڹ����������߳�  
class Consume implements Runnable {
	SyncStack ss = null;

	public Consume(SyncStack ss) {
		super();
		this.ss = ss;
	}

	@Override
	public void run() {
		// TODO Auto-generated method stub
		for (int i = 0; i < 10; i++) {// ��ʼ������ͷ
			SteamBread stb = ss.pop();
			System.out.println("������" + stb);
			try {
				Thread.sleep(100);// ÿ����һ����ͷ��˯��100���롣���������������һ��
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
	}
}