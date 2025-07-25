public class Funoverloading {
  
    public void printMessage() {
        System.out.println("Hello, Sayali!");
    }

    public void printMessage(String name) {
        System.out.println("Hello, " + name + "!");
    }

    public void printMessage(String name, int age) {
        System.out.println("Hello, " + name + "! You are " + age + " years old.");
    }

    public static void main(String[] args) {
    
        Funoverloading obj = new Funoverloading();

        obj.printMessage(); 
        obj.printMessage("Priya"); 
        obj.printMessage("Rahul", 25);
    }
}


