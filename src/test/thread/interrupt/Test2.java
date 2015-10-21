package test.thread.interrupt;

public class Test2 {

	public static void main(String[] args) {
		Thread.currentThread().interrupt();
		System.out.println(Thread.interrupted());
		System.out.println(Thread.interrupted());
		
	}
}
