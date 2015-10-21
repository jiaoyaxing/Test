package test.innerclass;

public class Eagle extends Bird{

	public class Fly extends Bird.Fly{
		public Fly(){
			System.out.println("Eagle.Fly()");
		}
		public void c(){
			System.out.println("Eagle.Fly.c()");
		}
	}
	public Eagle(){
		System.out.println("new Eagle");
		insertFly(new Fly());
	}
	public static void main(String[] args){
		Bird eagle = new Eagle();
		eagle.g();
	}
}
