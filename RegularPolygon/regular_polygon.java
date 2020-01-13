public class RegularPolygon {
	
	public static void main(String[] args) {
		RegularPolygon poly1 = new RegularPolygon();
		System.out.println("Object 1-perimeter: "+ poly1.getPerimeter());
		System.out.println("Object 1-area: "+ poly1.getArea());
		System.out.println();
		
		RegularPolygon poly2 = new RegularPolygon(6, 4);
		System.out.println("Object 2-perimeter: "+ poly2.getPerimeter());
		System.out.println("Object 2-area: "+ poly2.getArea());
		System.out.println();
		
		RegularPolygon poly3 = new RegularPolygon(10, 4, 5.6, 7.8);
		System.out.println("Object 3-perimeter: "+ poly3.getPerimeter());
		System.out.println("Object 3-area: "+ poly3.getArea());

	}
	
	private int n = 3;
	private double side = 1;
	private double x = 0;
	private double y = 0;
	
	public RegularPolygon(){
		 n = 3;
		 side = 1;
		 x = 0;
		 y = 0;
	}
	public RegularPolygon(int numSides, double numLength){
		n = numSides;
		side = numLength;
	}
	public RegularPolygon(int newSide, double newLength, double xCor, double yCor){
		n = newSide;
		side = newLength;
		x = xCor;
		y = yCor;
	}
	public void setN(int numSides){
		n = numSides;
	}
	public int getN() {
		return n;
	}
	
	public void setSide(double numLength) {
		side = numLength;
	}
	public double getSide() {
		return side;
	}
	public void setX(double newX){
		x = newX;
	}
	public double getX() {
		return x;
	}
	public void setY(double newY){
		y = newY;
	}
	public double getY() {
		return y;
	}
	
	public double getPerimeter() {
		return side * n;
	}
	
	public  double getArea() {
		return (n * Math.pow(side, 2)) / (4 * Math.tan(Math.PI / n));
	}
	
}
