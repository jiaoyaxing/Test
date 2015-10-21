package test.thread.interrupt;

public class Test4 {

	public static void main(String[] args) throws InterruptedException {
		Thread thread = new MyThread4();
		thread.start();
		Thread.sleep(2);
		thread.interrupt();
	}
}
