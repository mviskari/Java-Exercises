package basic.functional;

import java.util.function.BiFunction;


interface metodi{
	int calculate(int num1, int num2);
}


public class StaticMethodsDemoFunctional {

//    static int sum(int a, int b) {
//        return a + b;
//    }
    
    static final BiFunction<Integer, Integer, Integer> metodi = (a, b) -> a + b;
    //T,U,R
  
//    @SuppressWarnings("static-access")
    public static void main(String args[]) {
//        System.out.println(sum(10, 20));
//        System.out.println(StaticMethodsDemo.sum(11, 22));
//        {
//            StaticMethodsDemo s1 = new StaticMethodsDemo();
//            System.out.println(s1.sum(30, 40));
//            StaticMethodsDemo s2 = new StaticMethodsDemo();
//            System.out.println(s2.sum(30, 40));
//        }
        System.out.println(metodi.apply(20,10));
        metodi kerto = (num1, num2) -> num1*num2;
		System.out.println( kerto.calculate(5,3));
    }
}
