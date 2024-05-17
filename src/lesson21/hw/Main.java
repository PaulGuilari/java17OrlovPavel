package lesson21.hw;

import java.util.Comparator;
import java.util.List;
import java.util.Optional;

/*
Дан список List<Integer> list
* Найти среднее значение чисел в списке, используя метод average().
* Получить новый список, состоящий из элементов исходного списка, умноженных на заданное число, используя метод map().
* Отфильтровать список строк по заданному условию и получить новый список, используя метод filter().
* Получить первый элемент списка, удовлетворяющий заданному условию, используя метод findFirst().
* Удалить из списка все дубликаты, используя метод distinct().
* Получить максимальный элемент списка, используя метод max().
* Отсортировать список в обратном порядке, используя метод sorted().
* Посчитать количество элементов в списке, удовлетворяющих заданному условию, используя метод count().
* */
public class Main {
    public static void main(String[] args) {

//            Дан список List<Integer> list
        List<Integer> list = List.of(21, -42, 57, -54, 97, -45, -74, 63);

//        Получить новый список, состоящий из элементов исходного списка, умноженных на заданное число, используя метод map()
        List<Integer> list2 = list.stream()
                .map(a -> a * 2)
                .toList();
        System.out.println(list2);

//        Найти среднее значение чисел в списке, используя метод average()
        double average = list.stream()
                .mapToDouble(a -> a)
                .average()
                .orElse(Double.NaN);
        System.out.println(average);


//        Получить максимальный элемент списка, используя метод max()
        Optional<Integer> max = list.stream()
                .max((x, y) -> Integer.compare(x, y));
        System.out.println(max);

//        Отфильтровать список строк по заданному условию и получить новый список, используя метод filter().
        List<String> listStr = List.of("Maria", "Petr", "Nikolai", "Nadejda", "Pavel", "Pavel");
        listStr.stream()
                .filter(a -> a.length() <= 5)
                .forEach(System.out::println);

//        Получить первый элемент списка, удовлетворяющий заданному условию, используя метод findFirst()
        Optional<String> first = listStr.stream()
                .filter(a -> a.length() <= 5)
                .findFirst();
        System.out.println(first);

//        Посчитать количество элементов в списке, удовлетворяющих заданному условию, используя метод count()
        long count = listStr.stream()
                .filter(a -> a.length() >= 6)
                .count();
        System.out.println(count);

//        Удалить из списка все дубликаты, используя метод distinct()
        List<String> distinct = listStr.stream()
                .distinct().toList();
        System.out.println(distinct);

//        Отсортировать список в обратном порядке, используя метод sorted()
        List<String> sort = listStr.stream()
                .sorted(Comparator.reverseOrder())
                .toList();
        System.out.println(sort);
    }
}
