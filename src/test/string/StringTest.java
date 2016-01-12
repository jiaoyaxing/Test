package test.string;

import java.util.Random;

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

	@Test
	public void random(){
		Random r = new Random();
		for (int i = 0; i < 100; i++) {
			System.out.println(r.nextInt(10));
		}
		
	}
	
	//8000.00
	@Test
	public void numtest(){
		String s = "8000.00";
		int a = Integer.parseInt(s);
		System.out.println(a);
	}
	
	@Test
	public void test5(){
		String s = "sddd@";
		String[] split = s.split("@");
		System.out.println(split.length);
	}
}
