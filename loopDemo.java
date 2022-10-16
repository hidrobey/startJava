package Main;

public class loopDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// For
		for (int i = 0; i < 10; i += 2) {
			System.out.println(i);
		}
		System.out.println("For Döngüsü bitti");

		// While
		int i = 0;
		while (i < 10) {
			System.out.println(i);
			i += 2;
		}
		System.out.println("While Döngüsü bitti");

		int j = 100;
		// Do-While
		do {
			System.out.println(j);
			j += 2;
		} while (j < 10);
		System.out.println("Do-While döngüsüü bitti");
	}

}
