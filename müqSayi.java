package Main;

public class müqSayi {

	public static void main(String[] args) {
		 //6-->1,2,3
		//28-->1,2,4,7,14
		
		int total=0;
		int number=6;
		for(int i=1;i<number;i++) {
			if (number%i==0) {
				total= total+i;
			
			if (total==number) {
				System.out.println(number+":müq sayı");
			}}
		}
		
	}

}
