import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class Filewriter {

	  public static void main(String args[]) throws IOException {


	    	FileReader fr = new FileReader("file1.txt");
	      FileWriter fw = new FileWriter("file2.txt");

			int i;

			while ((i = fr.read()) != -1) {

				fw.write(i);

			}

			fr.close();  
	      fw.close();
	    System.out.println("Succefull");

	 
	  }
	}