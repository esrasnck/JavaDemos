package staticDemo;

public class ProductValidator {
	
	
	  public static boolean isValid(Product product) {
		  
		  if(product.price > 0 && !product.name.isEmpty()) {
			  
			  return true;
		  }else {
			  return false;
		  }
		 
	  }
	 
	
	
	// ana class static olamaz!!! ana inner classlar olur
	
	static {  // birden cok static blok yapabilirz.
		System.out.println("static yapici blok calisti");
	}
	// yapici bloklar newleyince calisir.
 public ProductValidator() {
		System.out.println("yapici blok calisti");
	 }
	

 public void bisey() {
 
 }
 public static class InnerClass{
	 
	 public static void sil() {
		// ana class static olamaz!!! ana inner classlar olur
	 }
 }
 
 

}
