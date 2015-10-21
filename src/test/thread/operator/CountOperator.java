package test.thread.operator;

public class CountOperator extends Thread{

	public CountOperator(){
		System.out.println("CountOperator--begin");
		System.out.println("Thread.currentThread().getName()="+Thread.currentThread().getName());
		System.out.println("Thread.currentThread().isAlive()="+Thread.currentThread().isAlive());
		System.out.println("this.getName()="+this.getName());
		System.out.println("this.isAlive()="+this.isAlive());
		System.out.println("CountOperator--end");
	}
	public void run(){
		System.out.println("run--begin");
		System.out.println("Thread.currentThread().getName()="+Thread.currentThread().getName());
		System.out.println("Thread.currentThread().isAlive()="+Thread.currentThread().isAlive());
		System.out.println("this.getName()="+this.getName());
		System.out.println("this.isAlive()="+this.isAlive());
		System.out.println("run--end");
	}
}
