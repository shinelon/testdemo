package demo.annotation;

public class Bean {
	@IsNotNull("hx1")
	private String attribute1;
	@IsNotNull
	private String attribute2;
	@IsNotNull("bw")
	private String attribute3;
	private String attribute4;
	
	public String getAttribute1() {
		return attribute1;
	}
	public void setAttribute1(String attribute1) {
		this.attribute1 = attribute1;
	}
	public String getAttribute2() {
		return attribute2;
	}
	public void setAttribute2(String attribute2) {
		this.attribute2 = attribute2;
	}
	public String getAttribute3() {
		return attribute3;
	}
	public void setAttribute3(String attribute3) {
		this.attribute3 = attribute3;
	}
	public String getAttribute4() {
		return attribute4;
	}
	public void setAttribute4(String attribute4) {
		this.attribute4 = attribute4;
	}
	@Override
	public String toString() {
		return "Bean [attribute1=" + attribute1 + ", attribute2=" + attribute2 + ", attribute3=" + attribute3
				+ ", attribute4=" + attribute4 + "]";
	}
}
