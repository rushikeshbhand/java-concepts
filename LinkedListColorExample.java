//import this classes to use this classes in our program
import java.util.LinkedList;
import java.util.List;
import java.util.ListIterator;
//this is class name LinkedListColorExample 
public class LinkedListColorExample {
    public static void main(String[] args) { //main method
        // Create a LinkedList of colors
        List<String> colors = new LinkedList<String>();

        // add ten colors in our list
        colors.add("Red");
        colors.add("Green");
        colors.add("Blue");
        colors.add("Yellow");
        colors.add("Orange");
        colors.add("Purple");
        colors.add("Pink");
        colors.add("Brown");
        colors.add("skyblue");
        colors.add("violet");

        //1.append grey color in our list
        System.out.println(colors.add("Grey"));

        //2.Iterate through all the elements of the linked list starting from element 4
        System.out.println("Iterate through elements and starting from element no 4:");
        ListIterator<String> iterator = colors.listIterator(3); // Start from element 4 (0-based index)
        while (iterator.hasNext()) {
            System.out.println(iterator.next());
        }

        //3.Iterate the linked list in reverse order
        System.out.println(" Iterate linked list in reverse order:");
        iterator = colors.listIterator(colors.size()); // starting iterate from last
        while (iterator.hasPrevious()) {
            System.out.println(iterator.previous());
   
        }
    }
}

