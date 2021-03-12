public class CountDebCred {
    public String number;
    public String name;
    public double quantity;
    public double balance;

    public CountDebCred(String number, String name, double quantity, double balance){
        this.number = number;
        this.name = name;
        this.quantity = quantity;
        this.balance = balance;
    }

    public String getNumber() {
        return number;
    }

    public String getName() {
        return name;
    }

    public double getQuantity() {
        return quantity;
    }

    public double getBalance() {
        return balance;
    }

    @Override
    public String toString() {
        return "Number - " + getNumber() +
                "; Name - " + getName() +
                "; Quantity - " + getQuantity() +
                "; Balance - " + getBalance();
    }
}
