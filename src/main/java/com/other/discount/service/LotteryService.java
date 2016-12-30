package com.other.discount.service;

import com.other.discount.stragetys.StrategyContext;
import com.other.discount.stragetys.StrategyEnum;

public class LotteryService {

	public static void main(String[] args) {
		int current = 10;
		if (rangeInDefined(current, 1, 0))
			System.out.println(current + "在1——10之间");
		StrategyContext a = new StrategyContext();
		a.execute(StrategyEnum.CASHBACK);
		a.execute(StrategyEnum.CUSTOMER);
	}


	public static boolean rangeInDefined(int current, int min, int max) {
		
		if(max==0){
			return Math.max(min, current) == current;
		}
		
		if (current == max) {
			return false;
		} else {
			return Math.max(min, current) == Math.min(current, max);
		}

	}

	/*
	 * private Map<String, Object> compute(Map<String, Object> map1, Map<String,
	 * Object> map2) { List<Boolean> isLotteryList = new ArrayList<>();
	 * isLotteryList.add(Boolean.valueOf(true));
	 * isLotteryList.add(Boolean.valueOf(false));
	 * isLotteryList.add(Boolean.valueOf(true)); List<Boolean> listISResult =
	 * isLotteryList.stream().sorted(Comparator.reverseOrder())
	 * .collect(Collectors.toList()); listISResult.forEach(System.out::println);
	 * 
	 * List<Integer> levelList = new ArrayList<>();
	 * levelList.add(Integer.valueOf(LotteryLevel.ONE.getLevel()));
	 * levelList.add(Integer.valueOf(LotteryLevel.TWO.getLevel()));
	 * levelList.add(Integer.valueOf(LotteryLevel.THREE.getLevel()));
	 * List<Integer> levelListResult =
	 * levelList.stream().sorted().collect(Collectors.toList());
	 * levelListResult.forEach(System.out::println); return null; }
	 */

}
