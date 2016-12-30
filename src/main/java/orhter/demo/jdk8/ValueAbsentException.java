package orhter.demo.jdk8;

class ValueAbsentException extends Throwable {

	public ValueAbsentException() {
		super();
	}

	public ValueAbsentException(String msg) {
		super(msg);
	}

	@Override
	public String getMessage() {
		return "No value present in the Optional instance";
	}
}
