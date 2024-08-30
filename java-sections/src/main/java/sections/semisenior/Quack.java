package sections.semisenior;

public class Quack implements QuackBehavior {

    public Quack(){}


    @Override
    public void quack() {
        System.out.println("Quack");
    }
}
