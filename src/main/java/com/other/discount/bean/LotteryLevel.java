package com.other.discount.bean;

public enum  LotteryLevel {
	//抽奖等级
	ONE("等级1",1),TWO("等级2",2),THREE("等级3",3);
	
	private String name;
	private int level;
	private LotteryLevel(String name, int level) {
		this.name = name;
		this.level = level;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getLevel() {
		return level;
	}
	public void setLevel(int level) {
		this.level = level;
	}
	
	
}
