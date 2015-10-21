package test.thread.threadtest;

public class MyThread extends Thread{
	
	public MyThread(){
		System.out.println(Thread.currentThread().getName());
		System.out.println(this.getName());
	}

	public void run(){
		
	}
}
