/**
 * 
 */
package kesaharjoitukset;

/**
 * @author Matti
 *
 */
class Omena {
	static double kokopaino;
	static String nimi;
	static double paino;
	
	public Omena() {}
	
	public Omena(String nimi, double paino) {
		this.nimi=nimi;
		this.paino=paino;
		
		kokopaino+=paino;
	}
	
	public static double getPaino() {
		return paino;
	}
	
	public String toString() {
		return "Korissa omenat= "+nimi +" "+paino;
	}
}

class Kori {
	private String malli;
	private Omena[] omenat;
	static int KOKO = 6; // korin maksimi koko
	private int i=0;
	private double paino=0; //omenakorin paino
	
	public Kori(String malli, String[] args, int j) {
		this.malli=malli;
		omenat = new Omena[KOKO];
		
	}
	

	public void lisaaOmena(Omena omenat) {
		// TODO Auto-generated method stub
		//System.out.println("Laskuri "+Omena.palautaPaino() + " Nimi: "+Omena.palautaNimi());
		this.omenat[i]=omenat;
		i++;
		paino=paino+omenat.getPaino();
		
		
		
	}
	
	public String toString() {
		//System.out.println("Nimi: " + nimi + "  Malli: " + malli);
		return "Kori " + malli + ". Omenien yhteispaino: " + Omena.kokopaino +"g.\n"
				+ "Omenia korissa " + Omena.nimi +", "+Omena.paino;
	
		
	}	
}
public class OmppujaKori {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		Omena omppu1 = new Omena("Aino", 120);
		Omena omppu2 = new Omena("Amorosa", 80);
		Omena omppu3 = new Omena("Ola", 420);
		Kori omenakori = new Kori("Pärekori", args, 0);
		omenakori.lisaaOmena(omppu1);
		
		omenakori.lisaaOmena(omppu2);
		
		omenakori.lisaaOmena(omppu3);
	
		omenakori.lisaaOmena(new Omena("Raike", 210));
		
		omenakori.lisaaOmena(new Omena("Valkea kuulas", 120));
		
		omenakori.lisaaOmena(new Omena("Åkero", 120));

		System.out.println(omenakori);

	}

}
