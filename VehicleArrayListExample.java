//import ArrayList class
import java.util.ArrayList;
//import Iterator class
import java.util.Iterator;
//class name
public class VehicleArrayListExample {
    public static void main(String[] args) { //main method
        //we have create here object of arraylist
        ArrayList<String> vehicles = new ArrayList<String>();

       //add vehicle names
        vehicles.add("activa");
        vehicles.add("bike");
        vehicles.add("alto");
        vehicles.add("kia");
        vehicles.add("EcoSport");
        vehicles.add("honda");
        vehicles.add("Swift");
        vehicles.add("Verna");
        vehicles.add("nissan");
        vehicles.add("Seltos");

        //1.we have print here arraylist
        System.out.println("ArrayList of Vehicles :"+vehicles);
        
        //2.iterate through arraylist and print each element of list
        System.out.println("Print each element :");
        Iterator<String> iterator = vehicles.iterator();
        while (iterator.hasNext()) {
            System.out.println(iterator.next());
        }
        
        //3.add element at start and end of program
        vehicles.add(0, "Glanza");  //add the element at the start of arraylist 
        System.out.println(vehicles.add("XUV 300")); //add the element at the end of arraylist
        
        //4.retrieve an element at index number 4
        System.out.println(vehicles.get(4));
        
        //5.update the element at index number  7 with vehicle name XUV300
        vehicles.set(7, "XUV300");
        
        //6.Search for the element "verna" if it is found just print 'found the vehicle' else print 'not found'
        System.out.println("Search the element verna: ");
        if (vehicles.contains("Verna")) {
            System.out.println("vehicle is found");
        } else {
            System.out.println("Not found");
        }
        
        //7.Copy this arraylist to the new arraylist
        ArrayList<String> copyOfVehicles = new ArrayList<>(vehicles);
        System.out.println("copy ArrayList:");
        System.out.println(copyOfVehicles);

        
    }
}

