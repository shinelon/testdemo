package demo.io;

import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.net.MalformedURLException;
import java.net.URL;
import java.util.Iterator;
import java.util.List;

import org.apache.commons.io.IOUtils;
import org.apache.commons.io.LineIterator;

public class IODemo {
	public static void main(String[] args) throws MalformedURLException, IOException {
		InputStream in = new URL("http://www.apache.org").openStream();
		InputStream in2 = new URL("http://www.apache.org").openStream();
		try {
//			 System.out.println(IOUtils.toString(in,"UTF-8"));
		} finally {
//			IOUtils.closeQuietly(in);
		}
		System.out.println(IOUtils.contentEquals(in, in2));

		System.out.println("-----------------------------------------------------------------------");

		ByteArrayOutputStream out = new ByteArrayOutputStream();
		IOUtils.copy(in2, out);
		System.out.println(out.size());
		// System.out.println(out.toString("UTF-8"));
		// IOUtils.closeQuietly(in);
		// IOUtils.closeQuietly(out);
		System.out.println("-----------------------------------");
		IOUtils.copyLarge(in2, out);
		// System.out.println(out.toString("UTF-8"));
		System.out.println("------------------------------------------------------------");

		InputStream in3 = new URL("http://www.apache.org").openStream();
		try {
			LineIterator it = IOUtils.lineIterator(in3, "UTF-8");
			System.out.println(it.hasNext());
			while (it.hasNext()) {
				String line = it.nextLine();
				System.out.println(line);
			}
		} finally {
			IOUtils.closeQuietly(in);
		}
		System.out.println("------------------------------------------------------------------");
		InputStream in4 = new URL("http://www.apache.org").openStream();
		byte[] buffer = new byte[100000];
		System.out.println(IOUtils.read(in4, buffer));
		System.out.println("------------------------------------------------");
		InputStream in5 = new URL("http://www.apache.org").openStream();
		List<String> list = IOUtils.readLines(in5, "UTF-8");
		Iterator<String> iter = list.iterator();
		while (iter.hasNext()) {
			String s = iter.next();
			// System.out.println(s);
		}
		System.out.println("--------------------------------------------------------------");

	}
}
