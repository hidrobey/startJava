package yeni;

import java.util.Scanner;

public class WhileOrnek {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// tek sayılar 1 den 100 e kadar
		/*int i=1;
		while(i<100) {
			
			if (i%2==1) {
				System.out.println(i);
			}
			i++;
		}*/
		
	
		//negatif bir değer girilene kadar kullanıcıdan yazılanları kabul eden ve 
		// yazılan tek değerleri toplayan program
        
		/*Scanner scan = new Scanner(System.in);
		int toplam=0;
		int input;
		while(true){
			System.out.print("sayı yazınız");
			input = scan.nextInt();
			if (input<0) {
				System.out.println("negatif girdi");
				break;
			}
			if(input %2==1) {
				toplam+=input;
			}
			}
		System.out.println("yazılan tek sayılar toplamı"+toplam);
	
		*/
	    
		 //girilen sayıya kadar 2 nin kuvvetleri
		  Scanner scan= new Scanner(System.in);
		  System.out.println("bir sayı yaz:");
		  int input =scan.nextInt() ;
		  int k=1;
		  while(k<=input) {
			  System.out.println(k);
			  k=k*2;
		  }
		
	}

}
