package demo.base64;

import org.apache.commons.codec.binary.Base64;

//import java.util.Base64;

public class Demobase64 {
	public static void main(String[] args) {
//		System.out.println(Base64.getEncoder().encodeToString("123".getBytes()));
//		System.out.println(new String(Base64.getDecoder().decode("MTIz")));
//		System.out.println(Base64.encodeBase64String("1233344444".getBytes()));
//		System.out.println(new String(Base64.decodeBase64("MTIzMzM0NDQ0NA==")));
		
		
		String str=Base64Util.encodeBase64Str("18");
		System.out.println(str);
		System.out.println(new String(Base64Util.decodeBase64("HO]$".getBytes())));
	}
}
