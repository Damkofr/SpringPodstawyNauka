package pl.javasolution.app;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import pl.javasolution.api.IKucharz;
import pl.javasolution.config.AppConfig;

public class App {
    public static void main(String[] args) {
        AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(AppConfig.class);
        IKucharz k = (IKucharz) context.getBean("kucharz");
        k.pobierzSkładnikiZMagazynu();
        k.przygotujPizze();
        k.wydajPizze();
        IKucharz pomocnik = (IKucharz) context.getBean("pomocnikKucharza");
        pomocnik.wydajPizze();
        pomocnik.przygotujPizze();

    }
}
