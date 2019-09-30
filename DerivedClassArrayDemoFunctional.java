package basic.functional;

import base.Person;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Predicate;

import base.Worker;
import java.util.ArrayList;

public class DerivedClassArrayDemoFunctional {

    public static void main(String[] args) {
        Person bill = new Person("A321", "Bill");
        Worker steven = new Worker("B123", "Steven", 40, 25);
        Worker billInWork = new Worker(bill.getId(),bill.getName(), 19.95,30);
        
        List<Person> persons = List.of(bill, steven, billInWork);
        
        ArrayList<Person> newPersons = new ArrayList<>(persons);
        newPersons.add(new Person("A357", "Jill"));
        newPersons.add(new Person("A789", "Jane"));
        
        
        System.out.println("Printing all persons from ArrayList:");
        newPersons.stream().forEach(System.out::println);
        
        System.out.println("Printing starts with J");
        newPersons.stream().filter(p -> p.getName().startsWith("J")).forEach(System.out::println);
        
        System.out.println("Starting with B");
        Predicate<Person> startsB = p -> p.getName().startsWith("B");
        newPersons.stream().filter(p -> p.getName().startsWith("J")).forEach(System.out::println);
        
//        for (Person p : persons) {
//            System.out.println(p);
//        }
        
        System.out.println(Double.NEGATIVE_INFINITY);
    }
}
