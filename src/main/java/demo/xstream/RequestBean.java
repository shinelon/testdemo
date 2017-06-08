package demo.xstream;

import java.util.List;

import org.apache.commons.lang3.builder.ToStringBuilder;

import com.thoughtworks.xstream.annotations.XStreamAlias;
import com.thoughtworks.xstream.annotations.XStreamAsAttribute;
import com.thoughtworks.xstream.annotations.XStreamImplicit;

@XStreamAlias("business")
public class RequestBean {
	@XStreamAsAttribute
	private String comment;
	@XStreamAsAttribute
	private String id;
	@XStreamAsAttribute
	private String version;
	@XStreamImplicit()
	private List<RequestHead> requestHead;
	@XStreamImplicit()
	private List<RequestBody> RequestBody;

	public String getComment() {
		return comment;
	}

	public void setComment(String comment) {
		this.comment = comment;
	}

	public String getId() {
		return id;
	}

	public List<RequestBody> getRequestBody() {
		return RequestBody;
	}

	public void setRequestBody(List<RequestBody> requestBody) {
		RequestBody = requestBody;
	}

	public List<RequestHead> getRequestHead() {
		return requestHead;
	}

	public void setRequestHead(List<RequestHead> requestHead) {
		this.requestHead = requestHead;
	}

	public void setId(String id) {
		this.id = id;
	}

	public String getVersion() {
		return version;
	}

	public void setVersion(String version) {
		this.version = version;
	}

	@Override
	public String toString() {
		return new ToStringBuilder(this).append("comment", comment).append("id", id).append("version", version)
				.append("requestHead", requestHead).append("RequestBody", RequestBody).toString();
	}
}
