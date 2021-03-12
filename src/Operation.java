public class Operation {
    int number;
    public CountDebCred debit;
    public CountDebCred credit;
    double money;

    public Operation(int number, CountDebCred debit, CountDebCred credit, double money)
    {
        this.number = number;
        this.debit = debit;
        this.credit = credit;
        this.money = money;
        debit.balance += money;
        credit.balance -= money;
    }


    @Override
    public String toString() {
        return "number - " + number +
                " debit - " + debit.getNumber() +
                " credit - " + credit.getNumber() +
                " money - " + money;
    }
}
