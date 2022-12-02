import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.InputStreamReader;

public class File_Reader {
	public static void main(String[] args) {

		try {

			FileInputStream fis = new FileInputStream("C:\\Users\\NT731QCJ-K582D\\Desktop\\test\\test6.text");
			InputStreamReader isr = new InputStreamReader(fis, "UTF-8");
			BufferedReader br = new BufferedReader(isr);

			String line = null;
			while ((line = br.readLine()) != null) {
				System.out.println(line);
			}
			br.close();
		} catch (Exception e) {
			// TODO: handle exception
		}
	}

}
