package Keywords;

public class ThisForm3 {
    int roll_no;
    String name;
    double marks;
    // Constructor with parameters
    ThisForm3(int roll_no, String name, double marks) {
        this.roll_no = roll_no; // Assigning the parameter value to the instance variable
        this.name = name; 
        this.marks = marks; 
    }

    // Default constructor
    ThisForm3() {
        this(130, "Sayali", 100); // Calling the parameterized constructor: i.e. calling the one constructor from another constructor
    }   
    public static void main(String[] args) {
        ThisForm3 obj1 = new ThisForm3(130, "Sayali", 100); // Using parameterized constructor
        System.out.println("Roll No: " + obj1.roll_no);
        System.out.println("Name: " + obj1.name);        
        System.out.println("Marks: " + obj1.marks);

        ThisForm3 obj2 = new ThisForm3(); // Using default constructor
        System.out.println("Roll No: " + obj2.roll_no);
        System.out.println("Name: " + obj2.name);        
        System.out.println("Marks: " + obj2.marks);
    }

}
