package Main;

public class classes {
	/*{
			
			Dortİslem dortİslem=new Dortİslem();
			int sonuc=dortİslem.Bolme(20, 5);
			System.out.println(sonuc);
		}*/
	
	
	public static void main(String[] args) {
	
	Product product=new Product();
	product.name = "Laptop";
	product.id=1;
	product.description="Asus Laptop";
	product.price=5000;
	product.stockAmount=3;
	
	ProductManager productManager=new ProductManager();
	productManager.Add(product);
	
	
}

}