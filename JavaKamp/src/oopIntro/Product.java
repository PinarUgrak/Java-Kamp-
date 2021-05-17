package oopIntro;

public class Product {
	//en az 1 cons çalýþmak zorunda
	//ayný isim de olan conslarda tarife uygun olan çalýþýr sadece
	
	public Product() {//constructor
		System.out.println("Ben çalýþtým");
		
	}
	//don't repeat yourself
	public Product(int id, String name,double unitPrice, String detail) {
		this();//Parametresiz Product çalýþtýrýlýr
		this.id = id; // dýþarýda oluþturanlar ile eþitledik
		this.name = name;
		this.unitPrice = unitPrice;
		this.detail = detail;
	}
	int id;
    String name;
    double unitPrice;//birim fiyat
    String detail;//urun açýklamasý
}
