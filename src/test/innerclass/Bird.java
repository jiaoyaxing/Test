package test.innerclass;

public class Bird {

	protected class Fly{
		public Fly(){
			System.out.println("Bird.Fly()");
		}
		public void c(){
			System.out.println("Bird.Fly.c()");
		}
	}
	private Fly fly;
	public Bird(){
		System.out.println("New Bird()");
	}
	public void insertFly(Fly ff){
		fly = ff;
	}
	public void g(){
		fly.c();
	}
}
