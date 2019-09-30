/**
 * 
 */
package kesaharjoitukset;

/**
 * @author Matti
 *
 */
public class Matkustaja {
	private String nimi; // Matkustajan nimi
	private double paikanHinta; // Matkustajan ostaman Paikan hinta 
	private String kohde; // Minne matkustaja matkustaa
	
	public Matkustaja(){}
	
	public Matkustaja(String nimi,  String kohde, double paikanHinta) {
		this.nimi=nimi;
		this.paikanHinta=paikanHinta;
		this.kohde=kohde;
	}
	
	public void setNimi(String nimi) {
		this.nimi=nimi;
	}
	public String getNimi() {
		return nimi;
	}
	
	public void setPaikanHinta(double paikanHinta) {
		this.paikanHinta=paikanHinta;
	}
	public double getPaikanHinta() {
		return paikanHinta;
	}
	
	public void setKohde(String kohde) {	
		this.kohde=kohde;
	}
	public String getKohde() { 
		return kohde;
	}
	
	public String toString() {
		//Pekka matkustaa paikkaan Tampere hintaan 35.5 euroa.
		return nimi+" matkustaa paikkaan "+kohde+" hintaan "+paikanHinta+" euroa.";
	}
}
	


