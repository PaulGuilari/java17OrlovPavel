package lesson20.hw.funckInterface;
/*
* Создайте свой функциональный интерфейс с методом double сalculate(int a, int b)
* */
@FunctionalInterface
public interface Operationable {
    double calculate(int a, int b);
}

