package paneracheese;

import java.util.*;
import java.sql.Timestamp;
import java.util.Date;

class OrderList {
    
    Queue<Order> myQueue = new LinkedList<>();
    
    public void addOrder(){
        
        System.out.println("Enter order description: ");
        Scanner scan = new Scanner(System.in);
        
        String ord = scan.next();
        
        System.out.println("Enter customer name: ");
        Scanner scan1 = new Scanner(System.in);
        
        String name = scan1.next();
        
        Date date = new Date();
        long time = date.getTime();
        Timestamp timest = new Timestamp(time);
        
        Order newOrd = new Order(name, ord, timest.toString());
        myQueue.add(newOrd);
        
    }
    
    public void listOrders(){
       
        System.out.println("Name            Order                             Time");
        System.out.println("----------------------------------------------------------------");
        
        for(Order ord: myQueue)
            System.out.print(ord.getOrderInfo());
        
        if(myQueue.isEmpty())
            System.out.println("No pending orders");
        
    }
    
    public void serveNextOrder(){
        
        Order serving = myQueue.poll();
        
        System.out.println("Now serving..." + serving.getOrderInfo());
        
    }
    
    public void cancelOrder(){
        
        System.out.println("Enter customer name: ");
        Scanner scan = new Scanner(System.in);
        
        String name = scan.next();
        
        Iterator<Order> ordItr = myQueue.iterator();
        
        while(ordItr.hasNext())
        {
            Order ord = ordItr.next();
            if(name.equals(ord.getName()))
            {
                ordItr.remove();
                break;
            }
        }
        
        System.out.printf("%s's order has been removed\n", name);
        
    }
    
}
