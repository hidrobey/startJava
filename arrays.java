package Main;

public class arrays {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String ogrenci1 = "Engin";
		String ogrenci2 = "Derin";
		String ogrenci3 = "Salih";
		String ogrenci4 = "Selim";

		System.out.println(ogrenci1);
		System.out.println(ogrenci2);
		System.out.println(ogrenci3);
		System.out.println(ogrenci4);
		
		System.out.println("---------");
		
		String[] ogrenciler= new String[4];
		ogrenciler[0]="Engin";
		ogrenciler[1]="Derin";
		ogrenciler[2]="Salih";
		ogrenciler[3]="Selim";
		//ogrenciler[4]="Ali";
		for(int i=0;i<ogrenciler.length;i++) {
			System.out.println(ogrenciler[i]);
		}
		
		System.out.println("---------");
		
		for(String ogrenci: ogrenciler) {
			System.out.println(ogrenci);
		}
	}
	}


