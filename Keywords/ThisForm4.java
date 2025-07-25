package Keywords;

public class ThisForm4 {
    int roll_no;
    String name;
    double marks;

    ThisForm4(int roll_no, String name, double marks){
        this.roll_no = roll_no;
        this.name = name;
        this.marks = marks;
    }

    void get(){
        System.out.println("My Roll No is " + this.roll_no);
        System.out.println("My Name is " + this.name);
        System.out.println("My Marks are " + this.marks);
        
    }

    public static void main(String[] args) {
        ThisForm4 obj = new ThisForm4(130, "Sayali", 100);
        obj.get();
    }
}
