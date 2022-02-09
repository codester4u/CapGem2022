import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;



public class Bufferedoutputstream {

	public static void main(String[] args) throws IOException {

		InputStream in = new FileInputStream("File1.txt");

		FileOutputStream out = new FileOutputStream("File2.txt");

		int i;

		while ((i = in.read()) != -1) {

			out.write(i);

		}

		in.close();
		System.out.println("Succesfull");


	}

}