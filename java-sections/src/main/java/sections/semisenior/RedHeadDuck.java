package sections.semisenior;

public class RedHeadDuck extends Duck {


    public RedHeadDuck() {}

    public RedHeadDuck(String name, String color, int age, String race) {
        super(name, color, age, race);
    }

    @Override
    public void display() {
        System.out.println("RedHead Duck");
    }

    @Override
    public void swim() {
        System.out.println("Swim RedHead Duck");
    }

    @Override
    public void eat() {
        System.out.println("Eat RedHead Duck");
    }
}
