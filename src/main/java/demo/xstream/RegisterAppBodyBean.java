package demo.xstream;

import org.apache.commons.lang3.builder.ToStringBuilder;

import com.thoughtworks.xstream.annotations.XStreamAlias;

@XStreamAlias("body")
public class RegisterAppBodyBean implements RequestBody {

	private String appid;
	private String c_date;
	private String crc;
	private String returncode;
	private String returnmsg;

	public String getAppid() {
		return appid;
	}

	public void setAppid(String appid) {
		this.appid = appid;
	}

	public String getC_date() {
		return c_date;
	}

	public void setC_date(String c_date) {
		this.c_date = c_date;
	}

	public String getCrc() {
		return crc;
	}

	public void setCrc(String crc) {
		this.crc = crc;
	}

	public String getReturncode() {
		return returncode;
	}

	public void setReturncode(String returncode) {
		this.returncode = returncode;
	}

	public String getReturnmsg() {
		return returnmsg;
	}

	public void setReturnmsg(String returnmsg) {
		this.returnmsg = returnmsg;
	}

	@Override
	public String toString() {
		return new ToStringBuilder(this).append("appid", appid).append("c_date", c_date).append("crc", crc)
				.append("returncode", returncode).append("returnmsg", returnmsg).toString();
	}
}
