public enum ClientStatus {
    NEW(0),
    CONSTANT(10);

    private final double discount;

    ClientStatus(double discount) {
        this.discount = discount;
    }

    public double getDiscount() {
        return discount;
    }
}

