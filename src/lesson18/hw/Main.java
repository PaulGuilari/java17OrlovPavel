package lesson18.hw;

import java.util.HashMap;
import java.util.Map;

/*
 * Создать HashMap
 * Создать HashMap, содержащий пары значений - имя игрушки (String) и
 * объект игрушки (класс Toy(weight int, String color, double price)).
 *
 * Перебрать и распечатать пары значений - entrySet().
 * Перебрать и распечатать набор из имен продуктов - keySet().
 * Перебрать и распечатать значения продуктов - values().
 * Для каждого перебора создать свой метод.
 * */
public class Main {


    public static void main(String[] args) {

        Toy toy1 = new Toy("Doll", 15, "Red", 6400.99F);
        Toy toy2 = new Toy("Lego", 4, "Green", 7500.00F);
        Toy toy3 = new Toy("PlasticFruit", 8, "Orange", 9050.65F);
        Toy toy4 = new Toy("Car", 96, "Black", 456.99F);
        Toy toy5 = new Toy("BaseballBat", 500, "Brown", 34.95F);

        HashMap<String, Toy> mapOfToys = new HashMap<>();
        mapOfToys.put(toy1.getName(), toy1);
        mapOfToys.put(toy2.getName(), toy2);
        mapOfToys.put(toy3.getName(), toy3);
        mapOfToys.put(toy4.getName(), toy4);
        mapOfToys.put(toy5.getName(), toy5);

        printKey(mapOfToys);
        printValue(mapOfToys);
        printMap(mapOfToys);
    }

    public static void printKey(HashMap<String, Toy> e) {
        for (var countKey : e.keySet()) {
            System.out.println(countKey);
        }
    }

    public static void printValue(HashMap<String, Toy> e) {
        for (var countVal : e.values()) {
            System.out.println(countVal);
        }
    }

    public static void printMap(HashMap<String, Toy> e) {
        for (Map.Entry entry : e.entrySet()) {
            System.out.println(entry.getKey());
            System.out.println(entry.getValue());
        }
    }
}
