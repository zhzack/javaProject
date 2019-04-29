
public class Test3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Shape[] shapes = new Shape[4];
		// 合法三角形
		Shape s1 = new MyTrangle(3, 4, 5);
		shapes[0] = s1;
		// 非法三角形
		Shape s2 = new MyTrangle(3, 1, 2);
		shapes[1] = s2;
		// 矩形
		Shape s3 = new MyRectangle(100, 50);
		shapes[2] = s3;
		// 圆形
		Shape s4 = new MyCircle(5);
		shapes[3] = s4;
		showShapes(shapes);
	}

	public static void showShapes(Shape[] shps) {
		for (int i = 0; i < shps.length; i++) {
			if (shps[i] != null) {
				System.out.println(shps[i].toString());

			}

		}

	}

}
