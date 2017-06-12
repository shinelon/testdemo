package demo.xstream;

import java.util.ArrayList;
import java.util.List;

import org.apache.http.HttpEntity;
import org.apache.http.HttpResponse;
import org.apache.http.NameValuePair;
import org.apache.http.client.entity.UrlEncodedFormEntity;
import org.apache.http.client.methods.HttpPost;
import org.apache.http.entity.StringEntity;
import org.apache.http.impl.client.CloseableHttpClient;
import org.apache.http.impl.client.HttpClients;
import org.apache.http.message.BasicNameValuePair;
import org.apache.http.util.EntityUtils;

import com.thoughtworks.xstream.XStream;

public class HttpPostWithJSON {
	public static String httpPostWithJSON(String url) throws Exception {

		HttpPost httpPost = new HttpPost(url);
		CloseableHttpClient client = HttpClients.createDefault();
		String respContent = null;
		// ALL
		RequestBean bean = new RequestBean();
		bean.setVersion("1.0");
		bean.setComment("登记应用");
		bean.setId("DJAPP");
		// HEAD
		RegisterAppHeadBean beanHead = new RegisterAppHeadBean();
		beanHead.setAppname("乐富测试应用1");		
		beanHead.setDevkey("aad94c72-be2c-4e24-a39b-c837cdf486c8");		
		beanHead.setQy_name("乐富测试1");
		List<RequestHead> headList = new ArrayList<>();
		headList.add(beanHead);
		bean.setRequestHead(headList);
		XStream xstream = XStreamInitializer.getInstance();
		xstream.processAnnotations(
				new Class[] { RequestBean.class, RegisterAppHeadBean.class, RegisterAppBodyBean.class });
		String xml = xstream.toXML(bean);
		System.out.println(xml);
		List<NameValuePair> valuePairs = new ArrayList<>(1);
		NameValuePair parm = new BasicNameValuePair("bw", "<?xml version='1.0' encoding='utf-8'?>" + xml);
		valuePairs.add(parm);
		UrlEncodedFormEntity formEntity = new UrlEncodedFormEntity(valuePairs, "utf-8");
		httpPost.setEntity(formEntity);

		HttpResponse resp = client.execute(httpPost);
		if (resp.getStatusLine().getStatusCode() == 200) {
			HttpEntity he = resp.getEntity();
			respContent = EntityUtils.toString(he, "UTF-8");
		}
		return respContent;
	}

	public static void main(String[] args) throws Exception {
		String result = httpPostWithJSON("http://120.26.131.180:19900/fpfw/api/kpbusiness");
		System.out.println(result);
	}
}
