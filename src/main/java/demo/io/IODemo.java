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
		/**
		 * IOUtils.contentEquals(InputStream input1, InputStream input2) Ӣ�ģ�
		 * Compare the contents of two Streams to determine if they are equal or
		 * not. ���룺 �Ƚ������������������Ƿ����
		 */
		try {
//			 IOUtils.toString����������������utf-8�ı��뷽ʽ���ַ�������ʽ���
//			 System.out.println(IOUtils.toString(in,"UTF-8"));
		} finally {
//			IOUtils.closeQuietly(in);
		}
		System.out.println(IOUtils.contentEquals(in, in2));

		System.out.println("-----------------------------------------------------------------------");

		/**
		 * IOUtils.copy(InputStream input, OutputStream output) Ӣ�ģ� Copy bytes
		 * from an InputStream to an OutputStream. ���룺 ���ֽڴ�
		 * InputStream���Ƶ�OutputStream��
		 */
		ByteArrayOutputStream out = new ByteArrayOutputStream();
		IOUtils.copy(in2, out);
		System.out.println(out.size());
		// System.out.println(out.toString("UTF-8"));
		// IOUtils.closeQuietly(in);
		// IOUtils.closeQuietly(out);
		System.out.println("-----------------------------------");
		/**
		 * IOUtils.copyLarge(InputStream input, OutputStream output); Ӣ�� Copy
		 * bytes from a large (over 2GB) InputStream to an OutputStream. ���룺
		 * ���ֽڳ���2G���ֽ����������Ƶ��������
		 */
		IOUtils.copyLarge(in2, out);
		// System.out.println(out.toString("UTF-8"));
		System.out.println("------------------------------------------------------------");

		/**
		 * IOUtils.lineIterator(InputStream input, Charset encoding) Ӣ�� Return
		 * an Iterator for the lines in an InputStream, using the character
		 * encoding specified (or default encoding if null). ����
		 * ����һ��װ�������ֽ�������Iterator����ʹ���ض����ַ����루���û�������Ļ�����Ĭ�ϱ��룩
		 */
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
		/**
		 * IOUtils.read(InputStream input, byte[] buffer) Ӣ�ģ� Read bytes from an
		 * input stream. ���ģ����������ж�ȡ�ֽ�(ͨ���������������ֽ�����ĳ���)
		 */
		InputStream in4 = new URL("http://www.apache.org").openStream();
		byte[] buffer = new byte[100000];
		System.out.println(IOUtils.read(in4, buffer));
		System.out.println("------------------------------------------------");
		/**
		 * IOUtils.readLines(InputStream input, Charset encoding) Ӣ�ģ� Get the
		 * contents of an InputStream as a list of Strings, one entry per line,
		 * using the specified character encoding. ���룺 ��������������ݷŻ�һ��List
		 * <String>���͵�������ÿһ��Ϊ���������һ����ڣ�ʹ���ض����ַ��������Ϊ�վ�ʹ��Ĭ�ϵ��ַ�����
		 */
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
