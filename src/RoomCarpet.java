/* 
 * Chase Conaway
 * CptS 233: MicroAssignment 1: RoomCarpet.java
 * Date September 2nd, 2020
 * git repo url: https://github.com/Chase1242/MA1.git
 * Uses the passed dimensions to decide what the total cost of the carpet is.
 */


public class RoomCarpet {
	
	public RoomDimension roomD;
	double costPerSqFt;
	
	// This takes an object of RoomDimension and the cost per sq ft
	// and assigns the the variables.
	// Returns: N/A
	// Parameters: 
		// RoomDimension roomD: the dimensions of the room are stored here
		// double costPerSqFt: The cost of carpet per sq ft
	public RoomCarpet(RoomDimension roomD, double costPerSqFt) {
		this.roomD = new RoomDimension(roomD.length, roomD.width);
		
		this.costPerSqFt = costPerSqFt;
	}
	
	// Takes the cost per sq ft and the room dimensions and returns the total cost
	// Returns: double: the total costr of the  carpet
	// Parameters: N/A
	public double getTotalCost() {
		return costPerSqFt * roomD.getArea();
		
	}
	
	// Takes the total cost of the carpet and turns the double into a String.
	// Returns: String: the total cost in String format
	// Parameters: N/A
	public String toString() {
		return "" + getTotalCost();
	}
	
}
