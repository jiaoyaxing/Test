package test.thread.interrupt;

public class Test5 {

	public static void main(String[] args) throws InterruptedException {
		Thread thread = new MyThread5();
		thread.start();
		Thread.sleep(2);
		thread.interrupt();
	}
}
