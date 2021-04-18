package workingWithFiles;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner; 



public class Main {

	public static void main(String[] args) {
     
	  // createFile();
      // getFileInfo();
	  readFile();
	  writeFile();
	  readFile();
	}


	public static void createFile() {
		
		File file = new File("C:\\Users\\Esra SANCAK\\eclipse-enterprise2\\files\\student.txt");
		try {
			
			if(file.createNewFile()) {
				 // olusturuyor. sonra da true ya da false donduyor.
				System.out.println("Dosya olusturuldu");
				
			}else {
				System.out.println("Dosya zaten mevcut");
			}
			
		} catch (IOException e) {


			
			e.printStackTrace();
		}
	}

	
	public static void getFileInfo() {
		
		File file = new File("C:\\Users\\Esra SANCAK\\eclipse-enterprise2\\files\\student.txt");
		if(file.exists()) {
			System.out.println("Dosya adı : " +  file.getName());
			System.out.println("Dosya yolu : " +  file.getAbsolutePath());
			System.out.println("Dosya yazılabilir mi :" +  file.canWrite());
			System.out.println("Dosya okunabilir mi :" +  file.canRead());
			System.out.println("Dosya boyutu(byte) :" +  file.length());
		}
		
		
	}


	// buffered reader: dosyayı bir belleğe alıyor. orada işlemlerini yapıyor. 
	// file nesnesi belleğe almadan yapar. dosya üzerinden okuma işlemi gerçeklestirir.
	
	public static void readFile() {
		
		File file = new File("C:\\Users\\Esra SANCAK\\eclipse-enterprise2\\files\\student.txt");
		try {
			Scanner reader = new Scanner(file);
			
			while(reader.hasNextLine()) {
				
				String line = reader.nextLine(); // yeni bir satir varmi? varsa true donene kadar islemi yapıyor
				
				System.out.println(line);
						
			}
			reader.close(); // okunacak satır varsa demek
			
		}
		catch(FileNotFoundException e){
			e.printStackTrace();
		}
	}

	
	public static void writeFile() {
		
		try {
			
		    BufferedWriter writer = new BufferedWriter(new FileWriter("C:\\Users\\Esra SANCAK\\eclipse-enterprise2\\files\\student.txt",true));
	        writer.newLine();
		    writer.write(" Demirog");
		    System.out.println("Dosyaya yazildi");
		    writer.close();
		
		} catch (IOException e) {
		
			
			e.printStackTrace();
		}
	}

}
