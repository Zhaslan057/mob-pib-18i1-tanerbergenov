import java.util.List;

public class Purchase implements Buyable {
    private final int num;
    private final Client client;
    private final List<Product> products;
    private final Sale currentSale;


    public Purchase(int num, Client client, List<Product> products, Sale currentSale) {
        this.num = num;
        this.client = client;
        this.products = products;
        this.currentSale = currentSale;
    }

    public double getPrice() {
        double totalPrice = 0;
        for (Product product : products) {
            totalPrice += product.getPrice();
        }
        totalPrice *= (100 - currentSale.getDiscount()) / 100;
        totalPrice *= (100 - client.getStatus().getDiscount()) / 100;
        return totalPrice;
    }
    @Override
    public String toString() {
        StringBuilder result = new StringBuilder("Purchase: " +
                "num " + num +
                ", client: " + client +
                ", products: ");
        for (Product product : products) {
            result.append(product.getTitle()).append(" ").append(product.getPrice()).append(", ");
        }
        result.append(" currentSale: ").append(currentSale);
        return result.toString();
    }
}
