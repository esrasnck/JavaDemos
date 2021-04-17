package staticDemo;

public class ProductManager {
	

    public void add(Product product) {
    	
    	if(ProductValidator.isValid(product)) 
    	{
	     System.out.println("eklendi");
	    }
    	else {
    		System.out.println("ürün bilgileri geçersizdir");
    	}
    	
        
        ProductValidator productValidator = new ProductValidator();  
        
        productValidator.bisey();  // yapici bloklar newleyince calisir
  }
 
    
}
