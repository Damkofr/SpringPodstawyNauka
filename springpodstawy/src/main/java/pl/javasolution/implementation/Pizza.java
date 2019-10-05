package pl.javasolution.implementation;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.beans.factory.config.ConfigurableBeanFactory;
import org.springframework.context.annotation.PropertySource;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;
import pl.javasolution.api.IPizza;

@PropertySource("classpath:ceny.properties")
@Scope(ConfigurableBeanFactory.SCOPE_PROTOTYPE)
@Component
public class Pizza implements IPizza {

    private int price;
    private String name;

    public Pizza(@Value("${cena_wiejskiej}")int price, @Value("${nazwa}") String name) {
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
