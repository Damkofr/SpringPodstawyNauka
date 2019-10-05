package pl.javasolution.implementation;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Component;
import pl.javasolution.api.IOrder;
import pl.javasolution.api.IPizza;

@Component
@Primary
public class ExclusiveOrder implements IOrder {

    IPizza pizza;

    public ExclusiveOrder(IPizza pizza) {
        this.pizza = pizza;
    }

    public void printOrder() {
        System.out.println("Zamówienie ekskluzywna: "+pizza.getName()+" cena: "+pizza.getPrice());
    }

    public IPizza getPizza() {
        return pizza;
    }

    @Autowired
    public void setPizza(IPizza pizza) {
        this.pizza = pizza;
    }
}
