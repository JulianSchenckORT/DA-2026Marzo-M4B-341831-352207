package ort.da.obligatoriodiseno.eventos;

public class EventoSistema {
    private String tipo;
    private Object datos;

    public EventoSistema(String tipo, Object datos) {
        this.tipo = tipo;
        this.datos = datos;
    }

    public String getTipo() {
        return tipo;
    }

    public Object getDatos() {
        return datos;
    }
}
