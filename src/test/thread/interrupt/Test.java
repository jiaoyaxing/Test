package test.thread.interrupt;

public class Test {

	public static void main(String[] args) throws InterruptedException {
		Thread thread = new MyThread();
		thread.start();
		//thread.sleep(5);
		thread.interrupt();
		System.out.println("thread.interrupted()="+thread.interrupted());
		System.out.println("thread.interrupted()="+thread.interrupted());
	}
}
