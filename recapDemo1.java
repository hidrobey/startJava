package Main;

public class recapDemo1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int sayi1=20;
		int sayi2=25;
		int sayi3=2;
        
		/*if (sayi1>sayi2&&sayi2>sayi3) {
			System.out.println("sayi 1 en büyüktür");
		}
		else if (sayi2>sayi1&&sayi2>sayi3){
			System.out.println("sayi 2 en büyüktür");
		}else {
			System.out.println("sayi 3 en büyüktür");
		}*/
		int enBuyuk=sayi1;
		if (enBuyuk<sayi2) {
			enBuyuk=sayi2;
		}
		if (enBuyuk<sayi3) {
			enBuyuk=sayi3;
		}
		System.out.println("en büyük:"+enBuyuk);
	}

}
