import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
public class Balance {
    private final List<CountDebCred> accounts;
    private final List<Operation> operations = new ArrayList<>();
    public Balance()
    {
        this.accounts = new ArrayList<>();
        accounts.add(new CountDebCred("41", "Товары", 0, 0));
        accounts.add(new CountDebCred("50", "Касса", 0, 10000));
        accounts.add(new CountDebCred("60", "Расчеты с поставщиками и подрядчиками", 0, 0));
        accounts.add(new CountDebCred("62", "Расчеты с покупателями и заказчиками", 0, 0));
        accounts.add(new CountDebCred("90", "Расчеты с персоналом по оплате труда", 0, 0));
    }

    public Balance(List<CountDebCred> accounts)
    {
        this.accounts = accounts;
    }

    public List<CountDebCred> getAccounts() {
        return accounts;
    }

    public List<Operation> getOperations() {
        return operations;
    }

    public Operation createOperation(CountDebCred a, CountDebCred b, double money) {
        int number = 0;
        Operation operation = new Operation(number, a, b, money);
        operations.add(operation);
        return operation;
    }
    public void writeInTxtAccounts(){

        try(FileWriter writer = new FileWriter("account.txt")) {
            for (CountDebCred account : accounts) {
                String number = account.getNumber();
                String name = account.getName();
                String quantity = String.valueOf(account.getQuantity());
                String balance = String.valueOf(account.getBalance());
                writer.write(number + ";" + name + ";" + quantity + ";" + balance + System.getProperty("line.separator"));

            }
        }
        catch(IOException ex){

            System.out.println(ex.getMessage());
        }
    }
}
