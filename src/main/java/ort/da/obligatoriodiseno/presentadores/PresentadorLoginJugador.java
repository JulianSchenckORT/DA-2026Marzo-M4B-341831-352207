package ort.da.obligatoriodiseno.presentadores;

import org.springframework.context.annotation.Scope;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import jakarta.servlet.http.HttpSession;
import ort.da.obligatoriodiseno.Dominio.Jugador;
import ort.da.obligatoriodiseno.excepciones.ApuestaException;
import ort.da.obligatoriodiseno.servicios.fachada.Fachada;
import ort.da.obligatoriodiseno.utils.Commands;

@RestController
@RequestMapping("/login-jugador")
@Scope("session")
public class PresentadorLoginJugador extends PresentadorLogin<Jugador> {

    private final Fachada fachada = Fachada.getInstancia();

    @Override
    @PostMapping("/login")
    public Commands login(HttpSession sesionHttp,
            @RequestParam String usuario,
            @RequestParam String contrasenia) {
        return super.login(sesionHttp, usuario, contrasenia);
    }

    @Override
    @PostMapping("/logout")
    public Commands logout(HttpSession sesionHttp) {
        return super.logout(sesionHttp);
    }

    @Override
    protected String siguienteCU() {
        return "jugador/tablero-jugador.html";
    }

    @Override
    protected Jugador obtenerUsuario(String nombreUsuario, String contrasenia) throws ApuestaException {
        return fachada.loginJugador(nombreUsuario, contrasenia);
    }

    @Override
    protected String getLoginPage() {
        return "login.html";
    }

    @Override
    protected String getClaveSesion() {
        return "Jugador";
    }
}
