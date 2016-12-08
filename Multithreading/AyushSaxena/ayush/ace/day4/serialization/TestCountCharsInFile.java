package ayush.ace.day4.serialization;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.Reader;

public class TestCountCharsInFile {

	
	public static void main(String[] args) throws Exception{
		int count = 0;
		
		Reader f  = new BufferedReader(new FileReader(new File("C://input.txt")));
		f.mark(1);
		while (f.read()!=-1){
			
			count++;
		
			
			
			
			
		}
		f.reset();
		System.out.println("Total characters "  + count);
		
		BufferedReader line = (BufferedReader)f;
		int linecount = 0;
		while(line.readLine() != null){
			linecount++;
			
		}
		System.out.println("Total lines " + linecount);
		
	
	}
	
	
	
	
	
}
