package yeni;

import java.util.Scanner;

public class HavayaGöreETkinlik {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// sıcaklığı öğren
		// sıcaklık 30 dereceden yüksekse yüzme
		// 5 derece ve 30 derece arasıysa sinema
		// 5 derece den düşükse buz hokey
		Scanner scan= new Scanner(System.in);
		int sıcaklık;
		System.out.print("sıcaklık değeri yazınız:");
		sıcaklık= scan.nextInt();
		if (sıcaklık>30){
		System.out.println("bu havada havuza gidilir") ;
		}
		else if (5<=sıcaklık && sıcaklık <=30) {
			System.out.println("sinema");
		}
	    
	    
		}
}
