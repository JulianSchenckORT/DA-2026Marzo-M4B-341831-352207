package ort.da.obligatoriodiseno.Dominio.estadosCarrera;

import ort.da.obligatoriodiseno.Dominio.Carrera;
import ort.da.obligatoriodiseno.Dominio.EstadoCarrera;
import ort.da.obligatoriodiseno.Dominio.RegistroParticipacion;

public class Finalizada implements EstadoCarrera {

    @Override
    public void finalizar(Carrera carrera, RegistroParticipacion caballo) {
        throw new IllegalStateException("La carrera ya esta finalizada");
    }

    @Override
    public void abrir(Carrera carrera) {
        throw new IllegalStateException("No se puede abrir una carrera finalizada");
    }

    @Override
    public void cerrar(Carrera carrera) {
        throw new IllegalStateException("No se puede cerrar una carrera finalizada");
    }

    @Override
    public void verificarDividendos(Carrera carrera) {
    }
}
