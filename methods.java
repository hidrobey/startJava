package Main;

public class methods {

	public static void main(String[] args) {
		sayıBulmaca();
		sayıBulmaca();
		sayıBulmaca();
		sayıBulmaca();

	}

	// camelCase
	public static void sayıBulmaca() {

		int[] sayilar = new int[] { 1, 2, 3, 4, 5, 7, 8, 9 };
		int aranacak = 6;

		boolean varMi = false;

		for (int sayi : sayilar) {
			if (sayi == aranacak) {
				varMi = true;
				break;

			}
		}
		
		if (varMi) {
			String mesaj = "sayı mevcuttur:"+aranacak;
			mesajVer(mesaj);
		} else {
			mesajVer("sayı mevcut değildir:" + aranacak);
		}
	}

	public static void mesajVer(String mesaj) {
		System.out.println(mesaj);
	}
}
