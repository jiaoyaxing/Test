package test.string;

import org.junit.Test;

import sun.security.provider.MD5;
import test.encrypt.MD5Digest;


public class StringTest {

	@Test
	public void test(){
		String s = "a";
		change(s);
		System.out.println(s);
	}	
	
	public void change(String s){
		s = "x";
	}
	
	@Test
	public void formatTest(){
		int x = 5;
		double d = 1.12;
		System.out.format("row 1: [%d , %f]", x ,d );
	}
	
	@Test
	public void md5(){
		
	}

}
