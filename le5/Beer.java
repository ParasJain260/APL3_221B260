class Beer extends Beverages{
    private void pour(){
        System.out.println("Pour 30ml of Beer in a glass");
    }
    
    private void addCondiment(){      
    }
    
    private void stir(){   
    }
    
    private void serve(){
        System.out.println("Serve through waiter-----------");
    }
    
    public final void templateMethod(){
        pour();
        addCondiment();
        stir();
        serve();
    }
}