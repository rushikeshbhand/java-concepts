//4. WAP to accept a person's first, middle and last names in a string variable and then display in short form. (Example - ARUP KUMAR DAS becomes A. K. DAS)

import java.util.Scanner;//scanner class

public class ShortFormOfName { //class name 
	// this method to create and return the short form of the name
    public static String getShortForm(String first, String middle, String last) {//this are the three parameters 
        
    	// extract the first letter of the first name
        char firstInitial = first.charAt(0); //extract character whose index is zero
        
        // extract the first letter of the middle name
        char middleInitial = middle.charAt(0);//extract character whose index is zero
        
        // create the short form using the first, middle initials, and last name user and this data is return in shortform in main method to print the shortform
        return String.valueOf(firstInitial).toUpperCase() + ". " + //this dot is apply after first character
               String.valueOf(middleInitial).toUpperCase() + ". " +  //this dot is apply after second character
               last.toUpperCase();
    }
	
    public static void main(String[] args) {  
        Scanner scanner = new Scanner(System.in); //scanner class

        // input first, middle and last names
        System.out.print("Enter first name ");
        String firstName = scanner.nextLine();  //first name is store here

        System.out.print("Enter middle name ");
        String middleName = scanner.nextLine(); //middle name is store here

        System.out.print("Enter last name ");
        String lastName = scanner.nextLine();   //lastname   

        // Display short form of the name
        String shortForm = getShortForm(firstName, middleName, lastName);
        System.out.println("Short form of name is " + shortForm);

        scanner.close();  //close scanner operation here
    }

    
}
