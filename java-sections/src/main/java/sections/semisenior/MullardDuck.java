package sections.semisenior;

public class MullardDuck extends Duck {


    public MullardDuck() {}

    public MullardDuck(String name, String color, int age, String race, FlyBehavior flyBehavior,
                       QuackBehavior quackBehavior) {
        super(name, color, age, race);
        this.quackBehavior = quackBehavior;
        this.flyBehavior = flyBehavior;
    }

    @Override
    public void display() {
        System.out.println("Mullard Duck");
    }

    @Override
    public void swim() {
        System.out.println("Swim Duck");
    }

    @Override
    public void eat() {
        System.out.println("Eat Duck");
    }
}
