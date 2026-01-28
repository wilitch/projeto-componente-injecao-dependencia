package com.devsuperior.projeto_componente_injecao_dependencia.services;

import com.devsuperior.projeto_componente_injecao_dependencia.entities.Order;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * Serviço responsável pelo cálculo do valor total do pedido (valor básico do pedido + valor do frete)
 * */
@Service
public class OrderService {

    @Autowired
    private ShippingService shippingService;

    public Double total(Order order) {
        return order.getBasic()
               //Cálculo do desconto sobre o valor básico
               - (order.getBasic() * (order.getDiscount() / 100.0))
               //Cálculo do valor do frete
               + shippingService.shipment(order);
    }
}
