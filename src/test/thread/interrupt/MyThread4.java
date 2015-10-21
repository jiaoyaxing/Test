package test.thread.interrupt;

public class MyThread4 extends Thread{

	public void run(){
		for (int i = 0; i < 1000; i++) {
			if(this.interrupted()){
				break;
			}
			System.out.println("i="+i);
		}
	}
}
