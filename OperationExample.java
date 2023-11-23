class OperationExample {
    public static void main(String[] args) {
        int number1 = 100;
        int number2 = 200;
        
        int sum = number1 + number2;               // Addition operation
        System.out.println("Addition: " + sum);
        
        int difference = number1 - number2;
        System.out.println("Subtraction: " + difference);      // Subtraction operation
              
        int product = number1 * number2;                        // Multiplication operation
        System.out.println("Multiplication: " + product);
             
        if (number2 != 0) {                                // Division operation
            int result = number1 / number2;
            System.out.println("Division: " + result);
        } else {
            System.out.println("Error: Division by zero");
        }
    }
}
