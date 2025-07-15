class Problem_1 {
    double a;
    double b;
    String operation;

    public Calculator(double a, double b, String operation) {
        this.a = a;
        this.b = b;
        this.operation = operation;
    }

    public void calculate() {
        if (operation.equals("add")) {
            System.out.println("Result: " + (a + b));
        } else if (operation.equals("subtract")) {
            System.out.println("Result: " + (a - b));
        } else if (operation.equals("multiply")) {
            System.out.println("Result: " + (a * b));
        } else if (operation.equals("divide")) {
            if (b != 0) {
                System.out.println("Result: " + (a / b));
            } else {
                System.out.println("Error: Division by zero");
            }
        } else {
            System.out.println("Invalid operation");
        }
    }

    public static void main(String[] args) {
        Calculator calc1 = new Calculator(10, 5, "add");
        calc1.calculate(); // Output: Result: 15.0
    }
}
