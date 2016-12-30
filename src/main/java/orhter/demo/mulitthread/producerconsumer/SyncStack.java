package orhter.demo.mulitthread.producerconsumer;

class SyncStack {
	int index = 0;
	SteamBread[] stb = new SteamBread[3];// ������ͷ���飬�൱����ͷ��������6

	// ������У��൱����ջ
	public synchronized void push(SteamBread sb) {
		while (index == stb.length) {// �����ˣ���ջ����
			try {
				this.wait();// �õ�ǰ�̵߳ȴ�
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		this.notify();// �����ڴ˶���������ϵȴ��ĵ����̣߳����������߳�
		stb[index] = sb;
		this.index++;
	}

	// �ӿ����ó����൱�ڳ�ջ
	public synchronized SteamBread pop() {
		while (index == 0) {// ����ˣ���ջ��
			try {
				this.wait();
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		this.notify();
		this.index--;// push��n��֮��this.index++��ʹջ��Ϊn+1����return֮ǰҪ��һ
		return stb[index];
	}
}