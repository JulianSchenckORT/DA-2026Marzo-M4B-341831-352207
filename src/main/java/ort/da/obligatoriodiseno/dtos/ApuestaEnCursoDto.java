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
public class ApuestaEnCursoDto {
    private LocalDate fecha;
    private int numeroCarrera;
    private String nombreCarrera;
    private int numeroCaballo;
    private String nombreCaballo;
    private String tipoApuesta;
    private double dividendoActual;
    private double montoApostado;
    private double montoDebitar;
    private double montoPotencial;
}
