package demo.JPinyin;
import com.github.stuxuhai.jpinyin.PinyinException;
import com.github.stuxuhai.jpinyin.PinyinFormat;
import com.github.stuxuhai.jpinyin.PinyinHelper;

public class PinYin {
	public static void main(String[] args) {
		String str = "你好世界";
	    try {
	    	
			String s1=PinyinHelper.convertToPinyinString(str, ",", PinyinFormat.WITH_TONE_MARK);// nǐ,hǎo,shì,jiè
			String s2=PinyinHelper.convertToPinyinString(str, ",", PinyinFormat.WITH_TONE_NUMBER); // ni3,hao3,shi4,jie4
			String s3=PinyinHelper.convertToPinyinString(str, ",", PinyinFormat.WITHOUT_TONE); // ni,hao,shi,jie
			String s4=PinyinHelper.getShortPinyin(str); // nhsj
		    System.out.println(s1);
		    System.out.println(s2);
		    System.out.println(s3);
		    System.out.println(s4);
		    
	    } catch (PinyinException e) {
			
			e.printStackTrace();
		} 
	    
	}
	
}
