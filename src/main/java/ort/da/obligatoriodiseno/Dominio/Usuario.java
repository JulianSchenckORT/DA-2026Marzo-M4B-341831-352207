package ort.da.obligatoriodiseno.Dominio;
import lombok.Getter;
import lombok.Setter;
@Getter
	@Setter
public abstract class Usuario {
	private String username;
	private String password;
	private String nombre;

	public boolean esPasswordDe(String username, String password) {
		return false;
	}

}
