import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Application {
    public static void main(String[] args) {
        Shop shop = new Shop();
        shop.register(new Client(1, "Виктор", ClientStatus.NEW));
        shop.register(new Client(2, "Антон", ClientStatus.CONSTANT));
        Scanner sc = new Scanner(System.in);

        System.out.println("Добро пожаловать в магазин" + '\n');

        int q;
        do {
            System.out.println("1: Посмотреть ассортимент");
            System.out.println("2: Новый заказ");
            System.out.println("3: Список покупателей");
            System.out.println("4: Применить скидку");
            System.out.println("5: Выход");
            q = sc.nextInt();
            switch (q) {
                case 1:
                    for (Product product : shop.getProducts()) {
                        System.out.println(product);
                    }
                    break;
                case 2: {
                    createPurchase(shop);
                    break;
                }
                case 3: {
                    for (Client client : shop.getClients()) {
                        System.out.println(client);
                    }
                    break;
                }
                case 4: {
                    shop.setCurrentSale(Sale.SALE);
                    break;
                }
                case 5: {
                    System.out.println("Выход");
                }
            }

        } while (q != 5);
    }

    private static void createPurchase(Shop shop) {
        List<Product> basket = new ArrayList<>();
        System.out.println("Введите номер необходимого продукта");
        System.out.println("1. Хлеб");
        System.out.println("2. Молоко");
        System.out.println("3. Сыр");
        System.out.println("4. Масло");
        System.out.println("Нажмите 5 для выхода");
        Scanner sc = new Scanner(System.in);
        int n;
        do {
            n = sc.nextInt();
            switch (n) {
                case 1:
                    basket.add(shop.getProducts().get(0));
                    break;
                case 2:
                    basket.add(shop.getProducts().get(1));
                    break;
                case 3:
                    basket.add(shop.getProducts().get(2));
                    break;
                case 4:
                    basket.add(shop.getProducts().get(3));
                    break;
                default:
                    break;
            }
        } while (n != 5);
        Purchase or = shop.createPurchase(shop.getClients().get(1), basket);
        System.out.println(or);
    }
}
