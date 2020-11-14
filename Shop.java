import java.util.ArrayList;
import java.util.List;
    public class Shop {
        private static int NEXT_NUM = 1;
        private final List<Client> clients;
        public List<Product> products;
        private final List<Purchase> purchases;
        private Sale currentSale;


    public Shop() {
        clients = new ArrayList<>();
        products = new ArrayList<>();
        purchases = new ArrayList<>();
        this.currentSale = Sale.NO;
        products.add(new Product(1, "Хлеб", 30.50));
        products.add(new Product(2, "Молоко", 58.00));
        products.add(new Product(3, "Сыр", 340.00));
        products.add(new Product(4, "Масло", 250.00));
    }

        public List<Client> getClients() {
        return clients;
        }

        public List<Product> getProducts() {
        return products;
        }

        public void register(Client client) {
            clients.add(client);
        }

        public Purchase createPurchase(Client client, List<Product> products) {
        Purchase or = new Purchase(NEXT_NUM++, client, products, currentSale);
        purchases.add(or);
        return or;
        }
        public void setCurrentSale(Sale currentSale) {
        this.currentSale = currentSale;
    }
        @Override
        public String toString() {
            return "clients=" + clients +
                    ", products=" + products +
                    ", purchases=" + purchases +
                    ", currentSale=" + currentSale;
        }
}

