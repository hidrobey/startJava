package Main;

public class switchDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		char grade = 'B';
		switch (grade) {
		case 'A':
			System.out.println("mükemmel:geçtiniz");
			break;
		case 'B':
		case 'C':
			System.out.println("iyi:geçtiniz");
			break;
		case 'D':
			System.out.println("fena deil:geçtiniz");
			break;
		case 'F':
			System.out.println("kaldınız");
			break;
		default:
			System.out.println("geçersiz not girdiniz");
		}

	}

}
