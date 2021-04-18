package exceptionHandling;

public class Main {

	public static void main(String[] args) {
	
	try {
		int[] sayilar =new int[] {1,2,3};
		
		System.out.println(sayilar[5]); // compile oldu ama hata fırlattı.

	}catch(StringIndexOutOfBoundsException e){
		System.out.println("Hata olustu : "+ e);
	}
	catch (ArrayIndexOutOfBoundsException e){
		
		System.out.println("Hata olustu : "+ e);
	}

	catch(Exception  e) {
		System.out.println("Logged " + e);
	}
	finally {
		System.out.println("her turlu calisir"); //veritabanina baglandik. hata olustu.o baglanti kapamak için bu kullanilir.
		// bir dosyaya baglandiniz. programsal olarak acdiniz. bellekte durmasin diye kapamak gerek.
	}

	}
	// uncheck exception: try catch ile kontrol altina alabiliriz.
	
	// aritmetic exception: sayisal hatalar sayilarla. 
	// classCast exception : tip donusum hatası
	// index out of bounds exception : arraylerle alakalı
	// string index out of bounds exception : 5 elemanli stringin 6. elemanina ulasmak istersen. string icin
	// referenası olmayan bir hatayi gorunce: null pointer exception
	
	// checked exception:
	// hatalarin olusabilecegi noktalarda, bizim kontrol altına al diye uyari vermemiz gerekiyor.
	
	
}
