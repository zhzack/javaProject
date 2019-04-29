import java.io.BufferedReader;
import java.io.FileReader;
import java.util.ArrayList;
import java.util.Comparator;

public class numSort {
	public static void main(String[] args) {
		try {
			String fileName = "E:\\��ҵ\\ʵ��ָ����10_190425141450_��Ԫ��\\Trial_10_num.txt";
			BufferedReader br = new BufferedReader(new FileReader(fileName));

			String lineString = br.readLine();

			ArrayList<Integer> stuScore = new ArrayList<Integer>();
			for (String integer : lineString.split(",")) {
				stuScore.add(Integer.parseInt(integer));
			}
			stuScore.sort(new Comparator<Integer>() {
				public int compare(Integer o1, Integer o2) {

					return o1 - o2;
				}
			});
			for (Integer integer : stuScore) {
				System.out.println(integer);
			}
			br.close();
		} catch (Exception e) {
			System.out.println(e.getMessage());
		}
	}
}
