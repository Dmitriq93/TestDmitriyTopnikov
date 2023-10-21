public class Candy {
    private String name;
    private String colour;

    public String getColour() {
        return colour;
    }

    public void setColour(String colour) {
        this.colour = colour;
    }

    private Double weight;
    private Double price;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Double getWeight() {
        return weight;
    }

    public void setWeight(Double weight) {
        this.weight = weight;
    }

    public Double getPrice() {
        return price;
    }

    public void setPrice(Double price) {
        this.price = price;
    }

    public String getInfo() {
        return " название = "+name+"\n вес конфеты = "+weight+" грамм\n цена конфеты = "+price+" рублей\n";
    }

    public Candy(String name, Double weight, Double price) {
        this.name = name;
        this.weight = weight;
        this.price = price;
    }
}


