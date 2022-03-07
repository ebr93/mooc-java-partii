public class Dog extends Animal implements NoiseCapable {

    // constructor utilizes superclass parameters from abstract class
    public Dog(String name) {
        super(name);
    }

    public Dog() {
        super("Dog");
    }

    // prints Dog barks
    public void bark() {
        System.out.println(super.getName() + " barks");
    }

    // implements method from interface NoiseCapable
    @Override
    public void makeNoise() {
        bark();
    }
    
}
