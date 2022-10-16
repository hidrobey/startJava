package yeni;

public class ForOrnek {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//değişken isimlendirmeleri camelCase yazılır
		System.out.println("helloworld");
        String ortaMetin= "ilginizi çekebilir";
	    String altMetin= "vade süresi";
	    System.out.println(altMetin);
	    System.out.println(ortaMetin);
	    //integer
	    int vade=12;
	    double dolarDun=18.00;
	    double dolarBugun=18.00;
	    boolean dolarDustuMu= true;
	    
	    String okYonu="";
	    if (dolarDun>dolarBugun) {//true
			okYonu="down.svg";
	    	System.out.println(okYonu);
		}  else if(dolarDun<dolarBugun) {
			okYonu="up.svg";
		}
	    		else {
			okYonu="equal.svg";
			System.out.println(okYonu);
}
	    
	    //array
String[] krediler={"hızlı kredi","Maaşını halkbanktan","mutlu emek"};



for (int i = 0; i < krediler.length; i++) {
	System.out.println(krediler[i]);
}
	}
	
}