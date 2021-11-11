package paneracheese;

public class Order {
    
    private String name;
    private String order;
    private String time;
    
    public Order (String cusName, String ord, String ordTime){
        
        name = cusName;
        order = ord;
        time = ordTime;
        
    }
    
    public String getOrderInfo(){
    
        return String.format("%-10s\t%-15s\t%s\n", name, order, time);
        
    }
    
    public String getName(){
        
        return name;
        
    }
}
