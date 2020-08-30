public class RoomCarpet {
	
	public RoomDimension roomD;
	double cost;
	
	public RoomCarpet(RoomDimension roomD, double cost) {
		this.roomD = new RoomDimension(roomD.length, roomD.width);
		
		this.cost = cost;
	}
	
	public double getTotalCost() {
		return cost * roomD.getArea();
		
	}
	
	public String toString() {
		return "" + getTotalCost();
	}
	
	private static class RoomDimension {
		
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
}