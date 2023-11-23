class Student2 {
    int roll_no; // data member
    String sname;

    void addValue(int r, String n) { // method to add the values
        this.roll_no = r;
        this.sname = n;
    }

    void display() { // method to display the values
        System.out.println(roll_no + " " + sname);
    }
}

class UseStudent2 {
    public static void main(String args[]) {
        Student2 s1 = new Student2(); // creating an object
        s1.addValue(100, "Ravi");
        s1.display();
    }
}
