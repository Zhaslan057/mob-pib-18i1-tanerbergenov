class Calc {
    public static void main(String[] arg) {
        if (arg.length == 0) {
            System.out.println("Error.No args");
            return;
        } else if (arg.length != 3) {
            System.out.println("Error.Not enough args");
            return;
        }
        try {
            double x = Double.parseDouble(arg[0]);
            char operation = arg[1].charAt(0);
            double y = Double.parseDouble(arg[2]);
            System.out.println(calculate(x, y, operation));
        } catch (NumberFormatException ex) {
            System.out.println("error invalid number format");
        }
    }

    private static double calculate(double x, double y, char operation) {
        switch (operation) {
            case '+':
                return x + y;
            case '-':
                return x - y;
            case '*':
                return x * y;
            case '/':
                return x / y;
            default:
                return Double.NaN;
        }
    }
}