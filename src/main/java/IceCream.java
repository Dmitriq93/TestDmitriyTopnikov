public class IceCream extends Candy {
    private String taste;

    public IceCream(String name, Double weight, Double price, String taste) {
        super(name, weight, price);
        this.taste = taste;
    }

    public void getInfo() {
        System.out.println("вкус = " + taste + "\nназвание = " + getName() + "\nцена = " + getPrice() + "\nвес = " + getWeight() + "\n");
    }
}
