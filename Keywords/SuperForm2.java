// 2. Using super to call a parent class method

package Keywords;

    class Animal {
        void sound() {
            System.out.println("Animal makes a sound");
        }
    }
    
    class Dog extends Animal {
        void sound() {
            super.sound();  // Calls Animal's sound()
            System.out.println("Dog barks");
        }
    }
    
    public class SuperForm2 {
        public static void main(String[] args) {
            Dog d = new Dog();
            d.sound();
        }
    }
    

