/**
 * 
 */
package kesatehtavat;

/**
 * @author MVs, 2019
 *
 */
public class MuunnaHeksaluvuksi {
	//Luokan metodi palauttaa kokonailukua vastaavan keksaluvun.
	public static String toHex(int decimal){    
	    int rem;  
	    String hex="";   
	    char hexchars[]={'0','1','2','3','4','5','6','7','8','9','A','B','C','D','E','F'};  
//	    while(decimal>0)  
//	     {  
	       rem=decimal%16;   
	       hex=hexchars[rem]+hex;   
	       decimal=decimal/16;  
//	     }  
	    return hex;  
	}    
//}


public static void main(String args[]){      

    System.out.println(toHex(11) + "," + toHex(257));
    
    System.out.println(Integer.toBinaryString(255) + "," +Integer.toBinaryString(256));
    
    System.out.println(Integer.toOctalString(255)+","+Integer.toOctalString(256)); 
    
    System.out.println("Modulus  " + 256%16);
}}     
