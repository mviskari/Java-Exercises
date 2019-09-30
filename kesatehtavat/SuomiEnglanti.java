package kesaharjoitukset;
import java.util.HashMap;
import java.io.*;

class WordBook{
	private String avain;
	private String arvo;
	
	WordBook() {
		this.avain=avain;
		this.arvo=arvo;
	}
	
	public void asetaAvain(String avain) {
		this.avain=avain;
	}
	public String haeArvo(String arvo) {
		return arvo;
	}

	public void put(String string, String string2) {
		// TODO Auto-generated method stub
		
	}

	public String get(String string) {
		// TODO Auto-generated method stub
		return null;
	}

	public void printAll() {
		// TODO Auto-generated method stub	
		
	}
	
}

public class SuomiEnglanti {

	public static void main(String[] args) {
		WordBook words = new WordBook();
		words.put("object", "olio");
		words.put("computer", "tietokone");
		words.put("program", "ohjelma");
		words.put("programming", "ohjelmointi");
		words.put("system", "j‰rjestelm‰");
		words.put("compiler", "k‰‰nt‰j‰");
		words.put("linker", "linkitt‰j‰");
		words.put("interpreter", "tulkki");
		words.put("byte-code", "tavukoodi");
		words.put("execute", "suorittaa");
		words.put("execute", "ajaa");

		System.out.println("object: " + words.get("object"));
		System.out.println("execute: " + words.get("execute"));

		for (int i = 0; i < 80; i++) System.out.print("*");
		System.out.println();

		words.printAll();

	}

}
