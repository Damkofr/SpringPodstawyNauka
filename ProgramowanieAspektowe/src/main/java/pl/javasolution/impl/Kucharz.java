package pl.javasolution.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import pl.javasolution.api.IKucharz;

public class Kucharz implements IKucharz {




    public void pobierzSkładnikiZMagazynu() {
        System.out.println("Kucharz pobiera składniki");
    }

    public void przygotujPizze() {
        System.out.println("Kucharz przygotowuje pizze");

    }

    public void wydajPizze() {
        System.out.println("Kucharz wydaje pizze");
    }

    public void pobierzSkładnikiZMagazynu(int liczbaSkladnikow) {
        System.out.println("Kucharz pobiera "+liczbaSkladnikow+" składników");
    }

    public void przygotujPizze(int idPizzy) {
        System.out.println("Kucharz przygotowuje pizze o id: "+idPizzy);
    }
}
