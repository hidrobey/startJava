package Main;

public class methods2 {

	public static void main(String[] args) {
		String mesaj = "hava güzel";
		String yeniMesaj = şehirVer();
		System.out.println(yeniMesaj);
		int sayi = topla(15, 7);
		System.out.println(sayi);
		int toplam = topla2(1,3,5);
		System.out.println(toplam);
	}

//void yaptırır.emir kipi
	public static void add() {
		System.out.println("added");
	}

	public static void delete() {
		System.out.println("deleted");

	}

	public static void update() {
		System.out.println("updated");
	}

	public static int topla(int sayi1, int sayi2) {
		return sayi1 + sayi2;
	}

	public static int topla2(int... sayilar) {
		int toplam = 0;
		for (int sayi : sayilar) {
			toplam += sayi;

		}
		return toplam;
	}

	public static String şehirVer() {
		return "ankara";
	}
}
