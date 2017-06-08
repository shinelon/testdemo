package demo.xstream;

import org.apache.commons.lang3.builder.ToStringBuilder;

import com.thoughtworks.xstream.annotations.XStreamAlias;

@XStreamAlias("head")
public class RegisterAppHeadBean implements RequestHead {
	private String devkey;
	private String qy_name;
	private String appname;

	public String getDevkey() {
		return devkey;
	}

	public void setDevkey(String devkey) {
		this.devkey = devkey;
	}

	public String getQy_name() {
		return qy_name;
	}

	public void setQy_name(String qy_name) {
		this.qy_name = qy_name;
	}

	public String getAppname() {
		return appname;
	}

	public void setAppname(String appname) {
		this.appname = appname;
	}

	@Override
	public String toString() {
		return new ToStringBuilder(this).append("devkey", devkey).append("qy_name", qy_name).append("appname", appname)
				.toString();
	}
}
