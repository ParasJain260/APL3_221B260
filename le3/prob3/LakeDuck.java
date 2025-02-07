public class LakeDuck extends Duck implements Flyable, Quackable {
    @Override
    public void fly() {
        System.out.println("Lake Duck: I am flying!");
    }

    @Override
    public void quack() {
        System.out.println("Lake Duck: Quack!");
    }

    @Override
    public void display() {
        System.out.println("I am a Lake Duck.");
    }
}
