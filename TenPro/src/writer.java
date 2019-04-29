
import java.io.FileReader;
import java.io.FileWriter;

public class writer {
	@SuppressWarnings("resource")
	public static void main(String[] args) {

		try {
			String fileName = "D:\\hello.txt";
			FileWriter fWriter = new FileWriter(fileName);
			fWriter.write("枯藤老树昏鸦，\r\n" + "小桥流水人家，\r\n" + "古道西风瘦马。\r\n" + "夕阳西下，\r\n" + "断肠人在天涯。\r\n" + "");
			fWriter.close();

			FileReader fReader = new FileReader(fileName);
			int ch = -1;
			// fReader.read()读取单个字符
			while ((ch = fReader.read()) != -1) {
				Character res = (char) ch;
				System.out.print(res);
			}
			
		} catch (Exception e) {
			System.out.println(e.getMessage());
		}
	}
}
