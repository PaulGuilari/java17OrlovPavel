package lesson20.hw.testLambda;
import java.util.*;
/*
* Создаём коллекцию Animal и при помощи метода print - выводим содержимое листа в консоль
* При помощи анонимного класса checkIfHopper реализуем test а в нём canHop
* */

public class WithoutLambda {
    public static void main(String[] args) {
        List<Animal> animals = new ArrayList<>();
        animals.add(new Animal("Fish", false, true));
        animals.add(new Animal("Kangaroo", true, false));
        animals.add(new Animal("Rabbit", true, false ));
        animals.add(new Animal("Turtle", false, true));
        CheckTrait checkIfHopper = new CheckTrait() {
            @Override
            public boolean test (Animal a){
                return a.canHop();
            }
        };

        print(animals,checkIfHopper);
    }

    private static void print(List<Animal>animals, CheckTrait checker){
        for (Animal animal: animals){
            if (!checker.test(animal)){
                System.out.println(animal + " ");
            }
        }
    }
}
