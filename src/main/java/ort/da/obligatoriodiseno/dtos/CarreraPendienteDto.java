package ort.da.obligatoriodiseno.dtos;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class CarreraPendienteDto {
    private int numero;
    private String estado;
    private int cantidadCaballos;
    private double totalApostado;
    private int cantidadApuestas;
}
