package Keywords;

public class ThisForm1 {
    int roll_no;
    String name;
    double marks;

    ThisForm1(){
        roll_no = 130;
        name = "Sayali";
        marks = 100.0;

        System.out.println("Roll No: " + roll_no);
        System.out.println("Name: " + name);        
        System.out.println("Marks: " + marks);

    }
    public static void main(String[] args) {
        ThisForm1 obj = new ThisForm1();

    }

}
