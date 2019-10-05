package pl.javasolution.aspects;

import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.After;
import org.aspectj.lang.annotation.AfterThrowing;
import org.aspectj.lang.annotation.Around;
import org.aspectj.lang.annotation.Aspect;

@Aspect
public class Komunikacja {

    @After("execution(* pl.javasolution.api.IKucharz.pobierzSkładnikiZMagazynu(..))")
    public void poinformujOPobraniuSkładników(){
        System.out.println("Pobrano składniki");
    }

    @Around("execution(* pl.javasolution.api.IKucharz.wydajPizze(..))")
    public void wydaniePizzy(ProceedingJoinPoint joinPoint){
        try {
            System.out.println("KOMUNIKUJEMY ŻE PIZZA JEST GOTOWA");
            joinPoint.proceed();
            System.out.println("KOMUNIKUJEMY ŻE WYDANO PIZZE");
        } catch (Throwable throwable) {
            throwable.printStackTrace();
        }
    }
}
