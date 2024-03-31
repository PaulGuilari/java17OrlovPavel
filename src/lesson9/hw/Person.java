package lesson9.hw;

public class Person {
    private String name;
    private int age;
    private int height;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        if (name.length() >= 3 || name.length() <= 15){
        this.name = name;
        }
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        if (age > 0 || age < 100) {
            this.age = age;
        }
    }

    public int getHeight() {
        return height;
    }

    public void setHeight(int height) {
        if (height > 120 || height < 220) {
            this.height = height;
        }
    }

    public void printPersonInfo() {
        System.out.println("Person: " + "\n" +
                "name: " + getName() + "\n" +
                "age: " + getAge() + "\n" +
                "height: " + getHeight());
    }
}
