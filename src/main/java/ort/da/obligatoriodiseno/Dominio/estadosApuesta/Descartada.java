package ort.da.obligatoriodiseno.Dominio.estadosApuesta;
import ort.da.obligatoriodiseno.Dominio.Apuesta;
import ort.da.obligatoriodiseno.Dominio.EstadoApuesta;
import ort.da.obligatoriodiseno.Dominio.Jugador;
public class Descartada implements EstadoApuesta {

    @Override
    public void confirmar(Apuesta apuesta) {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'confirmar'");
    }

    @Override
    public void descartar(Apuesta apuesta) {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'descartar'");
    }

    @Override
    public void Pagar(double ganancias,Jugador jugador) {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'Pagar'");
    }
}
