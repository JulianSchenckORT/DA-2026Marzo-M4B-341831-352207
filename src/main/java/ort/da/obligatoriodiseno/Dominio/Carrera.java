package ort.da.obligatoriodiseno.Dominio;

import java.time.LocalTime;
import java.util.ArrayList;
import java.util.List;
import lombok.Getter;
import lombok.Setter;
import ort.da.obligatoriodiseno.Dominio.estadosCarrera.Definida;
@Getter
    @Setter
public class Carrera {

    
    private Jornada jornada;
    
    private int numero;
    private String nombre;
    private List<RegistroParticipacion> caballos;
    private LocalTime horaFinal;
    private RegistroParticipacion ganador;
    private EstadoCarrera estado;

    public Carrera(int nroCarrera, String nombre, Jornada jornada) {
        this.numero = nroCarrera;
        this.nombre = nombre;
        this.jornada = jornada;
        this.caballos = new ArrayList<>();
        this.estado = new Definida();
        this.horaFinal = null;
        this.ganador = null;
    }

    public void finalizar(RegistroParticipacion caballo) {
        estado.finalizar(this, caballo);
    }

    public void abrir() {
        estado.abrir(this);
    }

    public double getTotalPagado() {
        return 0;
    }

    public void totalApostadoporCaballo(RegistroParticipacion caballo) {

    }

    public double calcularDividendo() {
        return 0;
    }

    public void cambiarEstado(EstadoCarrera estado) {
        this.estado = estado;
    }

    public void setGanador(RegistroParticipacion ganador) {
        this.ganador = ganador;
    }
}
