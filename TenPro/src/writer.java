
import java.io.FileReader;
import java.io.FileWriter;

public class writer {
	@SuppressWarnings("resource")
	public static void main(String[] args) {

		try {
			String fileName = "D:\\hello.txt";
			FileWriter fWriter = new FileWriter(fileName);
			fWriter.write("����������ѻ��\r\n" + "С����ˮ�˼ң�\r\n" + "�ŵ���������\r\n" + "Ϧ�����£�\r\n" + "�ϳ��������ġ�\r\n" + "");
			fWriter.close();

			FileReader fReader = new FileReader(fileName);
			int ch = -1;
			// fReader.read()��ȡ�����ַ�
			while ((ch = fReader.read()) != -1) {
				Character res = (char) ch;
				System.out.print(res);
			}
			
		} catch (Exception e) {
			System.out.println(e.getMessage());
		}
	}
}
