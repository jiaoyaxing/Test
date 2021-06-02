package test.test;

import java.time.Clock;

public class Test {

	public static void main(String[] args) {
		Test t = new Test();
		t.test();
	}
	
	public void test(){
		System.out.println("d");
		//Apple apple = new Apple();
		/*
		Apple a1 = apple.apple;
		Apple a2 = a1.apple;
		
		System.out.println(apple);
		System.out.println(a1);
		System.out.println(a2);
		*/
	}
}


class Apple{
	Orange orange = new Orange();
}

class Orange{
	Apple apple = new Apple();
}