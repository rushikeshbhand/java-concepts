class IntegerArrayExample {
    public static void main(String[] args) {
        int[] numbers = new int[5]; // Create an array of size 5 to store the integer values
        
        // Assign integer values to array elements
        numbers[0] = 10;
        numbers[1] = 5;
        numbers[2] = 20;
        numbers[3] = 15;
        numbers[4] = 8;
        
        // Find the largest number among the values
        int largest = numbers[0];
        for (int i = 1; i < numbers.length; i++) {
            if (numbers[i] > largest) {
                largest = numbers[i];
            }
        }
        
        // Print the largest number
        System.out.println("Largest number: " + largest);
    }
}
