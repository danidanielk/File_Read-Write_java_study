import java.io.BufferedWriter;
import java.io.FileOutputStream;
import java.io.OutputStreamWriter;

public class File_Writer {
	public static void main(String[] args) {

		try {

			FileOutputStream fos = new FileOutputStream("C:\\Users\\NT731QCJ-K582D\\Desktop\\test\\test6.text");
			OutputStreamWriter osw = new OutputStreamWriter(fos, "UTF8");
			BufferedWriter bw = new BufferedWriter(osw);

			bw.append("¾ß");

			bw.flush();

			bw.close();

		} catch (Exception e) {
			e.printStackTrace();
		}

	}
}
