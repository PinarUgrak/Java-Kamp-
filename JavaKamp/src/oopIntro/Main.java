package oopIntro;

public class Main {
 
     public static void main (String[] args) {
    	 
    	  Product product1= new Product(1,"Lenova V14", 15000, "32 GB Ram");//Örnek oluþturma, referans oluþturma, intance
    	 
    	  
    	  Product product2= new Product(); 
    	  product1.id= 2;
    	  product1.name ="Lenovo V15";
    	  product1.unitPrice= 15000;
    	  product1.detail ="32 GB Ram";
    	  
    	  Product product3= new Product(); 
    	  product1.id= 3;
    	  product1.name ="HP 5";
    	  product1.unitPrice= 45656;
    	  product1.detail ="8 GB Ram";
    	 
    	  Product[] products = {product1,product2,product3};
    	  
    	  //for yazýp foreach basýnca tamamladý
    	  for (Product product : products) {
			System.out.println(product.name);
			
		}
    	  
    	  System.out.println(products.length); //listenin uzunluðunu verir. 0
    	 
    	  Category category1 =new Category();
    	  category1.id=1;
    	  category1.name = "Bilgisayar";
    	  
    	  Category category2 =new Category();
    	  category2.id=2;
    	  category2.name = "Ev/Bahçe";
    	  
    	  //metotlar
    	  ProductManager productManager = new ProductManager();
    	  productManager.addToCart(product1);
    	  productManager.addToCart(product2);//product bellek adresi kullanýlýr
     }
}
