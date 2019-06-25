/**
 * 
 */
package kesatehtavat;

/**
 * @author MVs, June 2019
 *
 */
public class Hyttynen {
	private String kohde;
	public Hyttynen() {
	}
	public void synny() {
		System.out.println("Hyttynen syntyy");
	}
	public void lenna() {
		System.out.println("Hyttynen lent��");
	}
	public void kuole() {
		System.out.println("Hyttynen kuolee");
	}
	public void ime(String kohde) { //setKohde
		this.kohde=kohde;
	}
	public String getKohde() {
		return kohde;
	}
	
	public static void main(String[] args) {
		Hyttynen hyt = new Hyttynen();
		hyt.synny();
		hyt.lenna();
		hyt.ime("hirvi");
		System.out.println("Hyttynen imee "+hyt.getKohde());
		hyt.lenna();
		hyt.ime("ihminen");
		System.out.println("Hyttynen imee "+hyt.getKohde());
		hyt.kuole();
	}
	

}
