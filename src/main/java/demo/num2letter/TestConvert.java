package demo.num2letter;

import java.io.UnsupportedEncodingException;

import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.JSONArray;
import com.alibaba.fastjson.JSONObject;

public class TestConvert {
	

	// 将字母转换成数字_1
	public static String t1(String input) {
		String reg = "[a-zA-Z]";
		StringBuffer strBuf = new StringBuffer();
		input = input.toLowerCase();
		if (null != input && !"".equals(input)) {
			for (char c : input.toCharArray()) {
				if (String.valueOf(c).matches(reg)) {
					strBuf.append(c - 96);
				} else {
					strBuf.append(c);
				}
			}
			return strBuf.toString();
		} else {
			return input;
		}
	}

	// 将字母转换成数字
	public static void letterToNum(String input) {
		for (byte b : input.getBytes()) {
			System.out.print(b - 96);
		}
	}

	// 将数字转换成字母
	public static void numToLetter(String input) {
		for (byte b : input.getBytes()) {
			System.out.print((char) (b + 48));
		}
	}

	public static void main(String[] args) throws UnsupportedEncodingException {
		
		String menuJson = "{\"button\":[{\"type\":\"click\",\"name\":\"今日歌曲\",\"key\":\"V1001_TODAY_MUSIC\"},{\"name\":\"菜单\",\"sub_button\":[{\"type\":\"view\",\"name\":\"我的二位\",\"url\":\"http://jjjj.tunnel.qydev.com/mgr/gotoGetQrcode\"},{\"type\":\"view\",\"name\":\"视频\",\"url\":\"http://v.qq.com/\"},{\"type\":\"click\",\"name\":\"赞一下我们\",\"key\":\"V1001_GOOD\"}]}]}";
        JSONObject json = (JSONObject) JSON.parse(menuJson);
        JSONArray jsonAry = (JSONArray) json.get("button");

        JSONArray zNodes = new JSONArray();
        for (Object tmp : jsonAry) {
            JSONObject parent = new JSONObject();
            JSONObject jsontmp = (JSONObject) tmp;
            String name = (String) jsontmp.get("name");
            parent.put("name", name);
            JSONArray childArray = new JSONArray();
            if (jsontmp.containsKey("sub_button")) {
                JSONArray tmpArray = jsontmp.getJSONArray("sub_button");
                for (Object subTmp : tmpArray) {
                    JSONObject child = new JSONObject();
                    JSONObject childjson = (JSONObject) subTmp;
                    child.put("name", childjson.get("name"));
                    childArray.add(child);
                }
            }
            parent.put("children", childArray);
            parent.put("open", true);
            zNodes.add(parent);
        }
		
		System.out.println(zNodes.toJSONString());
		
		
//		List<String> l =new ArrayList<>(2);
//		l.add(null);
//		l.add(null);
//		System.out.println(l.get(0)==null?"0":l.get(0));
//		System.out.println(String.format("%s%s-", "sss",""));
//		System.out.println(String.format("%s%s-", "sss","1"));
//		System.out.println(("a"+"b")=="ab");
//		
//		
//		
//		System.out.println((int)'q');
//		String i1 = "abcdefghijklmnopqrstuvwxyz";
//		String i2 = "123456";
//		String i3 = "syq";
//		letterToNum(i1);
//		System.out.println();
//		numToLetter(i2);
//		System.out.println(t1(i3));

	}
}
