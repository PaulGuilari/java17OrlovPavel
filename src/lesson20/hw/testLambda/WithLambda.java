package lesson20.hw.testLambda;
import java.util.*;
/*
* Создаём коллекцию Animal и при помощи метода print - выводим содержимое листа в консоль
* и реализуем лямбда выражение при помощи типа CheckTrait указанного в параметрах метода
* */

public class WithLambda {
    public static void main(String[] args) {
        List<Animal> animals = new ArrayList<>();
        animals.add(new Animal("Fish", false, true));
        animals.add(new Animal("Kangaroo", true, false));
        animals.add(new Animal("Rabbit", true, false));
        animals.add(new Animal("Turtle", false, true));

        print(animals, a -> a.canHop());
    }


    private static void print(List<Animal> animals, CheckTrait checker) {
        for (Animal animal : animals) {
            if (checker.test(animal)) {
                System.out.print(animal + " ");
            }
            System.out.println();
        }
    }
}
