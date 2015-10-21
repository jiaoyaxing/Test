package test.thread.operator;

public class Test {

	public static void main(String[] args) {
		CountOperator operator = new CountOperator();
		operator.start();
		//operator.setName("A");
//		Thread t = new Thread(operator);
//		System.out.println("t.isAlive()="+t.isAlive());
//		t.setName("t");
//		t.start();
//		System.out.println("t.isAlive()="+t.isAlive());
	}
}
