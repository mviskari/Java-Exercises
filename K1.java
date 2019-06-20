/**
 * 
 */
package kesatehtavat;

import java.util.Scanner;

/**
 * @author MVs 2019
 *
 */
public class K1 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		
		Scanner skanneri = new Scanner(System.in);
		double kulutus;
		double hinta;
		double matka;
		String lopetus;
		
		do {
				System.out.println("Anna kulutus: ");	
				kulutus=skanneri.nextDouble();
				System.out.println("Anna hinta: ");	
				hinta=skanneri.nextDouble();
				System.out.println("Anna ajettu matka: ");	
				matka=skanneri.nextDouble();
				
				System.out.printf("Bensan kulutus on %.2f litraa." , kulutus*matka/100);
				
				
				System.out.printf("Matkalle tulee hintaa %.2f euroa.", hinta*kulutus*matka/100);
				
				System.out.println("Haluatko jatkaa (k = jatko, e = lopetus)?  ");
				lopetus=skanneri.next();
				if(lopetus.equalsIgnoreCase("e")) {
					break;
				}
				
			}while(true);

	}

}
