package lesson20.hw.funckInterface;
/*
* Создайте свой функциональный интерфейс с методом double сalculate(int a, int b)
* Вызовите метод через лямбду
* */

public class Main {
    public static void main(String[] args) {
        Operationable operation = (a,b) -> (a*b);
        Operationable operation1 = (a,b) -> (a+b);
        Operationable operation2 = (a,b) -> ((double) a /b);
        Operationable operation3 = (a,b) -> (a-b);


        double multiply = operation.calculate(8,14);
        double add = operation1.calculate(4,7);
        double div = operation2.calculate(87,9);
        double subtraction = operation3.calculate(87,9);
        System.out.println(multiply);
        System.out.println(add);
        System.out.println(div);
        System.out.println(subtraction);
    }



}
