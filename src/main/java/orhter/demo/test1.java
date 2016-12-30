package orhter.demo;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.net.HttpURLConnection;
import java.net.Inet4Address;
import java.net.InetAddress;
import java.net.MalformedURLException;
import java.net.NetworkInterface;
import java.net.SocketException;
import java.net.URL;
import java.net.URLConnection;
import java.util.ArrayList;
import java.util.Enumeration;
import java.util.List;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class test1 {
	public static void main(String[] args) {
		List<String> list=new ArrayList<>();
		list.add(null);
		System.out.println(list.size());
		
//		char msg[]={73,76,79,86,69,89,79,85};
//		System.out.println(msg);
	}
	public static String GetNetIp() {
		URL infoUrl = null;
		InputStream inStream = null;
		String ipLine = "";
		HttpURLConnection httpConnection = null;
		try {
			infoUrl = new URL("http://ip168.com/");
			URLConnection connection = infoUrl.openConnection();
			httpConnection = (HttpURLConnection) connection;
			int responseCode = httpConnection.getResponseCode();
			if (responseCode == HttpURLConnection.HTTP_OK) {
				inStream = httpConnection.getInputStream();
				BufferedReader reader = new BufferedReader(
						new InputStreamReader(inStream, "utf-8"));
				StringBuilder strber = new StringBuilder();
				String line = null;
				while ((line = reader.readLine()) != null)
					strber.append(line + "\n");

				Pattern pattern = Pattern
						.compile("((?:(?:25[0-5]|2[0-4]\\d|((1\\d{2})|([1-9]?\\d)))\\.){3}(?:25[0-5]|2[0-4]\\d|((1\\d{2})|([1-9]?\\d))))");
				Matcher matcher = pattern.matcher(strber.toString());
				if (matcher.find()) {
					ipLine = matcher.group();
				}
			}

		} catch (MalformedURLException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		} finally {
			try {
				inStream.close();
				httpConnection.disconnect();
			} catch (IOException e) {
				e.printStackTrace();
			}
		}
		return ipLine;
	}

	/**
	 * 获取本地IP
	 * 
	 * @return
	 */
	public static String getLocalIpAddress() {
		try {
			Enumeration en = NetworkInterface
					.getNetworkInterfaces();
			while (en.hasMoreElements()) {
				NetworkInterface ni = (NetworkInterface) en.nextElement();
				Enumeration enIp = ni.getInetAddresses();
				while (enIp.hasMoreElements()) {
					InetAddress inet = (InetAddress) enIp.nextElement();
					if (!inet.isLoopbackAddress()
							&& (inet instanceof Inet4Address)) {
						return inet.getHostAddress().toString();
					}
				}
			}
		} catch (SocketException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

		return "0";
	}
}
