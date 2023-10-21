import java.util.Arrays;

public class Gift {
    public static void getGift() {
        Candy candy1 = new Candy("леденец", 10.0, 140.0);
        candy1.setColour("Whit");
        Candy candy2 = new Candy("каравай", 11.0, 130.0);
        candy2.setColour("Black");
        Candy candy3 = new Candy("вафля", 12.0, 120.0);
        candy3.setColour("Green");
        Candy candy4 = new Candy("сухарь", 13.0, 110.0);
        candy4.setColour("Yellow");

        System.out.println("информация о сладостях\n");
        System.out.println(candy1.getInfo());
        System.out.println(candy2.getInfo());
        System.out.println(candy3.getInfo());
        System.out.println(candy4.getInfo());

        System.out.println("вес подарка = " + total(
                candy1.getWeight(),
                candy2.getWeight(),
                candy3.getWeight(),
                candy4.getWeight()

        ) + " грамм");
        System.out.println("цена подарка = " + total(
                candy1.getPrice(),
                candy2.getPrice(),
                candy3.getPrice(),
                candy4.getPrice()

        ) + " рублей");
    }

    public static double total(Double... doubles) {
        double sum = 0;
        for (int i = 0; i < doubles.length; i++) {
            sum = sum + doubles[i];
        }
        return sum;
    }

}



