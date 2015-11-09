package test.weakreference;

import java.lang.ref.WeakReference;

import org.junit.Test;

public class WRTest {

	@Test
	public void test(){
		Widget widget = new Widget();
		WeakReference<Widget> weak = new WeakReference<Widget>(widget);
		Widget widget2 = weak.get();
		System.out.println(widget2);
	}
	
	
}
