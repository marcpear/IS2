package software.ulpgc;

public class Product {
    private final String name;
    private final double price;

    public Product(String name, int price) {
        this.name = name;
        this.price = price;
    }

    private final static double TAX_RATE = 0.21;

    public double getPriceWithTax(){
        return price + price * TAX_RATE;
    }
}
