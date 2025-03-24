abstract class Beverage{
    private void pour(int qty){
        System.out.println("pour"+qty+"ml of beverage");}
        
    abstract void addCondiment();
    
    void stir(){}
    
    private void serve(){
        System.out.println("serve appropreately");}
        
    public void templateMethod(int qty){
        pour(qty);
        addCondiment();
        stir();
        serve();
        
    }
    }
