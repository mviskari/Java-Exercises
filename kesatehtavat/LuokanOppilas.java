/**
 * 
 */
package kesaharjoitukset;

/**
 * @author Matti
 *
 */
public class LuokanOppilas {

		private static int olioLaskuri = 0; //Pit‰‰ kirjaa oliosta ohhelmassa
	
	//	private static String size;
		String nimi;
		Boolean istuu = false;
		int total;
		
		LuokanOppilas(String nimi, boolean istuu){
			this.nimi=nimi;
			this.istuu=istuu;

			olioLaskuri++; //Pit‰‰ kirjaa olioden lukum‰‰r‰st‰.
		}
		
		public String toString() {
			if(istuu==true)
				return nimi+" istuu";
			if(istuu==false)
				return nimi+" ei istu";
			return nimi;
		}
		
		public void tulosta() {
			if(istuu==true)
				System.out.println(nimi + " istuu");
			if(istuu==false)
				System.out.println(nimi + " ei istu");
		}
		
		public void setIstuu(boolean istuu) {
			this.istuu=istuu;
		}
		
		public static int oppilaitaYhteensa() {
			return olioLaskuri;
		}
			

	public static void main(String[] args) {
				
			LuokanOppilas matti = new LuokanOppilas("Matti", true);
			LuokanOppilas pekka = new LuokanOppilas("Pekka", false);
			LuokanOppilas kaarina = new LuokanOppilas("Kaarina", false);
			LuokanOppilas aino = new LuokanOppilas("Aino", false);
			LuokanOppilas annikki = new LuokanOppilas("Annikki", true);
			matti.tulosta();
			pekka.setIstuu(true);
			pekka.tulosta();
			annikki.setIstuu(false);
			aino.tulosta();
			annikki.tulosta();
			System.out.println(matti);
			System.out.println(pekka);
			System.out.println(kaarina);
			
			System.out.println("Oppilaita on yhteens‰ " + LuokanOppilas.oppilaitaYhteensa() + " kappaletta");

		}

	}


