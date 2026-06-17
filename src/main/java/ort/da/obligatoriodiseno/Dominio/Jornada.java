package ort.da.obligatoriodiseno.Dominio;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class Jornada {

	private LocalDate fecha;
	private int contadorCarreras = 0;
	private List<Carrera> listaCarreras = new ArrayList<>();

	public Jornada() {
	}

	public Jornada(LocalDate fecha) {
		this.fecha = fecha;
	}

	public Carrera agregarCarrera(String nombre) {
		contadorCarreras++;
		Carrera carrera = new Carrera(contadorCarreras, nombre, this);
		this.listaCarreras.add(carrera);
		return carrera;
	}

	public Double GetTotalApostado() {
		return listaCarreras.stream().mapToDouble(Carrera::getTotalApostado).sum();
	}

	public double GetTotalPagado() {
		return listaCarreras.stream().mapToDouble(Carrera::getTotalPagado).sum();
	}

	public Double CalcularBalance() {
		return GetTotalApostado() - GetTotalPagado();
	}

	public List<Carrera> GetCarreras() {
		return listaCarreras;
	}

	public Double calcularDividendo() {
		return null;
	}

	public Carrera getCarrera(int id) {
		for (Carrera carrera : listaCarreras) {
			if (carrera.getNumero() == id) {
				return carrera;
			}
		}
		return null;
	}
}
