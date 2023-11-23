class FloatArrayExample {
    public static void main(String[] args) {
        float[] values = new float[10]; // Create an array of size 10 to store the float values
        
        // Assign float values to array elements
        values[0] = 1.2f;
        values[1] = 2.5f;
        values[2] = 3.7f;
        values[3] = 4.1f;
        values[4] = 5.3f;
        values[5] = 6.8f;
        values[6] = 7.2f;
        values[7] = 8.6f;
        values[8] = 9.4f;
        values[9] = 10.0f;
        
        // Calculate the total of all the values
        float total = 0;
        for (int i = 0; i < values.length; i++) {
            total += values[i];
        }
        
        // Print the total
        System.out.println("Total: " + total);
    }
}
