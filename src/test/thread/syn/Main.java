package test.thread.syn;

import java.util.Collections;

public class Main {

	public static void main(String[] args) {
		test3();
	}
	
	public static void test1(){
		MyObject object = new MyObject();
		ThreadA threadA = new ThreadA(object);
		ThreadB threadB = new ThreadB(object);
		threadA.start();
		threadB.start();
	}
	
	public static void test2(){
		MyObject objectA = new MyObject();
		MyObject objectB = new MyObject();
		ThreadA threadA = new ThreadA(objectA);
		ThreadB threadB = new ThreadB(objectB);
		threadA.start();
		threadB.start();
	}

	public static void test3(){
		ThreadC threadC0 = new ThreadC();
		ThreadC threadC1 = new ThreadC();
		threadC0.start();
		threadC1.start();
	}

}
