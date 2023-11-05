public class Lollipop extends Candy {
    private String colour;

    public Lollipop(String name, Double weight, Double price, String colour) {
        super(name, weight, price);
        this.colour = colour;
    }

    public void getInfo() {
        System.out.println("цвет = " + colour + "\nназвание = " + getName() + "\nцена = " + getPrice() + "\nвес = " + getWeight() + "\n");
    }
}
