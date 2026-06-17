package ort.da.obligatoriodiseno.Dominio.formaDeApostar;
import ort.da.obligatoriodiseno.Dominio.FormaDeApostar;
public class Simple  extends FormaDeApostar {
	@Override
	public double calcularPago(double monto, double dividendo,double total) {
		return monto * dividendo;
	}
	@Override
	public double calcularCosto(double monto) {
		return monto;
	}

}
