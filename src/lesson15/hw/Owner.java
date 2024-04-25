package lesson15.hw;

/*
 * Для поля owner создать класс Owner, который будет содержать поля: name, age, experienceAge.
 * */
public class Owner {
    private final String name;
    private final int age;
    private final int experienceAge;

    public Owner(String name, int age, int experienceAge) {
        this.name = name;
        this.age = age;
        this.experienceAge = experienceAge;
    }

    public String getName() {
        return name;
    }

    @Override
    public String toString() {
        return "\n" +
                "name: " + name + "\n" +
                "age: " + age + "\n" +
                "experienceAge: " + experienceAge + "\n" +
                "-----------" + "\n";
    }
}
