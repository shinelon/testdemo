package orhter.demo.mulitthread.producerconsumer;

//��ͷ��  
class SteamBread {
	int id;// ��ͷ���

	SteamBread(int id) {
		this.id = id;
	}

	public String toString() {
		return "steamBread:" + id;
	}
}