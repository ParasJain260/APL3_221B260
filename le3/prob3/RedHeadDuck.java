public class RedHeadDuck extends Duck implements Flyable, Quackable {
    @Override
    public void fly() {
        System.out.println("RedHead Duck: I am flying!");
    }

    @Override
    public void quack() {
        System.out.println("RedHead Duck: Quack!");
    }

    @Override
    public void display() {
        System.out.println("I am a RedHead Duck.");
    }
}
