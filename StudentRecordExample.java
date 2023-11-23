/*2. WAP for storing 10 student records from the user using the Array of the object and 
handling ArrayIndexOutOfBoundException*/
import java.util.Scanner; // scanner class

// class stores the student record
class Record { //class
     String name; // variable to store student name
     int age;     // variable to store student age
	 int roll;    // variable to store student rollno
    
    // Constructor to initialize the 'Record' object with name and age
    public Record(String name, int age, int roll) {
        this.name = name;
        this.age = age;
        this.roll = roll;
    }
    
    // this method retrieve the student student name
    public String getName() {
        return name;
    }
    
    // this method retrieve the student age
    public int getAge() {
        return age;
    }
    
 // this method retrieve the student roll number
    public int getRoll() {
        return roll;
    }
}

// Main class
public class StudentRecordExample { 
    public static void main(String[] args) { //main method
        try (Scanner obj = new Scanner(System.in)) {
			Record[] students = new Record[10]; // this array stores the 10 students records
			
			// loop to input details for each student and store them in the array
			for (int i = 0; i < students.length; i++) { //this loop is iterate till this condition is happened
			    System.out.println("Enter first student details " + (i + 1) + ":");
			    
			    // student name is get from user
			    System.out.print("Name ");
			    String name = obj.nextLine(); //it stores name is name variable
			    
			    // student age is get from user
			    System.out.print("Age ");
			    int age = obj.nextInt();  //it stores age in age variable
			    
			    // student roll number is get from user
			    System.out.print("Roll no ");
			    int rollNo = obj.nextInt(); //it store roll number in rollNo variable
			    
			    
			    // new Record object and add it to the array
			    students[i] = new Record(name, age, rollNo);
			    System.out.println("Record added successfully!\n");
			}
			
			// print student records stored in the array
			System.out.println("Student Records ");
			for (int i = 0; i < students.length; i++) { //loop continues until array length
			    try {
			        // display name age and rollno of each student
			        System.out.println("Name: " + students[i].getName() + ", Age: " + students[i].getAge());
			    } catch (ArrayIndexOutOfBoundsException e) { //exception is throw if any exception is occur
			        System.err.println("Error accessing student record: " + e.getMessage());
			    }
			}
		}
        
     
    }
}
