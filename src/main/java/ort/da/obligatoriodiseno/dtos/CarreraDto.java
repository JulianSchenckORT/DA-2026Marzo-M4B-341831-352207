package ort.da.obligatoriodiseno.dtos;

import java.time.LocalDate;
import java.time.LocalTime;
import java.util.ArrayList;
import java.util.List;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class CarreraDto {
    private int numero;
    private String nombre;
    private LocalDate fecha;
    private LocalTime horaFin;
    private String estado;
    private int cantidadCaballos;
    private double totalApostado;
    private int cantidadApuestas;
    private List<CaballoParticipanteDto> caballos = new ArrayList<>();
}
