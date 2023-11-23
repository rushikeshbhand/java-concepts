//1. WAP to search a particular element in the given array.

//this class searches element(findNumber) in an array
class SearchArray {  //class number 2

 // this method search element in an array
 public int searchElement(int arr[], int findNumber) {  //here we uses return type as int so integer will passed and arguments are passed in parameters
	 
     // loop for the array to find the element which is passed in findNumber
     for (int i = 0; i < arr.length; i++) {  //this loop continuous its operation until the for loop condition is match
         if (arr[i] == findNumber) {
             return i; // it returns the index as integer if element is found 
         }
     }
     
     return -1; // it returns the index as -1 if element is not found
 }
}

public class SearchArrayExample {  // main class

 public static void main(String[] args) { //main method
     int arr[] = { 10, 20, 30, 40, 50, 60, 70, 80, 90, 100 }; // Array of integers which we declare
     int findNumber = 10; // we are searching this element in the array
     // here we create object of SearchArray class to call searchElement method
     SearchArray searchNumber = new SearchArray();  //object is created as searchNumber and in this brackets we are going to pass arguments

     // we use the searchElement method to find the index of the findNumber element
     int index = searchNumber.searchElement(arr, findNumber); //we passed array and number that we are going to find in searchElement method

     // print the result
     if (index != -1) {  
         System.out.println(findNumber + " is found at index " + index);
     } else {
         System.out.println(findNumber + " is not found in the array");
     }
 }
}

