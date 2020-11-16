public class Product {
    private final int num;
    private final String title;
    private final double price;

    public Product(int num, String title, double price) {
        this.num = num;
        this.title = title;
        this.price = price;
    }

    public String getTitle() {
        return title;
    }

    public double getPrice() {
        return price;
    }

    @Override
    public String toString() {
        return num + " " + title + ":" + price + ".";
    }

}
