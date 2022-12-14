package Prefi_2021;

public class Usuario implements Comparable<Usuario>{
	private String nombre;
	private int anioRegistro;
	private String mail;
	
	
	public Usuario(String nombre, int anioRegistro, String mail) {
		this.nombre = nombre;
		this.anioRegistro = anioRegistro;
		this.mail = mail;
	}
	
	
	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	public int getAnioRegistro() {
		return anioRegistro;
	}
	public void setAnioRegistro(int anioRegistro) {
		this.anioRegistro = anioRegistro;
	}
	public String getMail() {
		return mail;
	}
	public void setMail(String mail) {
		this.mail = mail;
	}


	@Override
	public int compareTo(Usuario o) {
		int res = this.getNombre().compareTo(o.getNombre());
		if (res == 0) {
			res = this.getMail().compareTo(o.getMail());
		}
		return res;
	}
	
	
}
