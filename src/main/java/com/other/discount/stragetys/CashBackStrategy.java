package com.other.discount.stragetys;

import java.util.Collections;
import java.util.Map;

public class CashBackStrategy implements Strategy{

	@Override
	public Map<String,Object> execute() {
		System.out.println("CashBackStrategy");
		return Collections.EMPTY_MAP;
	}
	
}
