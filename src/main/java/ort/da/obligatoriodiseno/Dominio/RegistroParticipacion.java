package ort.da.obligatoriodiseno.Dominio;

import java.util.ArrayList;
import java.util.List;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class RegistroParticipacion {

	private double dividendo;
	private int Id;
	private List<Apuesta> listaApuestas;
	private Carrera carrera;
	private Caballo caballo;

	public RegistroParticipacion() {
		this.listaApuestas = new ArrayList<>();
	}

	public RegistroParticipacion(Caballo caballo, int id, Carrera carrera) {
		this();
		this.caballo = caballo;
		this.Id = id;
		this.carrera = carrera;
		this.dividendo = 0;
	}

	public Double calcularDividendo() {
		this.dividendo = carrera.calcularDividendo(0.90, this);
		return dividendo;
	}

	public double getTotalApostado() {
		double total = 0;
		for (Apuesta apuesta : this.listaApuestas) {
			total += apuesta.calcularCosto();
		}
		return total;
	}

	public double calcularPago() {
		return 0;
	}

	public void agregarApuesta(Apuesta apuesta) {
		this.listaApuestas.add(apuesta);
		this.carrera.recalcularDividendos();
	}
}
