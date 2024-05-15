package lesson20.hw.funckInterface;
/*
 * Вызовите метод через лямбду
 * */

public class Main {
    public static void main(String[] args) {
        Operationable operation = (a, b) -> (a * b);
        Operationable operation1 = (a, b) -> (a + b);
        Operationable operation2 = (a, b) -> ((double) a / b);
        Operationable operation3 = (a, b) -> (a - b);

        System.out.println(operation.calculate(8, 14));
        System.out.println(operation1.calculate(4, 7));
        System.out.println(operation2.calculate(87, 9));
        System.out.println(operation3.calculate(87, 9));
    }

}
