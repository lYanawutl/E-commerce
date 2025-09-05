package Observer;
import DataModels.*;

/**
 * Interface (Observer) สำหรับผู้สังเกต
 */

public interface OrderObserver {

    void update(Order order);

}
