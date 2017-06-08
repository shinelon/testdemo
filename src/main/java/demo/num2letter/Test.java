package demo.num2letter;

import java.io.UnsupportedEncodingException;
import java.net.URLDecoder;
import java.util.Arrays;

public class Test {
	public static void main(String[] args) throws UnsupportedEncodingException {
		Long l = new Long("");
		System.out.println(l.toString());
		
//		String s="https://open.weixin.qq.com/connect/oauth2/authorize?appid=wxb60f3a76da39dfc1&redirect_uri=http%3A%2F%2Fwxtest.lefu8.com%2Fletoutest%2Fadv%2FgotoXYK&response_type=code&scope=snsapi_base&state=1#wechat_redirect";
//		String[] urlArray = s.split("&");
//		String redirectUri = URLDecoder.decode(urlArray[1].split("=")[1],"UTF-8");
//        String[] redirectUriArray = redirectUri.split("/");
//		String key = redirectUriArray[redirectUriArray.length - 2] + "/"
//                + redirectUriArray[redirectUriArray.length - 1];
//		System.out.println(Arrays.toString(urlArray));
//		System.out.println(Arrays.toString(redirectUriArray));
//		System.out.println(key);
	}
	public static String deURL(String parm){
		//URLEncodedUtils
		return null;
	}
}