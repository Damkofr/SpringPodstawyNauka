package pl.javasolution.implementation;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Component;
import pl.javasolution.api.IPizza;

@Component
public class NewPizza implements IPizza {

    int price;
    String name;

    public NewPizza(@Value("#{pizza.getPrice()}") int price, @Value("#{pizza.getName().toUpperCase()}") String name) {
        this.price = price;
        this.name = name;
    }


    public int getPrice() {
        return price;
    }

    public String getName() {
        return name;
    }
}
