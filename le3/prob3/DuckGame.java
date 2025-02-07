public class DuckGame {
    public static void main(String[] args) {
        Duck rubberDuck = new RubberDuck();
        Duck woodenDuck = new WoodenDuck();
        Duck redHeadDuck = new RedHeadDuck();
        Duck lakeDuck = new LakeDuck();

        System.out.println("--- Rubber Duck ---");
        rubberDuck.display();
        rubberDuck.swim();
        ((Quackable) rubberDuck).quack(); // Casting since only quackable ducks quack

        System.out.println("\n--- Wooden Duck ---");
        woodenDuck.display();
        woodenDuck.swim();

        System.out.println("\n--- RedHead Duck ---");
        redHeadDuck.display();
        redHeadDuck.swim();
        ((Flyable) redHeadDuck).fly();
        ((Quackable) redHeadDuck).quack();

        System.out.println("\n--- Lake Duck ---");
        lakeDuck.display();
        lakeDuck.swim();
        ((Flyable) lakeDuck).fly();
        ((Quackable) lakeDuck).quack();
    }
}
