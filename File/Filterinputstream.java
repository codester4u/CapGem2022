import java.io.BufferedInputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.FilterInputStream;
import java.io.IOException;

public class Filterinputstream {
	
	    public static void main(String[] args) throws IOException {  
	        File data = new File("file1.txt");  
	        FileInputStream  file = new FileInputStream(data);  
	        FilterInputStream filter = new BufferedInputStream(file);  
	        int n=0;  
	        while((n=filter.read())!=-1){  
	            System.out.print((char)n);  
	        }  
	        file.close();  
	        filter.close();  
	    }  
	}