/**
 * 
 */
package kesatehtavat;

/**
 * @author MVs 2019
 *
 * Bensa Tankki-luokka
 */
public class K2_BensaTankki {
	int tilavuus;
	double bensanMaara;
	
	K2_BensaTankki(int tilavuus, double bensanMaara) {
		this.tilavuus=tilavuus;
		this.bensanMaara = bensanMaara;
	}
	
	public String toString() {
		return "Bensatankin tilavuus on " + tilavuus + " litaa, ja siellä on " + bensanMaara + " litraa bensaa";
	}
}
