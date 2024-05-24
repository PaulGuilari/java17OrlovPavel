package lesson23.hw;

/*
 * Создать класс Employee со следующими полями: name (строка), department (строка), salary (число).
 * */
public class Employee {
    private String name;
    private String department;
    private int salary;

    public Employee(String name, String department, int salary) {
        this.name = name;
        this.department = department;
        this.salary = salary;
    }

    public String getName() {
        return name;
    }

    public String getDepartment() {
        return department;
    }

    public int getSalary() {
        return salary;
    }

    @Override
    public String toString() {
        return "Employee: " + "\n" +
                "name: " + name + "\n" +
                "department: " + department + "\n" +
                "salary: " + salary + "\n";
    }
}
