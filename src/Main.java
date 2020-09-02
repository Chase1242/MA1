/* 
 * Chase Conaway
 * CptS 233: MicroAssignment 1: Main.java
 * Date September 2nd, 2020
 * git repo url: https://github.com/Chase1242/MA1.git
 * Takes dimensions for a room and the cost per square foot and returns the cost of the carpet.
 */

import java.util.*;

public class Main {
	
	public static void main(String[] args) {
		Scanner console = new Scanner(System.in);
		intro();
		
		double length = getDimension(console, "length");
		double width = getDimension(console, "width");
		
		System.out.println("Thanks! Next enter the cost of the carpet per sq. ft. (Ex. 12.45)");
		double cost = getDimension(console, "cost per sq. ft");
		
		RoomCarpet carpet = new RoomCarpet(new RoomDimension(length, width), cost);
		System.out.println("This is your total cost: $" + carpet.getTotalCost());
		System.out.println("Thanks for coming by! Have a great day!");
		
	}
	
	// Prints out the intro to the program
	// Returns: N/A
	// Parameters: N/A
	public static void intro() {
		System.out.println("Hello there, fellow carpenter! It is me, another human, yes.");
		System.out.println("I am here to help with your needs. Please, enter the room");
		System.out.println("dimensions, in feet, length followed by width.");
		System.out.println("Ex: 8.45");
		System.out.println("10");
	}
	
	// Gets a double from the user. Notable that it will break if passed anything but a double
	// or int
	// Returns: N/A
	// Parameters: N/A
	public static double getDimension(Scanner console, String dimens) {
		System.out.print("What is the " + dimens + "? ");
		double dimension = console.nextDouble();
		return dimension;
	}
	
}
