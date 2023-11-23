// class named Doctor
class Doctor {

    // Declare the instance variable name to store the doctor's name
    String name;

    // Constructor to initialize the name variable when a Doctor object is created
    Doctor(String name) {
        this.name = name;
    }

    // Method to display the name of the doctor
    void display() {
        System.out.println("Doctor: " + name);
    }

    void treatPatient() {
        System.out.println("Doctor is treating the patient.");
    }
}

// the class named Surgeon, which is a subclass of Doctor
class Surgeon extends Doctor {

    // Declare the instance variable specialization to store the surgeon's specialization
    String specialization;

    // Constructor to initialize the name and specialization variables when a Surgeon object is created
    Surgeon(String name, String specialization) {
        // Call the constructor of the parent class (Doctor) to set the name variable
        super(name);
        this.specialization = specialization;
    }

    // Override the display method to display the name and specialization of the surgeon
    
    void display() {
        System.out.println("Surgeon: " + name + ", Specialization: " + specialization);
    }

    // Method to simulate performing surgery
    void performSurgery() {
        System.out.println("Surgeon is performing surgery.");
    }
}

// Define the class named Nurse, which is a subclass of Doctor
class Nurse extends Doctor {

    // Constructor to initialize the name variable when a Nurse object is created
    Nurse(String name) {
        // Call the constructor of the parent class (Doctor) to set the name variable
        super(name);
    }

    // Override the display method to display the name of the nurse
    @Override
    void display() {
        System.out.println("Nurse: " + name);
    }

    // Method to simulate providing care to the patient
    void provideCare() {
        System.out.println("Nurse is providing care to the patient.");
    }
}

// it is main class to run the program
public class MethodOverRiding {

    // Main method, the starting point of the program
    public static void main(String[] args) {
        // Create an object of the Surgeon class
        Surgeon surgeon = new Surgeon("Dr. Rushi", "Cardiovascular");

        // Create an object of the Nurse class
        Nurse nurse = new Nurse("Kiara");

        // Call the display and treatPatient methods of the Surgeon class
        surgeon.display();        
        surgeon.treatPatient();   
        surgeon.performSurgery(); 

        // Print an empty line for separation
        System.out.println();

        // Call the display and treatPatient methods of the Nurse class
        nurse.display();          
        nurse.treatPatient();     
        nurse.provideCare();      
    }
}
