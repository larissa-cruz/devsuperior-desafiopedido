package com.desafio.pedido.services;

import com.desafio.pedido.entities.Order;
import org.springframework.stereotype.Service;

@Service
public class ShippingService {

    public double shipment(Order order) {

        double totalShip = 0;
        if(order.getBasic() < 100.0) {
            totalShip = 20.0;
        } else if(order.getBasic() >= 100.00 && order.getBasic() < 200.0) {
            totalShip = 12.0;
        } else if(order.getBasic() >= 200.0) {
            totalShip = 0;
        }
        return totalShip;
    }

}
