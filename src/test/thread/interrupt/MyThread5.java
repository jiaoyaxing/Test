package test.thread.interrupt;

public class MyThread5 extends Thread{

	public void run(){
		try {
			for (int i = 0; i < 1000; i++) {
				if(this.interrupted()){
					System.out.println("循环中止");
					throw new InterruptedException();
				}
				System.out.println("i="+i);
			}
			System.out.println("after for...");
		} catch (Exception e) {
			System.out.println("catch");
		}
	}
}
