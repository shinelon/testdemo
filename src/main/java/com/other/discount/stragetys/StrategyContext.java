package com.other.discount.stragetys;

public class StrategyContext {

	private Strategy strategy;

	public Object execute(StrategyEnum strategyEnum) {
		strategy = StrategyFactory.getInstance().creator(strategyEnum);
		return strategy.execute();
	}

	public Strategy getStrategy() {
		return strategy;
	}

	public void setStrategy(Strategy strategy) {
		this.strategy = strategy;
	}

}
