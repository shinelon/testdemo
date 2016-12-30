package orhter.demo.factory.simplefactory;

/*
 * ������ �����޸�Ϊ�������ɲ�ͬ�Ĳ�Ʒ��Ŀǰֻ���� Printer
 * 
 * */
public class OutputFactory {
	public Output getOutput() {
		return new Printer();
	}

	public Output getOutput(String type) {

		if (type.equals("Printer")) {
			return new Printer();
		} else {
			return new Printer();
		}

	}
}
