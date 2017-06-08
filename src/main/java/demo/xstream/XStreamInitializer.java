package demo.xstream;

import java.io.Writer;

import com.thoughtworks.xstream.XStream;
import com.thoughtworks.xstream.io.HierarchicalStreamWriter;
import com.thoughtworks.xstream.io.xml.PrettyPrintWriter;
import com.thoughtworks.xstream.io.xml.XppDriver;
import com.thoughtworks.xstream.security.NullPermission;
import com.thoughtworks.xstream.security.PrimitiveTypePermission;

public class XStreamInitializer {

	public static XStream getInstance() {
		XStream xstream = new XStream(new XppDriver() {
			@Override
			public HierarchicalStreamWriter createWriter(Writer out) {
				return new PrettyPrintWriter(out, getNameCoder()) {
					@Override
					public String encodeNode(String name) {
						return name;// 防止将_转换成__
					}
				};
			}
		});
		xstream.ignoreUnknownElements();
		xstream.setMode(XStream.NO_REFERENCES);
		xstream.addPermission(NullPermission.NULL);
		xstream.addPermission(PrimitiveTypePermission.PRIMITIVES);
		return xstream;
	}

}
