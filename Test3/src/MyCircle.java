
public class MyCircle extends Shape {

	public double S, s;

	public MyCircle(double r) {
		super(1);
		S = Math.PI * r * r; //  �ܳ�
		s = 2 * Math.PI * r;//���
	}

	public double getPerimeter() {

		return s;

	}

	public double getArea() {

		return S;
	}
}