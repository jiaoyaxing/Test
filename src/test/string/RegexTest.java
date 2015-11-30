package test.string;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

import org.junit.Test;

public class RegexTest {

	
	public void test(){
		System.out.println("".matches("\\w{1}?"));
	}
	
	
	public void test2(){
		String s = "abc";
		Pattern pattern = Pattern.compile("\\w+");
		Matcher matcher = pattern.matcher(s);
		//System.out.println(matcher.matches());
		//System.out.println(matcher.groupCount());
		//System.out.println(matcher.group());
		//System.out.println(matcher.start());
		//System.out.println(matcher.end());
		//System.out.println(matcher.start(0));
		System.out.println(matcher.lookingAt());
	}
	

	public void test3(){
		String s = "abcd";
		Pattern pattern = Pattern.compile("\\w+(\\w+(\\w+))\\w+");
		Matcher matcher = pattern.matcher(s);
		while(matcher.find()){
			System.out.println("matcher.groupCount():"+matcher.groupCount());
			for (int i = 0; i < matcher.groupCount(); i++) {
				System.out.println(i + ":" + matcher.group(i));
			}
		}
	}
	
	@Test
	public void test4(){
		String s = "abc!";
		Pattern pattern = Pattern.compile("\\w+");
		Matcher matcher = pattern.matcher(s);
		
		
		if(matcher.lookingAt()){
			System.out.println(matcher.start() + " - " + matcher.end());
		}
		
		if(matcher.matches()){
			System.out.println(matcher.start() + " - " + matcher.end());
		}
		
	}
	
	@Test
	public void test5(){
		String s = "@@";
		String[] split = s.split("|");
		System.out.println(split.length);
	}
}
