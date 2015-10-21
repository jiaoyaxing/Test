package test.thread.interrupt;

public class Test3 {

	public static void main(String[] args) throws InterruptedException {
		Thread thread = new MyThread();
		thread.start();
		thread.interrupt();
		System.out.println(thread.isInterrupted());
		System.out.println(thread.isInterrupted());
	}
}
