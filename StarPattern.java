class StarPattern {    // class name
    public static void main(String[] args) {   // main method
        int rows = 5; // 5 rows    

        // Outer loop for rows
        for (int i = rows; i >= 1; i--) {     // loop
            // Inner loop for printing stars in each row
            for (int j = 1; j <= i; j++) {    // loop
                System.out.print("* ");    //output statement
            }
            System.out.println(); // Move to the next line after each row
        }
    }
}
