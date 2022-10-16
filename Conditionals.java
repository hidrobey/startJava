package Main;

public class Conditionals {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int sayi=25; 
		if(sayi<20) {
			System.out.println("sayı 20'den küçük");
		}
        if(sayi<15) {
        	System.out.println("sayı 15'ten küçük");
        }
        else if(sayi==20){
        	System.out.println("sayı 20'ye eşit");
        }
        else {
        	System.out.println("bu program konsola sonuç vermek zorundadır");
        }
	}

}
