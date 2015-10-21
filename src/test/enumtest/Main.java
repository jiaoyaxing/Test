package test.enumtest;

public class Main {

	public static void main(String args[]){
		System.out.println(Color.class);
		System.out.println(Color.RED);
		System.out.println(Color.RED.toString());
		System.out.println(Color.RED.name());
		System.out.println(Color.RED.values());
		System.out.println(Color.values());
		System.out.println(Color.valueOf("RED"));
		System.out.println("----");
		Color[] values = Color.values();
		for(Color c : values){
			System.out.println(c);
		}
		
		System.out.println(Color.RED.ordinal());
		System.out.println(Color.RED.equals(Color.RED1));
		System.out.println(Color.RED.compareTo(Color.YELLOW));
		
		System.out.println("----");
		
		Color color = Color.BLACK;
		switch(color){
			case RED: System.out.println("it is red"); break;
			case BLUE: System.out.println("it is blue"); break;
			default: System.out.println("none");
		}
	}
}
