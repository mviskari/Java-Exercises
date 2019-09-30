/**
 * 
 */
package kesaharjoitukset;

import java.util.Arrays;
import java.util.ArrayList;
import java.util.List;

/**
 * @author MVs, 2019-07-15
 *
 */
public class TietovisaTaulu {

	static final String kysymykset[][] = new String[5][4];
		
	public static void tulostaKysymykset() { 
		// tulostaa kysymykset ja oikeat vastaukset
	
		for(int i = 0; i < kysymykset.length; i++)
		{
			//System.out.println("Len "+kysymykset[i].length);
		    for(int j = 0; j < kysymykset[i].length; j++)
		    {
		    	//System.out.println("LenJ "+kysymykset[j].length);
		        System.out.println(kysymykset[i][j]);
		        if(j<2 && kysymykset[j] != null || ( i==3 && j<3))//j<kysymykset[i].length - 1 && kysymykset[j]!=null) 
		        	System.out.print("..... ");
		    
		    }
		    System.out.print("..... Oikea vastaus ");
		    if(i==0) 
		    	System.out.println("1...Java SE");
		    if(i==1) 
		    	System.out.println("2...Java SE 12");
		    if(i==2) 
		    	System.out.println("2...Sun");
		    if(i==3) 
		    	System.out.println("1...Moon");
		    if(i==4) 
		    	System.out.println("2...Oracle");
		}
		
	}
	
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		kysymykset[0][0] = "Javan yritysversio?";
		kysymykset[0][1] = "1)Java SE";
		kysymykset[0][2] = "2)Java EE";
		//kysymykset[0][3] = "";
		kysymykset[1][0] = "Uusin Java versio?";
		kysymykset[1][1] = "1)Java SE 8";
		kysymykset[1][2] = "2)Java SE 12";
		//kysymykset[1][3] = "";
		kysymykset[2][0] = "Kuuluisa IDE?";
		kysymykset[2][1] = "1)Eclipse";
		kysymykset[2][2] = "2)Sun";
		//kysymykset[2][3] = "";
		kysymykset[3][0] = "Javan kehitti alunperin?";
		kysymykset[3][1] = "1)Moon";
		kysymykset[3][2] = "2)Sun";
		kysymykset[3][3] = "3)Star";
		kysymykset[4][0] = "Javasta vastaa nykyisin?";
		kysymykset[4][1] = "1)IBM";
		kysymykset[4][2] = "2)Oracle";
		//kysymykset[4][3] = "";
		tulostaKysymykset();

	}

}
