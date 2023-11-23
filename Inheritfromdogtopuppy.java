// Dog class
class Dog {
    // Method to get the color of the dog (default color: white)
    void getColor() {
        System.out.println("Color of the dog is white.");
    }

    // Method to show that the dog is eating dog food
    void eat() {
        System.out.println("The dog is eating dog food.");
    }
}
// Puppy class (subclass of Dog)
class Puppy extends Dog {
    // Method to get the color of the puppy (color: black)
    @Override
    void getColor() {
        System.out.println("Color of the puppy is black.");
    }

    // Method to show that the puppy is drinking milk
    void drinkMilk() {
        System.out.println("The puppy is drinking milk.");
    }
}
public class Inheritfromdogtopuppy {
    public static void main(String[] args) {
        // Create a Dog object
        Dog dog = new Dog();

        // Call methods of the Dog class
        dog.getColor(); // Output: Color of the dog is white.
        dog.eat();      // Output: The dog is eating dog food.

        System.out.println(); // Empty line for separation

        // Create a Puppy object
        Puppy puppy = new Puppy();

        // Call methods of the Puppy class (overrides getColor method)
        puppy.getColor();   // Output: Color of the puppy is black.
        puppy.eat();        // Output: The dog is eating dog food.
        puppy.drinkMilk();  // Output: The puppy is drinking milk.
    }
}
