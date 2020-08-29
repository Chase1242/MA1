public class RoomCarpet {
	
	
	
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