package ort.da.obligatoriodiseno.Dominio.formaDeApostar;

import ort.da.obligatoriodiseno.Dominio.FormaDeApostar;

public class Super extends FormaDeApostar {
	@Override
	
public double calcularPago(double monto, double dividendo,double total) {
    if (dividendo >= 2) {
        return monto * dividendo * 3;
    } else {
        return monto * dividendo * 4;
    }
}
public double calcularCosto(double monto) {
	return monto * 2;


}
}
