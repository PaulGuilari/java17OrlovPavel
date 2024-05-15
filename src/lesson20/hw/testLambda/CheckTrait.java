package lesson20.hw.testLambda;
/*
* Создать функциональный интерфейс с абстрактным методом
* */

import lesson20.hw.testLambda.Animal;
@FunctionalInterface
public interface CheckTrait {
    boolean test(Animal a);
}
