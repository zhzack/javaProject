
public class MyCircle extends Shape {

	public double S, s;

	public MyCircle(double r) {
		super(1);
		S = Math.PI * r * r; //  周长
		s = 2 * Math.PI * r;//面积
	}

	public double getPerimeter() {

		return s;

	}

	public double getArea() {

		return S;
	}
}