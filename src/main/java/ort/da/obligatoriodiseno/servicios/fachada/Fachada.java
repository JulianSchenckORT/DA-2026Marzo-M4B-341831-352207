package ort.da.obligatoriodiseno.servicios.fachada;
import java.util.Collection;
import java.util.Date;
import java.time.LocalDate;
import ort.da.obligatoriodiseno.Dominio.Admin;
import ort.da.obligatoriodiseno.Dominio.Apuesta;
import ort.da.obligatoriodiseno.Dominio.Carrera;
import ort.da.obligatoriodiseno.Dominio.Jugador;
import ort.da.obligatoriodiseno.Dominio.Usuario;
import ort.da.obligatoriodiseno.dtos.ApuestaEnCursoDto;
import ort.da.obligatoriodiseno.dtos.CarreraDto;
import ort.da.obligatoriodiseno.dtos.TableroAdministradorDto;
import ort.da.obligatoriodiseno.dtos.TableroJugadorDto;
import ort.da.obligatoriodiseno.excepciones.ApuestaException;
import ort.da.obligatoriodiseno.servicios.SistemaUsuarios;
import ort.da.obligatoriodiseno.servicios.SistemaCarrera;

public class Fachada {
private static Fachada instancia;

    private SistemaUsuarios sUsuarios;
    private SistemaCarrera sCarrera;

    private Fachada() {
        sUsuarios = new SistemaUsuarios();
        sCarrera = new SistemaCarrera();
    }

    public static Fachada getInstancia() {
        if (instancia == null) {
            instancia = new Fachada();
        }
        return instancia;
    }

    public Admin loginAdministrador(String nombreUsuario, String contrasenia) throws ApuestaException {
        return sUsuarios.loginAdministrador(nombreUsuario, contrasenia);
    }

    public Jugador loginJugador(String nombreUsuario, String contrasenia) throws ApuestaException {
        return sUsuarios.loginJugador(nombreUsuario, contrasenia);
    }

   public void logout(Usuario usuario) {
		sUsuarios.logout(usuario);
	}

    public Collection<?> getSesionesActivas() {
        return sUsuarios.getSesiones();
    }

	public void cargarjornadaFecha(Date fecha) {

	}

	public Carrera getCarrera(Date fecha, int id) {
		return sCarrera.getCarrera(fecha, id);
	}

    public void cerrarSesionesAdministradores() {
        sUsuarios.cerrarSesionesAdministradores();
    }

    public TableroAdministradorDto obtenerTableroAdministrador() throws ApuestaException {
        return sCarrera.obtenerTableroAdministrador();
    }

    public TableroAdministradorDto obtenerTableroAdministrador(LocalDate fecha) throws ApuestaException {
        return sCarrera.obtenerTableroAdministrador(fecha);
    }

    public TableroAdministradorDto obtenerTableroJornadaAnterior(LocalDate fecha) throws ApuestaException {
        return sCarrera.obtenerTableroJornadaAnterior(fecha);
    }

    public TableroAdministradorDto obtenerTableroJornadaSiguiente(LocalDate fecha) throws ApuestaException {
        return sCarrera.obtenerTableroJornadaSiguiente(fecha);
    }

    public CarreraDto obtenerCarreraParaGestion(LocalDate fecha, int numero) throws ApuestaException {
        return sCarrera.obtenerCarreraParaGestion(fecha, numero);
    }

    public CarreraDto abrirCarrera(LocalDate fecha, int numero) throws ApuestaException {
        return sCarrera.abrirCarrera(fecha, numero);
    }

    public CarreraDto cerrarCarrera(LocalDate fecha, int numero) throws ApuestaException {
        return sCarrera.cerrarCarrera(fecha, numero);
    }

    public CarreraDto finalizarCarrera(LocalDate fecha, int numero, Integer caballoGanador) throws ApuestaException {
        return sCarrera.finalizarCarrera(fecha, numero, caballoGanador);
    }

    public TableroJugadorDto obtenerTableroJugador(Jugador jugador) {
        return sCarrera.obtenerTableroJugador(jugador);
    }

    public Apuesta prepararApuesta(Jugador jugador, int nroCarrera, int nroCaballo, double monto, String tipoApuesta)
            throws ApuestaException {
        return sCarrera.prepararApuesta(jugador, nroCarrera, nroCaballo, monto, tipoApuesta);
    }

    public ApuestaEnCursoDto obtenerApuestaEnCurso(Apuesta apuesta) {
        return sCarrera.obtenerApuestaEnCurso(apuesta);
    }

    public void confirmarApuesta(Jugador jugador, Apuesta apuesta, String contrasenia) throws ApuestaException {
        sCarrera.confirmarApuesta(jugador, apuesta, contrasenia);
    }

    public void descartarApuesta(Jugador jugador, Apuesta apuesta) {
        sCarrera.descartarApuesta(jugador, apuesta);
    }

}
