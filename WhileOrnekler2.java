package yeni;

import java.util.Scanner;

public class WhileOrnekler2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//faktöriyel
		Scanner scan=new Scanner(System.in);
		System.out.println("faktöriyeli bul");
		int f = scan.nextInt();
		int sonuc=1;
		while(f>0) {
			sonuc*=f;
			f--;
			
		}
		 System.out.println(sonuc);
		 
	}

}
