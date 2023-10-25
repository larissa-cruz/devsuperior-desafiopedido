package com.desafio.pedido.services;

import com.desafio.pedido.entities.Order;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class OrderService {

    @Autowired
    ShippingService shippingService;

    public Double total(Order order) {

        Double percentDiscount = order.getDiscount() * 0.01;

        return order.getBasic() - (order.getBasic() * percentDiscount) + shippingService.shipment(order);
    }

}
