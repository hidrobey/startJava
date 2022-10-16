package yeni;

import java.util.Scanner;

public class Login {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		String k_adi ,parola ;
		System.out.print("kullanıcı adı yazınız:");
		k_adi = scan.nextLine();
		System.out.print("şifrenizi yazınız:");
		parola = scan.nextLine();
	    
	    if(k_adi.equals("java") && parola.equals("123")) {
	    	System.out.println("başarılı giriş");
	    }
	    else {
	    	System.out.println("kulanıcı adınız veya parola yanlış");
	    	
	    }
	}       
}
