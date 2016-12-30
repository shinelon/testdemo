package demo.urlencode;

import java.io.UnsupportedEncodingException;
import java.net.URLEncoder;

public class demo {
	public static void main(String[] args) {
		String adLdp="http://m.dianping.com/appshare/shop/19110379?from=groupmessage";
		try {
			System.out.println(URLEncoder.encode(adLdp, "UTF-8"));
		} catch (UnsupportedEncodingException e) {
			e.printStackTrace();
		}
	}
}
