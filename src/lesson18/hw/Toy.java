package lesson18.hw;

public class Toy {
    private String name;
    private int weight;
    private String color;
    private float price;

    public Toy(String name, int weight, String color, float price) {
        this.name = name;
        this.weight = weight;
        this.color = color;
        this.price = price;
    }

    public String getName() {
        return name;
    }

    public int getWeight() {
        return weight;
    }

    public String getColor() {
        return color;
    }

    public float getPrice() {
        return price;
    }

    @Override
    public String toString() {
        return "Toy {" + "\n" +
                " name: '" + name + '\'' + "\n" +
                " weight: " + weight + " gr" + "\n" +
                " color: " + color + "\n" +
                " price: " + price + " USD" +
                '}';
    }
}
