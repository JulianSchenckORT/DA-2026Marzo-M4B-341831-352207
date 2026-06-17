package ort.da.obligatoriodiseno.dtos;

import java.time.LocalDate;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class ApuestaJugadorDto {
    private LocalDate fecha;
    private int numeroCarrera;
    private String nombreCarrera;
    private int numeroCaballo;
    private String nombreCaballo;
    private double montoApostado;
    private String tipoApuesta;
    private double dividendoFinal;
    private double montoCobrado;
    private String estado;
}
