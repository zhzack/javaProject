
public class MyTrangle extends Shape {

	public double S, s;
	boolean d;

	public MyTrangle(double a, double b, double c) {
		super(3);
//		if(a<(b+c)||b<(a+c)||c<(a+b)) {
//		}	
		d = a < (b + c) && b < (a + c) && c < (a + b);
		System.out.println(d);
		S = a + b + c;
		s = (double) ((1.0 / 4.0) * Math.sqrt((a + b + c) * (a + b - c) * (a + c - b) * (b + c - a)));

	}

	public double getPerimeter() {
		if (d) {

			return S;
		} else {
			return 0;
		}

	}

	public double getArea() {
		if (d) {

			return s;
		} else {
			return 0;
		}

	}
}
