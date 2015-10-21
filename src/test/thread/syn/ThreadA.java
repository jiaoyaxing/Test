package test.thread.syn;

public class ThreadA extends Thread {

	private MyObject object = null;
	public ThreadA(MyObject object){
		super();
		this.object = object;
	}
	public void run(){
		super.run();
		object.methodA();
	}
}
