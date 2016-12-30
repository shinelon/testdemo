package orhter.demo.collection;

import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.TreeMap;

public class TreeMapDemo {

	public static void main(String[] args) {
		testTreeMap();
	}
	
	public static void testTreeMap(){
		Map<String,String> tm=new TreeMap<>();//LinkedHashMap<>();
		
		
		tm.put("2", "223");
		tm.put("5", "523");
		tm.put("3", "323");
		tm.put("44", "4423");
		tm.put("4", "423");
		tm.put("1", "123");
		System.out.println(tm.values().toString());
		
	}
}
