package com.other.discount.stragetys;

public enum StrategyEnum {
	CUSTOMER(1, "customer"), CASHBACK(2, "cashback");

	private int value;
	private String type;

	private StrategyEnum(int value, String type) {
		this.value = value;
		this.type = type;
	}

	public int getValue() {
		return value;
	}

	public void setValue(int value) {
		this.value = value;
	}

	public String getType() {
		return type;
	}

	public void setType(String type) {
		this.type = type;
	}

}
