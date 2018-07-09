package introducton;

// need to import at the bottom of the package in order to work properly
import java.util.Scanner;

public class TestInput {

	public static void main(String[] args) {
		// integer stored mem
		int age;
		// string stored in mem
		String name;
		
		// input things we going to grab from console (input stream)
		Scanner keyboard = new Scanner(System.in);
		
		// ask user for name and age
		System.out.print("Enter name and age: ");
		// keyboard input is a string
		name = keyboard.next();
		// keyboard input integer
		age = keyboard.nextInt();
		
		// print out name and age (output)
		System.out.println("Name: \t" + name);
		System.out.println("Age: \t" + age);
		
		// close output stream (keyboard)
		keyboard.close();
	}

}
