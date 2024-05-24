package lesson23.hw;

import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.stream.Collectors;

/*
 *
 * Создать список из нескольких экземпляров класса Employee.
 * С помощью метода groupBy создать мапу, где ключом будет department, а значением -
 * список сотрудников из данного департамента.
 * Использовать метод partitioningBy, чтобы разделить список сотрудников на две части: одна -
 * сотрудники с зарплатой выше среднего, другая - сотрудники с зарплатой ниже или равной средней.
 * Использовать метод joining, чтобы получить строку со списком всех департаментов через запятую
 * */
public class Test {
    public static void main(String[] args) {
//        Создать список из нескольких экземпляров класса Employee.
        List<Employee> employeeList = List.of(new Employee("Sales Manager", "Sales Department", 800),
                new Employee("Accountant", "Finance Department", 1100),
                new Employee("Head of Sales Department", "Sales Department", 1500),
                new Employee("Chief Accountant", "Finance Department", 1500),
                new Employee("Assistant Manager", "Sales Department", 1300),
                new Employee("Assistant Manager", "Finance Department", 1300));

//            С помощью метода groupBy создать мапу, где ключом будет department, а значением -
//            список сотрудников из данного департамента.
        Map<String, Set<String>> collect = employeeList.stream()
                .collect(Collectors.groupingBy(Employee::getDepartment,
                        Collectors.mapping(Employee::getName,
                                Collectors.toSet())));

//            С помощью метода groupBy создать мапу, где ключом будет department, а значением -
//            список сотрудников из данного департамента с использованием joining().
        Map<String, String> collect2 = employeeList.stream()
                .collect(Collectors.groupingBy(Employee::getDepartment,
                        Collectors.mapping(Employee::getName,
                                Collectors.joining(", "))));

        System.out.println(collect);
        System.out.println(collect2);

//        Использовать метод partitioningBy, чтобы разделить список сотрудников на две части: одна -
//        сотрудники с зарплатой выше среднего, другая - сотрудники с зарплатой ниже или равной средней.
        double average = employeeList.stream()
                .mapToDouble(Employee::getSalary)
                .average()
                .orElse(Double.NaN);

        Map<Boolean, List<Employee>> collect3 = employeeList.stream()
                .collect(Collectors.partitioningBy(a -> a.getSalary() <= average));
        System.out.println(collect3);

//        Использовать метод joining, чтобы получить строку со списком всех департаментов через запятую
        String collect4 = employeeList.stream()
                .map(Employee::getDepartment)
                .distinct()
                .collect(Collectors.joining(", "));

        System.out.println(collect4);
    }

}
