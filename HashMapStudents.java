//import classes 
import java.util.HashMap;
import java.util.Map;
//class name
public class HashMapStudents {
    public static void main(String[] args) {  //starting point
        // Create a HashMap of students and here key student id and student name
    	Map studentsMap = new HashMap();

        // Add students to the HashMap
        studentsMap.put(101, "Yash");
        studentsMap.put(102, "Dhanashree");
        studentsMap.put(103, "Pradnya");
        studentsMap.put(104, "Rushi");

        //1.Check if the map contains the mapping for specified key (105)
        int keyvalue = 105;
        if (studentsMap.containsKey(keyvalue)) {  //contains method is used check the key is contain or not
            System.out.println("Map contains the key value " + keyvalue);
        } else {
            System.out.println("Map doesnot contain the key value " + keyvalue);
        }

        //2.Count the number of key-value mappings in the map
        int mapSize = studentsMap.size(); //size method is is used for count
        System.out.println("key value size is " + mapSize);

        //3.Copy the mapping to another map
        Map newMap = new HashMap(studentsMap);
        System.out.println("c. Copied mapping to another map: " + newMap);
    }
}

