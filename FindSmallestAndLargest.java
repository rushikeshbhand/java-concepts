import java.util.Arrays;   //package    import java.util.Arrays is used to import the Arrays class from the java.util package.

class FindSmallestAndLargest {  //class name

    public static void main(String[] args) {         //main method
        int[] array = {11, 14, 29, 2, 72, 99};             //array

        int smallest = array[0];                          //initialize variables from first number to last number
        int largest = array[0];

        for (int i = 1; i < array.length; i++) {           //iterate array with if else statement to find smallest and largest number
            if (array[i] < smallest) {
                smallest = array[i];
            } else if (array[i] > largest) {                 
                largest = array[i];
            }
        }

        System.out.println("The smallest number in the array is " + smallest);     //print smallest number
        System.out.println("The largest number in the array is " + largest);       //print largest number
    }
}
