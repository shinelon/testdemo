package com.other.discount.bean;

public enum LotteryType {
	//抽奖类型
	COUPON("优惠卷",1),CASH("现金",2),OTHER("其他",3);
	
	private String name;
	private int type;
	private LotteryType(String name, int type) {
		this.name = name;
		this.type = type;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getType() {
		return type;
	}
	public void setType(int type) {
		this.type = type;
	}
	
}
