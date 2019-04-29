import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.Writer;
import java.util.ArrayList;

public class Findjava {

	public static void main(String[] args) {
		File rootFile = new File("D:\\");
		ArrayList<String> arrayList = new ArrayList<String>();
		zxcFile(rootFile, arrayList);
		findwriter(arrayList);
	}

	static void zxcFile(File rootFile, ArrayList<String> arrayList) {

		// ��ȡĿ¼�������ļ�
		File[] fileArray = rootFile.listFiles();
		for (File file : fileArray) {
			if (file.isFile()) {
				// �Ƿ�Ϊ�ļ�
				if (file.getName().endsWith(".java")) {
					// �ļ���׺�Ƿ���.java
					// findwriter(file);
					// System.out.println(file.getName());
					arrayList.add(file.getAbsolutePath());
				}

			} else if (file.isDirectory()) {
				zxcFile(file, arrayList);
			}

		}

	}

	static void findwriter(ArrayList<String> arrayList) {
		File xcvFile = new File("./findJava.txt");
		try {

			FileWriter fWriter = new FileWriter(xcvFile);
			for (String string : arrayList) {
				fWriter.write(string+"\n");
			}

			fWriter.close();

		} catch (Exception e) {
			System.out.println(e.getMessage());
		}
	}
}
