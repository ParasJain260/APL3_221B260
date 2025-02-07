// Abstract class for Kauravs
public abstract class Kaurav extends Bharatvanshi {
    @Override
    public void fight() {
        System.out.println("I am a Kaurav, and I fight bravely.");
    }

    public abstract void obey();  // Kauravs are not obedient by default
    public abstract void kind();  // Kauravs are cruel by default
}
