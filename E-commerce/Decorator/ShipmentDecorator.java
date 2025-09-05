package Decorator;
import FactoryMethod.Shipment;

/**
 * abstract Decorator สำหรับห่อหุ้ม Shipment
 */

public class ShipmentDecorator implements Shipment {
    protected Shipment wrappedShipment;

    public ShipmentDecorator(Shipment wrappedShipment) {
        this.wrappedShipment = wrappedShipment;
    }

    @Override
    public String getInfo() {
        return wrappedShipment.getInfo();
    }

    @Override
    public double getCost() {
        return wrappedShipment.getCost();
    }
    
}
