package Main;

public class stringsDemo {

	public static void main(String[] args) {
		String mesaj = "Hava Güzel";
		System.out.println(mesaj);

		/*System.out.println("eleman sayısı:" + mesaj.length());
		System.out.println("4.eleman:" + mesaj.charAt(3));
		System.out.println(mesaj.concat(" mükemmel!"));
		System.out.println(mesaj.startsWith("a"));
        System.out.println(mesaj.endsWith("l"));
        char[]karakterler=new char[4];
        mesaj.getChars( 0, 4,karakterler,0);
        System.out.println(karakterler);
        System.out.println(mesaj.indexOf("av"));
        System.out.println(mesaj.lastIndexOf('e'));
        System.out.println(mesaj.lastIndexOf('a'));*/

	System.out.println(mesaj.replace(' ','-'));
	String yeniMesaj=mesaj.replace(' ','-');
	System.out.println(yeniMesaj);
	System.out.println(mesaj.substring(5,8));
	
	
	for(String kelime:mesaj.split(" ") ) {
		System.out.println(kelime);
		
		System.out.println(mesaj.toLowerCase());
		System.out.println(mesaj.toUpperCase());
		System.out.println(mesaj.trim());
	}
	
	}

}
