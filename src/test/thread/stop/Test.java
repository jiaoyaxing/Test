package test.thread.stop;

public class Test {

	public static void main(String[] args) throws InterruptedException{
		Thread thread = new MyThread();
		thread.start();
		Thread.sleep(100);
		thread.stop();
	}
}
