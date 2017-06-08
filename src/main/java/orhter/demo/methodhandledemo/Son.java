package orhter.demo.methodhandledemo;

import static java.lang.invoke.MethodHandles.lookup;

import java.lang.invoke.MethodHandle;
import java.lang.invoke.MethodType;

class Son extends Father {
	void thinking() {
//		System.out.println("Son");
//		super.thinking();
		try {
			MethodType mt = MethodType.methodType(void.class);
			MethodHandle mh = lookup().findSpecial(GrandFather.class, "thinking", mt,Son.class);
			mh.invoke();
		} catch (Throwable e) {
		}
	}
}
