package test.thread.syn;

public class MyObject {

	synchronized public void methodA(){
		System.out.println("begin methodA threadName="+ Thread.currentThread().getName() 
				+ ",time=" + System.currentTimeMillis());
		try {
			Thread.sleep(5000);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		System.out.println("end methodA threadName="+ Thread.currentThread().getName() 
				+ ",time=" + System.currentTimeMillis());
	}
	
	synchronized public void methodB(){
		System.out.println("begin methodB threadName="+ Thread.currentThread().getName() 
				+ ",time=" + System.currentTimeMillis());
		try {
			Thread.sleep(5000);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		System.out.println("end methodB threadName="+ Thread.currentThread().getName() 
				+ ",time=" + System.currentTimeMillis());
	}
	
}
