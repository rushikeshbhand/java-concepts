class ReverseNumber {   //class name

    public static void main(String[] args) {     //main method
        int number = 398;   
        
    // The reversed number is initialized to 0.		
        int reversedNumber = 0;                  

        while (number > 0) {                     //while loop
            int digit = number % 10;                   // The current digit is obtained by performing a modulus operation on the number and 10.  
            reversedNumber = reversedNumber * 10 + digit;  // The current digit is added to the reversed number, multiplied by 10.
            number = number / 10;     // The number is divided by 10 to remove the current digit
        }

        System.out.println("The reverse of the number is " + reversedNumber);     // The reversed number is printed 
    }
}
