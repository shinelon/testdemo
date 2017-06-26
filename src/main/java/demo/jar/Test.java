package demo.jar;

import org.slf4j.Logger;

public class Test {
	public static void main(String[] args) {
		System.out.println(ClassLocationUtils.where(Logger.class));
	}
}
