/**
 * 
 */
package kesatehtavat;

/**
 * @author Matti
 *
 */
public class Karpanen {
	private String ruoka;
	public Karpanen() {
	}
	
	public void suhisee() {
		System.out.println("K�rp�nen suhisee siivill��n.");
	}
	public void lentaa() {
		System.out.println("K�rp�nen lent��.");
	}
	public void syo(String ruoka) {
		this.ruoka=ruoka;
	}
	public String palautaRuoka() {
		return ruoka;
	}

	public static void main(String[] args) {
		Karpanen k = new Karpanen();
		k.suhisee();
		k.lentaa();
		k.syo("keitto");
		System.out.println("K�rp�nen sy� "+k.palautaRuoka());
		k.syo("juusto");
		System.out.println("K�rp�nen sy� "+k.palautaRuoka());
	
	}
}
