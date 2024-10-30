package studio7;

public class Rectangle {
	
	private int length;
	private int width;

	public Rectangle(int intilength, int intiwidth) {
		length = intilength;
		width = intiwidth;
	}
	
	public void square() {
		if (length == width) {
			System.out.println("Is a sqaure");		
		}
	}
	
	public int area() {
		return length * width;
	}
	
	public void smaller(Rectangle newRectangle) {
		if (newRectangle.area() > area()) {
			System.out.println("It's smaller");
		}
		
	}
}