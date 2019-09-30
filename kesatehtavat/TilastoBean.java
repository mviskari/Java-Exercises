/**
 * 
 */
package kesaharjoitukset;

//import java.util.Arrays;
//import java.util.Collections;
//import java.util.List;

/**
 * @author Matti
 *
 */
public class TilastoBean {
	private double luvut[];
	private String[] mjono;
	double luku, summa, keskiarvo;
	int koko;
	
	TilastoBean(){
	}
	
	public void setLukuMerkkijono(String mjono) {
		this.mjono=mjono.split(",");
		
	}
	public double getLuku(int i) {
		return Double.parseDouble(mjono[i]);
	}
	
	public int getKoko() {
		return mjono.length;
		
	}
	
	public double getSumma() {
		summa=0;
		int i=0;
		while(i < mjono.length) {
			summa=summa+Double.parseDouble(mjono[i]);
			i++;
		}
		return summa;
	}
	public double getKeskiarvo() {
		summa=0;
		int i=0;
		while(i < mjono.length) {
			summa=summa+Double.parseDouble(mjono[i]);
			i++;
		}
		return (summa/mjono.length);
	}
	
	public String toString() {
		return " Ja..";
	}
	
	public static void main(String[] args) {
		TilastoBean sb = new TilastoBean();
		sb.setLukuMerkkijono("400,500,600,700,800,900,1000,1100,1200");
		//System.out.println(setLukuMerkkijono(3));
		System.out.println(sb.getLuku(0));
		System.out.println(sb.getLuku(1));
		System.out.println(sb.getLuku(2));
		System.out.println(sb.getKoko());

		System.out.println("Summa=" + sb.getSumma());
		System.out.println("Keskiarvo=" + sb.getKeskiarvo());
		
		System.out.println(sb);
	}
}
