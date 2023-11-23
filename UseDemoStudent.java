class DemoStudent {
    int sid;
    String sname;

    DemoStudent() {
        this.sid = 101;
        this.sname = "AAAZZZZ";
    }

    void display() {
        System.out.println(sid + " " + sname);
    }
}

public class UseDemoStudent {
    public static void main(String[] args) {
        DemoStudent dl = new DemoStudent(); // Creating an object and using the constructor

        dl.display(); // Calling the display method to print the values
    }
}
