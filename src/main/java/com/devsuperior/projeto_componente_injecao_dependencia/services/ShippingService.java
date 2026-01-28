package com.devsuperior.projeto_componente_injecao_dependencia.services;

import com.devsuperior.projeto_componente_injecao_dependencia.entities.Order;
import org.springframework.stereotype.Service;

/**
 * Serviço responsável pelo cáclulo do valor do frete
 * */
@Service
public class ShippingService {

    public Double shipment(Order order) {

        //O valor do frete vai depender do valor básico do pedido (valor sem desconto)
        if (order.getBasic() >= 200.0) {
            return 0.0;
        } else if (order.getBasic() >= 100.0 && order.getBasic() < 200.0) {
            return 12.0;
        } else {
            return 20.0;
        }
    }
}
