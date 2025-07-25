// 1. Using super() to call the parent class constructor

package Keywords;

    class Animal {
        Animal(String name) {
            System.out.println("Animal constructor called");
            System.out.println("Animal name: " + name);
        }
    }
    
    class Dog extends Animal {
        // Dog() {
        //     super();  // Calls Animal constructor
        //     System.out.println("Dog constructor called");
        // }

        // Dog() {
        //     //animal constructor is called by default implicitly automaticaly but in case of no argument constructor only 
        //     System.out.println("Dog constructor called");
        // }

        //if there is parameterized constructor then we have to call it explicitly with super 
        Dog() {
            super("dog");  // Calls Animal constructor
            System.out.println("Dog constructor called ");
        }

    }

    public class SuperForm1 {   
        public static void main(String[] args) {
            Dog dog = new Dog();  // Creates a Dog object, which also calls the Animal constructor
        }
    }
