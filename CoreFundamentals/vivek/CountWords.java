import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class CountWords {



	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub

		

		
		FileReader fr = new FileReader("D://vivek.txt");
		
		BufferedReader br = new BufferedReader(fr);
		String line="";
		int wordCount=0;
		
		while((line =br.readLine())!=null)
				{
			wordCount=wordCount+line.split(" ").length;
			
				}
				br.close();
				fr.close();
		System.out.println("wordCount "+wordCount);
		
	}

}
