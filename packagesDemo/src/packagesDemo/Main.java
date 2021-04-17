package packagesDemo;

import java.util.Scanner;
import matematik.*;


public class Main {

	//  build in => Javanın içinde var. ör: java.util.Scanner gibi
	//  bir paketi başka paket içinde kullanmak istiyorsan, onu import etmen gerek.
	// scanner => kullanıcıdan bilgi almaya yarıyor.
	
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in); // => console.readline gibi 

		System.out.println("Adiniz :" );
		
		String isim = scanner.nextLine(); // => datayı okuyabiliyor.z
		
		System.out.println("Merhaba " +  isim);
		
		DortIslem dortIslem  = new DortIslem();
		dortIslem.topla(2,3);
		Logaritma logaritma = new Logaritma();
		
		System.out.println(dortIslem.topla(2,3) + logaritma.logaritmaHesapla());
		
	}

}
