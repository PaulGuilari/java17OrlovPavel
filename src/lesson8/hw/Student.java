package lesson8.hw;

public class Student {
    String name;
    int age;
    double averageValue;
    public Student() {
    }
    public Student(String name, int age, double averageValue) {
        this.name = name;
        this.age = age;
        this.averageValue = averageValue;
    }
    public String printStudentInfo() {
        return "Student{" +
                "name='" + name + '\'' +
                ", age=" + age +
                ", evmark=" + averageValue +
                '}';
    }
    public boolean checkMark(){
        return averageValue > 5.0;
    }
}
