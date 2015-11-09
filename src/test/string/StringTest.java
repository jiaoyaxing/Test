package test.string;

import org.junit.Test;

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
}
