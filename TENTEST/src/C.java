
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;

public class C {

	String[] javahouzhui = new String[50];// 数组

	public String[] find(String path) {
		File f = new File(path);
		File[] fA = f.listFiles();

		if (fA != null) {
			for (int i = 0; i < fA.length; i++) {
				if (fA[i].isDirectory()) {
					find(fA[i].getAbsolutePath());
				} else if (fA[i].isFile() && fA[i].getName().endsWith("java")) {
					javahouzhui[i] = fA[i].getAbsolutePath();

				}
			}
		}

		return javahouzhui;
	}

	//

	public static void main(String[] args) {
		C FJ = new C();
		FJ.find("D:/");
		try {
			String fileName = "D:/Hello.txt";
			BufferedWriter FW = new BufferedWriter(new FileWriter(fileName));
			for (int i = 0; i < FJ.javahouzhui.length; i++) {
				FW.write(String.valueOf(FJ.javahouzhui[i] + "\r\n")); // 将每一个具有java的文件夹路径写一行，写一换一行
			}
			FW.close();

		} catch (Exception e) {
			e.printStackTrace();
		}

	}

}