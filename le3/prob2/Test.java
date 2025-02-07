public class Test implements Testable {
    @Override
    public void display() {
        System.out.println("Test class: display() method implemented.");
    }

    public static void main(String[] args) {
        Test obj = new Test();
        obj.display();
    }
}
