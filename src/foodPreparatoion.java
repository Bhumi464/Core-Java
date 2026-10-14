class order extends Thread{
    int orderId;
    String foodName;

    order(int orderId, String foodName) {
        this.orderId = orderId;
        this.foodName = foodName;
    }
    
    @Override
    public void run(){
        try {
            System.out.println("Order "+orderId+" : "+foodName+" - Accept the order");
            Thread.sleep(1000);
            System.out.println("Order "+orderId+" : "+foodName+" - Prepare the food");
            Thread.sleep(2000);
            System.out.println("Order "+orderId+" : "+foodName+" - Pack the food");
            Thread.sleep(1000);
            System.out.println("Order "+orderId+" : "+foodName+" - Mark the order as ready for delivery");

        } catch (InterruptedException e) {
            System.out.println("Order " + orderId + " interrupted");
            Thread.currentThread().interrupt();
        }
    }
}

public class foodPreparatoion {
    public static void main(String[] args) {
        order o1 = new order(101, "Pizza");
        order o2 = new order(102, "Burger");
        order o3 = new order(103, "Biryani");

        Thread t1 = new Thread(o1);
        Thread t2 = new Thread(o2);
        Thread t3 = new Thread(o3);

        t1.start();
        t2.start();
        t3.start();
    }
}
