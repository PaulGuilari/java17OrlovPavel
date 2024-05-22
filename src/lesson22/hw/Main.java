package lesson22.hw;
/*
 * Написать пару примеров Stream API:
 * 1 Для терминальных операций используя библиотеку Collectors(joining, groupingBy, partitioningBy... )
 * 2 Для промежуточных операций используем(takeWhile, dropWhile, peek... )
 * */

import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.stream.Collectors;

public class Main {
    public static void main(String[] args) {
        List<Human> humanList = List.of(
                new Human(Months.JAN, "Alexey"),
                new Human(Months.JAN, "Alexey"),
                new Human(Months.FEB, "Gavr"),
                new Human(Months.JUL, "Pavel"),
                new Human(Months.JUN, "Olga"),
                new Human(Months.JAN, "Victoria"),
                new Human(Months.MAY, "Alexandr"),
                new Human(Months.JUL, "Daria"));


        String joinName = humanList.stream()
                .map(Human::getName)
                .collect(Collectors.joining(", "));
        System.out.println("Имена объектов списка humanList: " + joinName);

        String joinMonths = humanList.stream()
                .map(human -> human.getMonths().getName())
                .collect(Collectors.joining(", "));
        System.out.println("Месяцы из списка humanList: " + joinMonths);

        Map<Months, List<Human>> humanGroup = humanList.stream()
                .collect(Collectors.groupingBy(Human::getMonths));
        System.out.println("Сортировка humanList по месяцам: " + humanGroup);

        Map<Boolean, List<Human>> humanGroup2 = humanList.stream()
                .collect(Collectors.partitioningBy(a -> a.getMonths() == Months.FEB));
        System.out.println("Сортировка humanList по февралю месяцу : " + humanGroup2);

        Set<Human> collect = humanList.stream()
                .collect(Collectors.toSet());
        System.out.println("используем метод Collectors.toSet для удаления дубликатов" + collect);

        humanList.stream()
                .dropWhile(human -> human.getMonths().getName().equals("July"))
                .forEach(System.out::println);

        humanList.stream()
                .takeWhile(human -> human.getMonths().getName().equals("February"))
                .forEach(System.out::println);

        List<String> nameList = humanList.stream()
//               метод peek позволяет произвести промежуточный контроль и вывести необходимые данные
//               не влияя на поток
                .peek(human -> System.out.println(human.getName() + " " + human.getMonths().getName()))
                .filter(human -> human.getMonths().getName().equalsIgnoreCase("july"))
                .map(Human::getName)
                .toList();
        System.out.println("Выводим список имён отсортированных по июлю месяцу " + nameList);

    }
}
