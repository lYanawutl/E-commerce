package Observer;
import DataModels.*;

/**
 * Interface Observer: ระบบส่งอีเมล
 */

public class EmailService implements OrderObserver {

    @Override
    public void update(Order order) {
        System.out.println("[Eamil Service] Comfirmation email sent to" 
        + order.customerEmail() + "for order: " + order.orderId());
    }
    
}
