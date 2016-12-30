package demo.redis.geo;

import redis.clients.jedis.Jedis;

public class TestRedisGeo {

	public static void main(String[] args) {
		Jedis  jedis = new Jedis("127.0.0.1", 6379);
//		String info=jedis.info();
//		System.out.println(info);
		jedis.geoadd("bj", 116.36409421277, 39.851939428691, "A");
		jedis.geoadd("bj", 116.43325905507, 39.965181604699, "B");
		
		double dis=jedis.geodist("bj", "A", "B");
		System.out.println(dis);
		jedis.close();

	}
	
}
