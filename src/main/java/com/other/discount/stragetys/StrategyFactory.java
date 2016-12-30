package com.other.discount.stragetys;

import java.util.HashMap;
import java.util.Map;

public class StrategyFactory {
	private static StrategyFactory factory = new StrategyFactory();

	private StrategyFactory() {
	}

	private static Map<String, Strategy> strategyMap = new HashMap<>();

	static {
		strategyMap.put(StrategyEnum.CUSTOMER.getType(), new CustomerStrategy());
		strategyMap.put(StrategyEnum.CASHBACK.getType(), new CashBackStrategy());
	}

	public Strategy creator(StrategyEnum strategyEnum) {
		return strategyMap.get(strategyEnum.getType());
	}

	public static StrategyFactory getInstance() {
		return factory;
	}

}
