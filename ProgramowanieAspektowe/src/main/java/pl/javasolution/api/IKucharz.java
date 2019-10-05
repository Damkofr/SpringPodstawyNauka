package pl.javasolution.api;

public interface IKucharz {
    void pobierzSkładnikiZMagazynu();
    void pobierzSkładnikiZMagazynu(int liczbaSkladnikow);
    void przygotujPizze();
    void przygotujPizze(int idPizzy);
    void wydajPizze();
}
