package test.test;

import org.junit.Test;

public class ByteTest {

	@Test
	public void test(){
		byte b = 0;
		int i = b & 0xff;
		int j = b;
		System.out.println(b);
	}
}
