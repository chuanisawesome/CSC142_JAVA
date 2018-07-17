package messages;

public class MessageTest {

	public static void main(String[] args) {
		System.out.println("Start of main");
		message1();
		message2();
		System.out.println("Done with Main");
	}
	
	public static void message1() {
		System.out.println("This is message 1");
	}
	
	public static void message2() {
		System.out.println("This is message 2");
		message1(); // calls message1
		System.out.println("Done with message 2");
	}
}
