package demo.xstream;

import java.util.ArrayList;
import java.util.List;

import org.apache.commons.lang3.StringUtils;

import com.thoughtworks.xstream.XStream;

public class Test {
	public static void main(String[] args) {
		//ALL
		RequestBean bean= new RequestBean();
		bean.setVersion("1.0");
		bean.setComment("登记应用");
		bean.setId("DJAPP");
		//HEAD
		RegisterAppHeadBean beanHead =new RegisterAppHeadBean();
		beanHead.setAppname("应用名称");		
		beanHead.setDevkey("开发号");		
		beanHead.setQy_name("企业名称");
		List<RequestHead> headList=new ArrayList<>();
		headList.add(beanHead);
		bean.setRequestHead(headList);
		//BODY
		RegisterAppBodyBean beanBody =  new RegisterAppBodyBean();
		beanBody.setAppid("应用id");
		beanBody.setC_date("生成时间");
		beanBody.setCrc("验证码");
		beanBody.setReturncode("0");
		beanBody.setReturnmsg("返回消息描述");
		List<RequestBody> bodyList= new ArrayList<>();
		bodyList.add(beanBody);
		bean.setRequestBody(bodyList);
		
		XStream xstream = XStreamInitializer.getInstance();
		xstream.processAnnotations(new Class[]{RequestBean.class,RegisterAppHeadBean.class,RegisterAppBodyBean.class});
		String xml = xstream.toXML(bean);
		System.out.println(xml);
		RequestBean newBean =(RequestBean)xstream.fromXML(xml);
		System.out.println(newBean.toString());
	}
}
