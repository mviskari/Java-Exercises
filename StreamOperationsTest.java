package basic.functional;

import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;


public class StreamOperationsTest {
	
	private static void modifyList(List<Integer> ilist) {
//		long count = ilist.parallelStream().filter(i -> i>=100).count();
//		System.out.println("Löytyi >= 100: " + count);
//		
		List<Integer> newList = ilist.stream()
				.filter(i -> i < 100)
				.sorted(Comparator.reverseOrder())
				.collect(Collectors.toList());
		System.out.println(newList);
		
		
	}

	private static void modifyStrList(List<String> strList) {
		List<String> newList = strList.stream()
				.filter(s -> s.length()>0)
				.filter(s -> s.startsWith("A"))
				.collect(Collectors.toList());
			System.out.println(newList);
		
		List<String> newList2 = strList.stream()
				.filter(s -> s.length()>0)
				.filter(s -> s.toUpperCase().startsWith("C"))
				.collect(Collectors.toList());
			System.out.println(newList2);
	    //Kaikki merkkijonon merkit isoksi
		List<String> ucList = strList.stream().map(s -> s.toUpperCase())
				.collect(Collectors.toList());
		System.out.println(ucList);
		//Muunnetaan merkkijolista listaksi, jossa jokaisen merkkijonon pituus
		List<Integer> lenList = strList.stream().map(s -> s.length())
				.collect(Collectors.toList());
		System.out.println(lenList);
		//Lasketaan kaikkien merkkien summa
				int lkm = lenList.stream().mapToInt(i -> i).sum();
		System.out.println("Lkm yhteensä: "+lkm);
					
		
	}

	public static void main(String[] args) {
		List<Integer> ilist = List.of(19,20,30,100,200,50,10,15,20);
		List<String> strList = List.of("A","B","C","d","dee","cee","bee","Aaaa");
		ilist.forEach(s->System.out.print(s+" ")); System.out.println();
		strList.forEach(System.out::print); System.out.println();
		
		modifyList(ilist);
		modifyStrList(strList);

	}

	

}
