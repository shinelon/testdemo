package orhter.demo;

import java.io.File;
import java.math.BigDecimal;
import java.net.URLDecoder;
import java.net.URLEncoder;
import java.util.Arrays;
import java.util.Base64;
import java.util.Collections;
import java.util.Formatter;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Optional;
import java.util.UUID;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.atomic.LongAdder;
import java.util.stream.Collectors;



public class TestDemo {

	public static void main(String[] args) {
		String path="D:/file";
		File folder = new File(path);
		File[] listOfFiles = folder.listFiles();
		System.out.println(Arrays.toString(listOfFiles));
	}
	public static void integerValue(){
		System.out.println(Integer.valueOf(""));
	}
	public static void stringconcat(){
		String a1="变量1";
		String a2="变量2";
		String a="<a href=\"javascript:void(0);\" class=\"\" NAME=\"area\" DATA-fax=\""+a1+"\">"+a2+"</a>";
		String aa="<a href=\"javascript:void(0);\" class=\"\" onmose=\"this.title=''\" NAME=\"area\" DATA-fax=\""+a1+"\">"+a2+"</a>";
		System.out.println(aa);
	}
	public static void testhashmap(){
		Map m1=new HashMap();
		Map m2=new HashMap(m1);
		System.out.println(m2.toString());
	}
	public static void spiltspeed(){
		String s=String.format("%s,%s,%s", "","2","3");
		String[] sAry=s.split(",");
		for (String string : sAry) {
			System.out.println(string);
		}
	}
	private static void uuuid(){
		UUID uuid = UUID.randomUUID(); 
		
        System.out.println (uuid);
//		UUID u=UUID.fromString("app=0&p=1&did=81077922&bid=8617214271&industry=5722&adId=42&regionId=4101");
//        System.out.println(u);
	}
	private  static List<Integer> split(String s) {
        if (s == null || s.equals("")) {
            return Collections.emptyList();
        }
        List<Integer> ret = Arrays.asList(s.split(",")).stream().map(e -> Integer.parseInt(e))
                .collect(Collectors.toList());
        return ret;
    }
	public static void test(){
		String a="ABCD";
		String b=a.toLowerCase();
		String c=b.replace('a', 'd');
		String d=b.replace('d', 'c');
		System.out.println(d);
//		int i=1;
//		int j=10;
//		do {
//			if(i++>--j)continue;
//		} while (i<5);
//		System.out.println(i+"--"+j);
	}
	public static void testStringBytes(){
		System.out.println("app=0&p=1&did=81077922&bid=8617214271&industry=5722&adId=42&regionId=4101".length());
		System.out.println("54d2c5c4-fbf8-46ed-ac7f-01662f1d8a2a ".length());
	}
	public static void testString(){
		String s1="abc";
		String s2=new String("abc").intern();
		System.out.println(s1==s2);
	}
	public static void insertCreate(){
		for(int i=0;i<3000;i++){
			System.out.println(String.format("insert into `ad_blacklist` (`id`, `customer_no`, `status`, `name`) values('%d','%d','0',NULL);",i,i));
		}
	}
	public static void testStringformat1(){
		Optional<String> typeStr=Optional.of("123");
		String a=String.format("SELECT COUNT(1) as rowcount FROM POSP_BOSS.LTV_POS where type in ('%s')",
        typeStr.get());
		System.out.println(a);
	}
	
	public static void testLength(){
		System.out.println("没有此商户信息:businessId ,regionId为0".length());
	}
	public static String PrivateStrBuild(StringBuilder sb, Object... args){		
		sb.setLength(0);
		for (Object object : args) {
			sb.append(object.toString());
		}
		return sb.toString();
	}
	public static String StrBuild(int i, Object... args){
		StringBuilder sb=new StringBuilder(i);
		for (Object object : args) {
			sb.append(object.toString());
		}
		return sb.toString();
	}

	public static String Stringformat(int i,String format, Object... args) {
        return new Formatter(new StringBuilder(i)).format(format, args).toString();
    }
	
	
	public static void testStringformat(){
		long l1=1L;
		long l2=2L;
		BigDecimal bd1=new BigDecimal(2);
		BigDecimal bd2=new BigDecimal(7);
		System.out.println(String.format("data:%d+%d", l2/l1,1));
		System.out.println(String.format("data:%d", bd2.longValue()/bd1.longValue()));
			
	}
	
	public static void testSafeMap(){
		ConcurrentHashMap<String,LongAdder> freqs=new ConcurrentHashMap<>();		
		freqs.computeIfAbsent("123", k->new LongAdder()).increment();
		freqs.computeIfAbsent("123", k->new LongAdder()).increment();
		freqs.computeIfAbsent("123", k->new LongAdder()).increment();
		freqs.computeIfAbsent("123", k->new LongAdder()).increment();
		freqs.computeIfAbsent("123", k->new LongAdder()).increment();
		freqs.computeIfAbsent("123", k->new LongAdder()).increment();
		freqs.computeIfAbsent("223", k->new LongAdder()).increment();		
		freqs.computeIfAbsent("223", k->new LongAdder()).increment();
		freqs.computeIfAbsent("223", k->new LongAdder()).increment();
		freqs.computeIfAbsent("223", k->new LongAdder()).increment();
		freqs.get("123").longValue();
		ConcurrentHashMap<String,LongAdder> countVerify=new ConcurrentHashMap<>();
		
		System.out.println(freqs.toString());
	}
	
	public static void testBuffer(){
		long start = System.currentTimeMillis();
		StringBuffer sb=new StringBuffer();
		for(int i=0;i<10000;i++){
			sb.setLength(0);
			sb.append("123");
			sb.append("123");
			sb.append("123");
			sb.append("123");
			sb.append("123");
			
		}
		long end = System.currentTimeMillis();
		System.out.println("StringBuffer 10000共耗时：" + (end - start));
	}
	public static void testBuilder(){
		long start = System.currentTimeMillis();
		StringBuilder sb=new StringBuilder();
		for(int i=0;i<10000;i++){
			sb.setLength(0);
			sb.append("123");
			sb.append("123");
			sb.append("123");
			sb.append("123");
			sb.append("123");			
		}
		long end = System.currentTimeMillis();
		System.out.println("StringBuilder 10000共耗时：" + (end - start));
	}
}
