public class Cat extends Animal implements NoiseCapable {

    // constructor utilizes superclass parameters from abstract class
    public Cat (String name) {
        super(name);
    }

    public Cat () {
        super("Cat");
    }

    // prints Cat purrs
    public void purr() {
        System.out.println(super.getName() + " purrs");
    }

    // implements method from interface NoiseCapable
    @Override
    public void makeNoise() {
        purr();
    }
}
