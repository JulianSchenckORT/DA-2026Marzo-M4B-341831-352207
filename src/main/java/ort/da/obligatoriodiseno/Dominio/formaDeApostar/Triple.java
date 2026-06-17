package ort.da.obligatoriodiseno.Dominio.formaDeApostar;

import ort.da.obligatoriodiseno.Dominio.FormaDeApostar;

public class Triple extends FormaDeApostar {
	@Override
	public double calcularPago(double monto, double dividendo, double total) {
    if (total < 100000) {
        return monto * dividendo * 2;
    } else {
        return monto * dividendo * 3;
    }
}
	@Override
public double calcularCosto(double monto) {
	return monto * 2;

	}
}
