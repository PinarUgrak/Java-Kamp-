package oopIntro;

public class Product {
	//en az 1 cons �al��mak zorunda
	//ayn� isim de olan conslarda tarife uygun olan �al���r sadece
	
	public Product() {//constructor
		System.out.println("Ben �al��t�m");
		
	}
	//don't repeat yourself
	public Product(int id, String name,double unitPrice, String detail) {
		this();//Parametresiz Product �al��t�r�l�r
		this.id = id; // d��ar�da olu�turanlar ile e�itledik
		this.name = name;
		this.unitPrice = unitPrice;
		this.detail = detail;
	}
	int id;
    String name;
    double unitPrice;//birim fiyat
    String detail;//urun a��klamas�
}
