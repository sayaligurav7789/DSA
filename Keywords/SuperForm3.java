package Keywords;

class Animal {
    String type = "Animal";
}

class Dog extends Animal {
    String type = "Dog";

    void printType() {
        System.out.println(super.type);  // Accesses Animal's type
    }
}

public class SuperForm3 {
    public static void main(String[] args) {
        Dog d = new Dog();
        d.printType();
    }
}

