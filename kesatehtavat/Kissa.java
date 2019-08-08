/**
 * 
 */
package h8_KissaKoira;

/**
 * @author MVs, Summer of 19.
 *
 */
public class Kissa {
	private String nimi;
	private String kohde;
	
	Kissa(){}
		
	Kissa(String nimi) {
		this.nimi = nimi;
	}
	
	public String toString() {
		return nimi;
	}
	
	public void juokse(String kohde) { //setteri
		this.kohde = kohde;
	}
	
	public String karkuun() { //getteri
		return kohde;
	}
	
	

}



