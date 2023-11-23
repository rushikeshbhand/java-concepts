/*3. WAP to reverse a number given by user and also find the 
addition of all the numbers.*/

// import scanner class for getting user input 
import java.util.Scanner;
//public class
public class ReverseNumberExample {
	// this method is to reverse a number
    public static int reverseNumber(int num) {
        int reversed = 0; // set the value as 0 for reversed variable
        while (num != 0) {  //this loop continues until num value is become 0
            int digit = num % 10;  //here  remainder is calculate by using modulus operator 
            reversed = reversed * 10 + digit;  //it makes num as reversed
            num = num / 10;
        }
        return reversed; //reversed number is return for print
    }  //here this reversed method is end  

    // Method to calculate sum of numbers 
    public static int calculateSumOfDigits(int num) {  //num is get from user 
        int sum = 0;   //value of sum variable is set as zero
        while (num != 0) {  //if the value of num is become zero this loop is get stop iterating
            int digit = num % 10;  //this modulus result is stored in digit
            sum = sum + digit;  //here final sum of number is calculate 
            num = num / 10;
        }
        return sum; //sum is return for final printing 
    }
	
    public static void main(String[] args) {//main method it is the entry point of code
        Scanner scanner = new Scanner(System.in);

        // 
        System.out.print("Enter a number: ");  
        int number = scanner.nextInt();     //this statement is for getting user input 
        scanner.close();  //close scanner class 

        int reversedNumber = reverseNumber(number); // Call first method to reverse the number
        int sumOfDigits = calculateSumOfDigits(number); // Call second method to calculate sum 

        // Result is going to display here 
        System.out.println("Reversed Number is =" + reversedNumber);//reversed number is print
        System.out.println("Sum of numbers is =" + sumOfDigits);//sum is print
    }

    
}

