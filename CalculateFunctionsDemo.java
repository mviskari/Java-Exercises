package basic.functional;

import java.util.stream.IntStream;

public class CalculateFunctionsDemo {

    // static final variables to define LOWER and UPPER limits
    static final int LOWER = 1, UPPER = 10;
  
    public static void main(String argv[]) {
    	
//        int i = 0, k = 0;
//        for (i = LOWER; i <= UPPER; i++) {
//            int tmp = 0;
//            for (k = LOWER; k <= UPPER; k++) {
//                tmp = k * i;
//                System.out.print(tmp + "\t");
//            }
//            System.out.println();
//        }
//    	IntStream.rangeClosed(LOWER, UPPER).forEach(s -> System.out.print(s + " "));
//    	System.out.println();
//    	IntStream.rangeClosed(LOWER, UPPER*1).forEach(y -> System.out.print(y + " "));
    	//Kuinka yhdistetään nämä kaksi erillistä forEach-iteraatiota?
    	IntStream.rangeClosed(LOWER, UPPER).forEach(x -> {
    		IntStream.range(LOWER, UPPER+1).forEach(y -> System.out.print(x*y + "\t"));
    		System.out.println();
    		
    	});
    	
    	int summa = IntStream.rangeClosed(LOWER, UPPER).sum();
    	double keskiarvo = IntStream.rangeClosed(LOWER, UPPER).average().getAsDouble();
    	System.out.println(summa + " - " + keskiarvo);
    }
}
