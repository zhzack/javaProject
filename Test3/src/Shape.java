
public class Shape {
	public int side;// ����

	public Shape(int cnt) {
		side = cnt;
	}

	public double getPerimeter() {
		return 0;

	}
	public double getArea() {
		
		return 0;
	}

	@Override
	public String toString() {
		
		return String.format("��ͼ�ι���%d���ߣ��ܳ�Ϊ��%S,���Ϊ��%s", side,getPerimeter(),getArea());

	}
}
