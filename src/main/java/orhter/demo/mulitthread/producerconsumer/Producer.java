package orhter.demo.mulitthread.producerconsumer;

//�������࣬ʵ����Runnable�ӿڣ��Ա��ڹ����������߳�  
class Producer implements Runnable {
	SyncStack ss = null;

	Producer(SyncStack ss) {
		this.ss = ss;
	}

	@Override
	public void run() {
		// ��ʼ������ͷ
		for (int i = 0; i < 10; i++) {
			SteamBread stb = new SteamBread(i);
			ss.push(stb);
			System.out.println("������" + stb);
			try {
				Thread.sleep(10);// ÿ����һ����ͷ��˯��10����
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
	}
}