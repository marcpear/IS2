package software.ulpgc;

public class Main {
    public static void main(String[] args) {
        Product product = new Product("Agua con gas", 0.99);
        System.out.println(product.getPriceWithTax());
    }

}
