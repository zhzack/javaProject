
public class Shape {
	public int side;// 边数

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
		
		return String.format("该图形共有%d条边，周长为：%S,面积为：%s", side,getPerimeter(),getArea());

	}
}
