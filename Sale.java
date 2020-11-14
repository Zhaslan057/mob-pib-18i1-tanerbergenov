public enum Sale {
    NO("нет скидок", 0),
    SALE("Скидочный день", 30);

    private final String actionName;
    private final double discount;

    Sale(String actionName, double discount) {
        this.actionName = actionName;
        this.discount = discount;
    }

    public double getDiscount() {
        return discount;
    }

    public String getActionName() {
        return actionName;
    }
}
