package Main;

public class CustomerManager2 {

	public static void main(String[] args) {
        //reference type
		//stack,heap
		CustomerManager customerManager= new CustomerManager();
		CustomerManager customManager2= new CustomerManager();
		customerManager= customManager2;
		customerManager.Add();
		customerManager.Remove();
		customerManager.Update();
		
		//int value type
		int sayi1=10;
		int sayi2=20;
		sayi2=sayi1;
		sayi1=30;
		System.out.println(sayi2);
		 
	    //array,reference type
		int[]sayilar1 =new int[] {1,2,3};
		int[]sayilar2 =new int[] {4,5,6};
		sayilar2=sayilar1;
		sayilar1[0]=10;
		System.out.println(sayilar2[0]);
	}

}
