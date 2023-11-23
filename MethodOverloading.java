class MethodOverloading {

    // Method to add two integers
    public int add(int a, int b) {
        return a + b;
    }

    // Method to add three integers
    public int add(int a, int b, int c) {
        return a + b + c;
    }

    // Method to add two doubles
    public double add(double a, double b) {
        return a + b;
    }

    public static void main(String[] args) {
        OverloadingExample example = new OverloadingExample();

        // Calling the first add method with two integers
        int sum1 = example.add(2, 3);
        System.out.println("Sum of two integers: " + sum1);

        // Calling the second add method with three integers
        int sum2 = example.add(2, 3, 4);
        System.out.println("Sum of three integers: " + sum2);

        // Calling the third add method with two doubles
        double sum3 = example.add(2.5, 3.7);
        System.out.println("Sum of two doubles: " + sum3);
    }
}
