package ort.da.obligatoriodiseno.dtos;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class CarreraFinalizadaDto {
    private int numero;
    private String horaFin;
    private int cantidadCaballos;
    private double totalApostado;
    private double totalPagado;
    private String caballoGanador;
    private double dividendoFinal;
}
