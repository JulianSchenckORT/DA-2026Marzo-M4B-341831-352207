package ort.da.obligatoriodiseno.presentadores;

import org.springframework.context.annotation.Scope;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import jakarta.servlet.http.HttpSession;
import ort.da.obligatoriodiseno.utils.*;
import ort.da.obligatoriodiseno.Dominio.Admin;
import ort.da.obligatoriodiseno.excepciones.ApuestaException;
import ort.da.obligatoriodiseno.servicios.fachada.Fachada;


@RestController
@RequestMapping("/login-admin")
@Scope("session")
public class PresentadorLoginAdministrador extends PresentadorLogin<Admin> {

    private final Fachada fachada = Fachada.getInstancia();

    @Override
    protected String siguienteCU() {
        return "admin/tablero-administrador.html";
    }

    @Override
    protected Admin obtenerUsuario(String nombreUsuario, String contrasenia) throws ApuestaException {
        return fachada.loginAdministrador(nombreUsuario, contrasenia);
    }

    @Override
    protected String getLoginPage() {
        return "loginAdmin.html";
    }

    @Override
    protected String getClaveSesion() {
        return "Administrador";
    }

    @PostMapping("/liberar-sesiones")
    public Commands liberarSesiones(HttpSession sesionHttp) {
        fachada.cerrarSesionesAdministradores();
        sesionHttp.invalidate();
        return Command.lista(new Command("mensaje", "Sesiones de administradores liberadas"));
    }
}
