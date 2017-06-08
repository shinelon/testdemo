package demo.tostring.util;

import java.lang.reflect.Field;

import demo.xstream.RequestBean;

public class ToStringBuilderTool {
	 public static void main(String[] args) {
			Class<RequestBean> clz=RequestBean.class;
			Field[] fields=clz.getDeclaredFields();
			StringBuilder sb=new StringBuilder("new ToStringBuilder(this)");
			for (Field field : fields) {
				sb.append(".append(\""+field.getName()+"\","+field.getName()+")");
			}
			sb.append(".toString();");
			System.out.println(sb.toString());
	}
}
