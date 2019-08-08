/**
 * 
 */
package h8_KissaKoira;

/**
 * @author Matti
 *
 */
public class Koira {
	private String nimi;
	private String kohde;
	
	Koira() {}
	
	Koira(String nimi) {
		this.nimi = nimi;
	}
	
	public String toString() {
		return nimi;
	}
	
	public void juokse(String kohde) {
		this.kohde = kohde;
	}
	
	public String jahtaa() {
		return kohde;
	}
	

}
