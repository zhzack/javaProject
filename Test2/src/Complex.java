public class Complex {
	double real;// 实部
	double imag;// 虚部

	public Complex(double real1, double imag1) {
		real = real1;
		imag = imag1;
	}

	public Complex(double real2) {
		real = real2;
		imag = 0;
	}
	

	// 计算复数的模
	public double sqrt() {
		return Math.sqrt(Math.pow(real, 2) + Math.pow(imag, 2));
	}

	public  Complex add(Complex c) {
		c.real = real + c.real;
		c.imag = imag + c.imag;
//		System.out.println(c.real+""+c.imag);
//		System.out.println(real+""+imag);
		return c;

	}

	@Override
	public String toString() {
		if (imag == 0) {
			return "(" + real + ")";
		} else {
			return "(" + real + "+" + imag + "*i" + ")";
		}
	}
}
