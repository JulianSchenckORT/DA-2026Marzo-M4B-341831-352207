package ort.da.obligatoriodiseno.Dominio.estadosCarrera;

import ort.da.obligatoriodiseno.Dominio.Carrera;
import ort.da.obligatoriodiseno.Dominio.EstadoCarrera;
import ort.da.obligatoriodiseno.Dominio.RegistroParticipacion;

public class Definida implements EstadoCarrera {

    @Override
    public void finalizar(Carrera carrera, RegistroParticipacion caballo) {
        throw new IllegalStateException("Debe abrir y cerrar la carrera antes de finalizarla");
    }

    @Override
    public void abrir(Carrera carrera) {
        carrera.cambiarEstado(new Abierta());
    }

    @Override
    public void cerrar(Carrera carrera) {
        throw new IllegalStateException("Debe abrir la carrera antes de cerrarla");
    }

    @Override
    public void verificarDividendos(Carrera carrera) {
    }
}
