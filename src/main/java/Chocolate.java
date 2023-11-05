public class Chocolate extends Candy {
    private int calories;

    public Chocolate(String name, Double weight, Double price, int calories) {
        super(name, weight, price);
        this.calories = calories;
    }

    public void getInfo() {
        System.out.println("калории = " + calories + "\nназвание = " + getName() + "\nцена = " + getPrice() + "\nвес = " + getWeight() + "\n");
    }
}
