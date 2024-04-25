package lesson15.hw;

import java.util.ArrayList;
import java.util.List;

/*
 * В главном классе создать 5 объектов класса Car
 * Создать ArrayList и использовать методы: add(), addAll(), set(), indexOf(), size(),
 * contains(), get(), remove(), lastIndexOf(), isEmpty(), clear() для этих объектов.
 * */
public class Main {
    public static void main(String[] args) {

        // Create an objects of Car type
        Car car1 = new Car("Mitsubishi", 15, "Red", new Owner("Bruce", 45, 25));
        Car car2 = new Car("Porche", 1, "Black", new Owner("Chuc", 35, 17));
        Car car3 = new Car("Volga", 35, "Grey", new Owner("Valera", 56, 44));
        Car car4 = new Car("Pagani", 7, "Blue", new Owner("Alberto", 70, 50));
        Car car5 = new Car("Tesla", 10, "Green", new Owner("Elon", 52, 30));

        List<Car> carList = new ArrayList<>(); //create an ArrayList of Car type objects
        // add a Car object
        carList.add(car1);
        carList.add(car2);
        carList.add(car3);
        carList.add(car4);
        carList.add(car5);
//        System.out.println(carList);

        List<Car> carList2 = new ArrayList<>();
        carList2.addAll(carList); // add a carList in carList2
//        System.out.println(carList2);

        carList2.set(0, car2);       // placed an object into a List at the specified position using an index,
        // the object that was stored under this index was removed
//        System.out.println(carList2);
//        System.out.println(carList2.indexOf(car2)); // retrieve the index of the specified element (return int)

        System.out.println(carList2.size()); // the contained number of elements (return int)

        System.out.println(carList2.contains(car4)); // determines whether the List contains the specified object
        // (return boolean)

        System.out.println(carList2.get(4)); // returns the object at the specified index

        carList2.remove(car3); // delete an element at the specified index
        System.out.println(carList2);

        System.out.println(carList2.lastIndexOf(car2)); // return the index of the specified element from the end of the list (return int)


        System.out.println(carList2.isEmpty()); // check if the list is not empty (return boolean)

        carList2.clear(); // removes all elements from the list

    }
}
