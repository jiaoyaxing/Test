package test.constructor;

public class BoardGame extends Game{

	BoardGame(){
		//int i = 0;
		super(5);
	}
	BoardGame(int i) {
		super(i);
		System.out.println("BoradGame Constructor");
	}

	public static void main(String[] args) {
		BoardGame bg = new BoardGame(5);
		
	}
	
}
