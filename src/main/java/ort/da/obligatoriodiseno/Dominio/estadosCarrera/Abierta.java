package ort.da.obligatoriodiseno.Dominio.estadosCarrera;

import ort.da.obligatoriodiseno.Dominio.Carrera;
import ort.da.obligatoriodiseno.Dominio.EstadoCarrera;
import ort.da.obligatoriodiseno.Dominio.RegistroParticipacion;

public class Abierta implements EstadoCarrera {

    @Override
    public void finalizar(Carrera carrera, RegistroParticipacion caballo) {
        throw new IllegalStateException("Solo se puede finalizar una carrera cerrada");
    }

    @Override
    public void abrir(Carrera carrera) {
        throw new IllegalStateException("La carrera ya esta abierta");
    }

    @Override
    public void cerrar(Carrera carrera) {
        throw new IllegalStateException("La carrera solo se puede cerrar cuando todos los dividendos son validos");
    }

    @Override
    public void verificarDividendos(Carrera carrera) {
        if (carrera.todosDividendosValidos()) {
            carrera.cambiarEstado(new Estable());
        }
    }
}
