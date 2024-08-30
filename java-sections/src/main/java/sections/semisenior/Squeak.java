package sections.semisenior;


public class Squeak implements QuackBehavior{

    public Squeak(){}


    @Override
    public void quack() {
        System.out.println("Squeak");
    }
}
