package measure;

public class Measurement {

	public static void main(String[] args) {
		int length;
		int width;
		double height;
		
		length = 15;
		width = 6;
		height = 20.0;
		
		volume(length, width, height);
		area(length, width);
		square(length);
		sum(length, width);
		sum(length / 2 + 3, width / 2 + 1);

	}
	public static void volume(int length, int width, double height) {
		System.out.println("The volume is " + (length * width * height));
	}
	
	public static void area(int length, int width) {
		System.out.println("The area is " + (length * width));
	}
	
	public static void square(int length) {
		System.out.println("The square is " + (length * length));
	}
	
	public static void sum(int length, int width) {
		System.out.println("The sum is " + (length + width));
	}
	// able to do this because it is unique signature
	public static void area(double l, double w) {
		double a = l * w;
		System.out.println("This is the other area " + a);
	}
}
