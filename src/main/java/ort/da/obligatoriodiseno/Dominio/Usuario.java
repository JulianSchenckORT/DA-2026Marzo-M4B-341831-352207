package ort.da.obligatoriodiseno.Dominio;
import lombok.Getter;
import lombok.Setter;
@Getter
	@Setter
public abstract class Usuario {
	private String username;
	private String password;
	private String nombre;

	public Usuario() {
	}

	public Usuario(String username, String password, String nombre) {
		this.username = username;
		this.password = password;
		this.nombre = nombre;
	}

	public boolean esPasswordDe(String username, String password) {
		return this.username.equals(username) && this.password.equals(password);
	}

}
