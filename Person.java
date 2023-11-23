class Person {

    private int id;
    private String name;
    private String designation;

    public Person(int id, String name) {
        this.id = id;
        this.name = name;
        this.designation = "Default designation";
    }

    public Person(String name, String designation) {
        this.id = 0;
        this.name = name;
        this.designation = designation;
    }

    public Person(int id, String name, String designation) {
        this.id = id;
        this.name = name;
        this.designation = designation;
    }

    public void printPerson() {
        System.out.println("Id: " + id);
        System.out.println("Name: " + name);
        System.out.println("Designation: " + designation);
    }

    public static void main(String[] args) {
        // Ask the user what are his inputs
        Scanner scanner = new Scanner(System.in);
        System.out.println("Do you want to enter ID and Name (1) or Name and Designation (2)?");
        int choice = scanner.nextInt();

        // Create a Person object according to the user's choice
        Person person;
        if (choice == 1) {
            System.out.println("Enter the ID: ");
            int id = scanner.nextInt();
            System.out.println("Enter the Name: ");
            String name = scanner.next();
            person = new Person(id, name);
        } else {
            System.out.println("Enter the Name: ");
            String name = scanner.next();
            System.out.println("Enter the Designation: ");
            String designation = scanner.next();
            person = new Person(name, designation);
        }

        // Print the Person object
        person.printPerson();
    }
}