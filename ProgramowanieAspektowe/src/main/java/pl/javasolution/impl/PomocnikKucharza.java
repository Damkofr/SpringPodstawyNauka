package pl.javasolution.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import pl.javasolution.api.IKucharz;



public class PomocnikKucharza implements IKucharz {

    @Autowired
    @Qualifier("kucharz")
    private IKucharz kucharz;


    public void pobierzSkładnikiZMagazynu() {
        System.out.println("Pomocnik pobiera składniki z magazynu");
    }

    public void pobierzSkładnikiZMagazynu(int liczbaSkladnikow) {
        System.out.println("Pomocnik pobiera "+liczbaSkladnikow+" składników");
    }

    public void przygotujPizze() {
        System.out.println("Pomocnik przekazuje przygotowanie pizzy do kucharza");
        kucharz.przygotujPizze();
    }

    public void przygotujPizze(int idPizzy) {
        System.out.println("Pomocnik przekazuje przygotowanie pizzy do kucharza od id "+idPizzy);
        kucharz.przygotujPizze(idPizzy);
    }

    public void wydajPizze() {
        System.out.println("Pomocnik wydaje pizze");
    }
}
