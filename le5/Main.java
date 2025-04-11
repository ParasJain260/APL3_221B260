abstract class Beverages{
    private void pour(){
        
    }
    private void adddCondiment(){
        
    }
    private void stir(){
        
    }
    private void serve(){
        
    }
    public void templateMethod(){
    }
} 


public class Main
{
	public static void main(String[] args) {
		Beverages beverage = new Wiskey();
		beverage.templateMethod();
		beverage = new Beer();
		beverage.templateMethod();
	}
}
