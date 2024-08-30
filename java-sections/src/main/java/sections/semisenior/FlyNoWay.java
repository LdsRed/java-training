package sections.semisenior;

public class FlyNoWay implements FlyBehavior {


    public FlyNoWay(){}

    @Override
    public void fly() {
        System.out.println("No way you can fly");
    }
}
