package test.thread.syn;

public class ThreadB extends Thread{

	private MyObject object = null;
	public ThreadB(MyObject object){
		super();
		this.object = object;
	}
	public void run(){
		super.run();
		object.methodB();
	}
}
