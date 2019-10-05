package pl.javasolution.config;

import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.EnableAspectJAutoProxy;
import pl.javasolution.api.IKucharz;
import pl.javasolution.aspects.Komunikacja;
import pl.javasolution.aspects.KontrolaMagazynu;
import pl.javasolution.impl.Kucharz;
import pl.javasolution.impl.PomocnikKucharza;

@Configuration
@EnableAspectJAutoProxy
public class AppConfig {

    @Bean
    @Qualifier("kucharz")
    public IKucharz kucharz(){
        return new Kucharz();
    }

    @Bean
    public IKucharz pomocnikKucharza(){
        return new PomocnikKucharza();
    }

    @Bean
    public Komunikacja komunikacja(){
        return new Komunikacja();
    }

    @Bean
    public KontrolaMagazynu kontrolaMagazynu(){
        return new KontrolaMagazynu();
    }
}
