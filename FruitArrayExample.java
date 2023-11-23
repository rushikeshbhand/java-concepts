class FruitArrayExample {
    public static void main(String[] args) {
        String[] fruits = new String[5]; // Create an array of size 5 to store the fruit names
        
        // Assign fruit names to array elements
        fruits[0] = "Apple";
        fruits[1] = "Banana";
        fruits[2] = "Orange";
        fruits[3] = "Mango";
        fruits[4] = "Grapes";
        
        // Print the fruit names
        for (int i = 0; i < fruits.length; i++) {
            System.out.println(fruits[i]);
        }
    }
}
