package Main;

public class multiDimensionalArrayDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        String[][] citys=new String[3][3];
        citys[0][0]="istanbul";
        citys[0][1]="Bursa";
        citys[0][2]="bilecik";
        citys[1][0]="kırklareli";
        citys[1][1]="edirne";
        citys[1][2]="tekirdağ";
        
        for(int i=0;i<=1;i++) {
        	for(int j=0;j<=2;j++) {
        		System.out.println(citys[i][j]);
        	}
        		
        }
        
        
        
        
        
	}

}
