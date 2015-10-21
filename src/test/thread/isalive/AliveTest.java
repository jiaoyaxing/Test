package test.thread.isalive;

public class AliveTest {

	public static void main(String[] args) throws InterruptedException {
		Thread t = new MyThread();
		System.out.println("begin:"+t.isAlive());
		t.start();
		Thread.sleep(1000);
		System.out.println("end:"+t.isAlive());
	}
}

