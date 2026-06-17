package ort.da.obligatoriodiseno.Dominio;
import java.util.List;
import java.util.ArrayList;
import lombok.Getter;
import lombok.Setter;
import ort.da.obligatoriodiseno.excepciones.ApuestaException;
@Getter
	@Setter
public class Jugador extends Usuario {

	private double Saldo;

	private List<Apuesta> HistorialApuestas;

	private double Ganancias;

	public Jugador() {
		this.HistorialApuestas = new ArrayList<>();
	}

	public Jugador(String username, String password, String nombre, double saldo) {
		super(username, password, nombre);
		this.Saldo = saldo;
		this.HistorialApuestas = new ArrayList<>();
		this.Ganancias = 0;
	}

	public Apuesta apostar(double monto, RegistroParticipacion nroRegistroCaballo, FormaDeApostar formaDeApostar) {
    double costo = formaDeApostar.calcularCosto(monto);

    if (this.Saldo < costo) {
        throw new ApuestaException("Saldo insuficiente para realizar la apuesta");
    }

    Apuesta apuesta = new Apuesta(monto, nroRegistroCaballo, this, formaDeApostar);

    this.Saldo -= costo;

    return apuesta;
}

	public void confirmarApuesta(Apuesta apuesta) {
    apuesta.confirmar();
    this.HistorialApuestas.add(apuesta);
}
	public void descartarApuesta(Apuesta apuesta) {
	apuesta.descartar();
	this.Saldo += apuesta.calcularCosto();
	}

	public double calcularTotalApostado() {
    double total = 0;
    for (Apuesta apuesta : HistorialApuestas) {
        total += apuesta.getMonto();
    }
    return total;
}

}
