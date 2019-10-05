package pl.javasolution.aspects;

import org.aspectj.lang.annotation.AfterThrowing;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;

@Aspect
public class KontrolaMagazynu {


    @Before("execution(* pl.javasolution.api.IKucharz.pobierzSkładnikiZMagazynu(..))")
    public void sprawdzSkładnikiMagazynu(){
        System.out.println("Sprawdzam składniki magazynu");
    }

    @AfterThrowing("execution(* pl.javasolution.api.IKucharz.pobierzSkładnikiZMagazynu(..))")
    public void zasygnalizujBrakiWMagazynie(){
        System.out.println("Braki w magazynie");
    }


}
