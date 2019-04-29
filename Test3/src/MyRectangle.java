
public class MyRectangle extends Shape {
	public double S, s;

	public MyRectangle(double h, double l) {
		super(4);
		S = 2 * (h + l);
		s=h*l;
	}

	public double getPerimeter() {

		return S;

	}

	public double getArea() {

		return s;
	}
}