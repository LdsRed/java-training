package sections.semisenior;

public class MinuDuckImplementation
{

    public static void main(String[] args)
    {

        Duck mallard = new MullardDuck();

        mallard.performFly();
        mallard.performQuack();



        mallard.setFlyBehavior(new FlyNoWay());
        mallard.performFly();
    }
}
