package lesson10.hw;

public class Hamster extends Pet{

    public Hamster(String name){
        super(name);
        this.name = name;
        System.out.println("I am a hamster and my name is: " + name);
    }
    void sleep(){
        System.out.println("Hamster is sleeping");
    }
}
