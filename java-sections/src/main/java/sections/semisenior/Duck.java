package sections.semisenior;

public abstract class Duck {

    private String name;
    private String color;
    private int age;
    private String race;

    public Duck() {
    }

    public Duck(String name, String color, int age, String race) {
        this.name = name;
        this.color = color;
        this.age = age;
        this.race = race;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }


    public String getRace() {
        return this.race;
    }

    public void setRace(String race){
        this.race = race;
    }


    public abstract void display();
    public abstract void swim();

    public abstract void eat();

}
