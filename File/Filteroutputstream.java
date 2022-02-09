import java.io.*;

public class Filteroutputstream {

	public static void main(String[] args)  throws IOException {
		
		        File data = new File("file1.txt");  
		        FileOutputStream file = new FileOutputStream(data);  
		        FilterOutputStream filter = new FilterOutputStream(file);  
		        String s="Welcome to java programming";      
		        byte b[]=s.getBytes();      
		        filter.write(b);     
		        filter.flush();  
		        filter.close();  
		        file.close();  
		        System.out.println("done");  
		    }  
		}