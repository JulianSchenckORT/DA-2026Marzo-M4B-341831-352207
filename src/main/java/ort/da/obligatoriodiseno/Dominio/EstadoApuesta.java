package ort.da.obligatoriodiseno.Dominio;
public interface  EstadoApuesta {
    void confirmar(Apuesta apuesta);
    void descartar(Apuesta apuesta);
    void Pagar(double ganancias,Jugador jugador);
}
