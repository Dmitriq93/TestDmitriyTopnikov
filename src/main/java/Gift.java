import java.text.DecimalFormat;
import java.util.Arrays;

public class Gift {
    public static void getGift() {
        Lollipop lollipop = new Lollipop("конфета", 12.31, 43.12, "зелёный");
        Chocolate chocolate = new Chocolate("Алёнка", 15.12, 63.14, 150);
        IceCream iceCream = new IceCream("Вологоша", 11.21, 17.13, "кислый");
        String allWeight = new DecimalFormat("#0.00").format(lollipop.getWeight() + chocolate.getWeight() + iceCream.getWeight());
        String allPrice = new DecimalFormat("#0.00").format(lollipop.getPrice() + chocolate.getPrice() + iceCream.getPrice());
        System.out.println("информация о подарке:\n" + "общая цена = " + allPrice + "\nобщий вес = " + allWeight + "\n");
        lollipop.getInfo();
        chocolate.getInfo();
        iceCream.getInfo();
    }
}



