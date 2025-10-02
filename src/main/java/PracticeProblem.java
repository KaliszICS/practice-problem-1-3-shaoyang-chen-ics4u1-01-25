import java.io.FileReader;
import java.io.IOException;

public class PracticeProblem {

	public static void main(String args[]) {

	}
	public static String readFile(String filename){
		FileReader fr = null;
		StringBuilder sb = new StringBuilder();
		try {
			fr = new FileReader(filename);
			int character;
			while ((character = fr.read()) != -1) {
				sb.append((char) character);
			}
		} catch (IOException e) {
				System.out.println(e);
				return "";
		} finally {
			if (fr != null) {
				try {
					fr.close();
				} catch (IOException e) {
					System.err.println(e);
					return "";
				}
			}
		}
		return sb.toString();
	}
	public static String backwardsReadFile(String filename){
		String normalResult = readFile(filename);
		String backwardsResult = new StringBuilder(normalResult).reverse().toString();
		return backwardsResult;
	}
	

}
