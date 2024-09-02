package sections.semisenior;

public class MuteQuack implements QuackBehavior {

    public MuteQuack(){}


    public void quack() {
        System.out.println("No sounds from this duck");
    }
}
