package test.thread.stop;

public class MyThread extends Thread{

	public void run(){
		int i = 0;
		while(true){
			System.out.println("i="+i++);
		}
	}
}
