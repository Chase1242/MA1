/* 
 * Chase Conaway
 * CptS 233: MicroAssignment 1: RoomDimension/java
 * Date September 2nd, 2020
 * git repo url: https://github.com/Chase1242/MA1.git
 * Takes dimensions given and finds the total area.
 */


public  class RoomDimension {
	
	public double length, width;
	
	public RoomDimension(double length, double width) {
		this.length = length;
		this.width = width;
	}
	
	public double getArea() {
		return length * width;
		
	}
	
	public String toString() {
		return "" + getArea();
	}
}
