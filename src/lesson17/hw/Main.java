package lesson17.hw;

import java.util.LinkedList;
import java.util.PriorityQueue;
import java.util.Queue;
import java.util.Stack;

/*
 * Содать объект класса Stack типа String. Добавить в него 5 значений. Каждое значение вывести и удалить.
 * Содать объект класса LinkedList интерфейса Queue типа String. Добавить в него 5 значений. Каждое
 * значение вывести и удалить без выброса исключения.
 *
 * Создать объект класса PriorityQueue интерфейса Queue типа String.
 * Добавить в него 5 значений. Каждое значение По Приоритету вывести и удалить.
 * */
public class Main {

    public static void main(String[] args) {
        Stack<String> stack = new Stack<>();
        stack.add("Lena");
        stack.add("Kolea");
        stack.add("Petea");
        stack.add("Galea");
        stack.add("Yura");

//        System.out.println(stack.push("Liza"));
//        System.out.println(stack);
//        System.out.println(stack.pop());
//        System.out.println(stack.peek());
//        System.out.println(stack.pop());
//        System.out.println(stack.pop());
//        System.out.println(stack.pop());
//        System.out.println(stack.pop());
//        System.out.println(stack.pop());
//        System.out.println(stack);

        Queue<String> queue = new LinkedList<>();
        queue.add("Alexey");
        queue.add("Angelina");
        queue.add("Vladimir");
        queue.add("Maria");
        queue.add("Mihail");

//        System.out.println(queue);
//        System.out.println(queue.poll());
//        System.out.println(queue.poll());
//        System.out.println(queue.poll());
//        System.out.println(queue.poll());
//        System.out.println(queue.poll());
//        System.out.println(queue.poll());
//        System.out.println(queue);

        Queue<Car> carQueue = new PriorityQueue<>();
        carQueue.add(new Car("Porsche", 12));
        carQueue.add(new Car("Ferrari", 5));
        carQueue.add(new Car("Dodge", 10));
        carQueue.add(new Car("BMW", 30));
        carQueue.add(new Car("Volkswagen", 50));
        System.out.println(carQueue);

        Queue<String> stringQueue = new PriorityQueue<>();
        stringQueue.offer("Banana");
        stringQueue.offer("Pineapple");
        stringQueue.offer("Pear");
        stringQueue.offer("Cherry");
        stringQueue.offer("Orange");
        stringQueue.offer("Apple");

        System.out.println(stringQueue.poll());
        System.out.println(stringQueue.poll());
        System.out.println(stringQueue.poll());
        System.out.println(stringQueue.poll());
        System.out.println(stringQueue.poll());
        System.out.println(stringQueue.poll());
        System.out.println(stringQueue);

    }
}
