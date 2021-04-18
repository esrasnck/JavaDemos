package readingFileDemo;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class Main {

	public static void main(String[] args)   {
		BufferedReader reader=null;
		
		int total =0;
		
		try {
			reader = new BufferedReader(new FileReader("C:\\Users\\Esra SANCAK\\eclipse-enterprise2\\readingFileDemo\\bin\\sayilar.txt"));
			String line = null;
			while((line =reader.readLine()) !=null) {
				total += Integer.valueOf(line);  // int e böyle çevriliyoy
 			}
			System.out.println("Toplam = "+total);
			
		} catch (FileNotFoundException e) {
			
			e.printStackTrace();
			
		} catch (IOException e) {
			
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		finally {
			try {
				
				reader.close();
				
			} catch (IOException e) {
				
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
	}

}
