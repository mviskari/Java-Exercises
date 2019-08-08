package h8_KissaKoira;

public class h8_KissaKoiraTesti {

	public static void main(String[] args) {
		Kissa katti = new Kissa("Pegi");
		Koira musti = new Koira("Cis");
		System.out.println("Kissa: "+katti + "\n" + "Koira "+musti);
		musti.juokse("Pegi");
		katti.juokse("Cis");
	
		System.out.println("Musti jahtaa oliota Kissa: "+musti.jahtaa());
		System.out.println("Katti juoksee karkuun oliota Koira: "+katti.karkuun());

	}

}
