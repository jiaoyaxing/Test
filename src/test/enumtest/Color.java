package test.enumtest;

public enum Color {
	
	RED(255,0,0),BLUE(0,0,255),BLACK(0,0,0),YELLOW(255,255,0),GREEN(0,255,0),
	RED1(255,0,0);
	
	private int redValue;
	private int greenValue;
	private int blueValue;
	
	private Color(int redValue, int greenValue, int blueValue){
		this.redValue = redValue;
		this.greenValue = greenValue;
		this.blueValue = blueValue;
	}
	
	
}
