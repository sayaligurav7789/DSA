package Keywords;

public class ThisForm2 {
    int roll_no;
    String name;
    double marks;

    //here it will not work because no use of .this even the parameters and instace variable names are same
    // ThisForm2(int roll_no, String name, double marks){
    //     roll_no = roll_no;
    //     name = name;
    //     marks = marks;
    // }
    public ThisForm2(int roll_no, String name, double marks) {
        this.roll_no = roll_no;
        this.name = name;
        this.marks = marks;
    }

    

    public static void main(String[] args) {
        ThisForm2 obj = new ThisForm2(130, "Sayali", 100);
        System.out.println(obj.roll_no);
        System.out.println(obj.name);
        System.out.println(obj.marks);

    }
}
