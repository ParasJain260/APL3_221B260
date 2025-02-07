// Main class
public class Main {
    public static void main(String[] args) {
        Arjun arjun = new Arjun();
        Bheem bheem = new Bheem();
        Duryodhan duryodhan = new Duryodhan();
        Vikarn vikarn = new Vikarn();

        System.out.println("--- Arjun ---");
        arjun.showLineage();
        arjun.fight();
        arjun.obey();
        arjun.kind();

        System.out.println("\n--- Bheem ---");
        bheem.showLineage();
        bheem.fight();
        bheem.obey();
        bheem.kind();

        System.out.println("\n--- Duryodhan ---");
        duryodhan.showLineage();
        duryodhan.fight();
        duryodhan.obey();
        duryodhan.kind();

        System.out.println("\n--- Vikarn ---");
        vikarn.showLineage();
        vikarn.fight();
        vikarn.obey();
        vikarn.kind();
    }
}
