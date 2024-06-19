public class Jugador {

	private String nombre;
	private String posicion;
	private String numeroCamiseta;
	private int edad;
	
	/*============= CONSTRUCTOR =============*/
	public Jugador(String nombre, String posicion, String numeroCamiseta, int edad) {
		this.nombre = nombre;
		this.posicion = posicion;
		this.numeroCamiseta = numeroCamiseta;
		this.edad = edad;
	}
	
	/*============= GETTERS & SETTERS =============*/
	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public String getPosicion() {
		return posicion;
	}

	public void setPosicion(String posicion) {
		this.posicion = posicion;
	}

	public String getNumeroCamiseta() {
		return numeroCamiseta;
	}

	public void setNumeroCamiseta(String numeroCamiseta) {
		this.numeroCamiseta = numeroCamiseta;
	}

	public int getEdad() {
		return edad;
	}

	public void setEdad(int edad) {
		this.edad = edad;
	}
	
	/*============= TOSTRING =============*/
	@Override
	public String toString() {
		return "Jugador [nombre=" + nombre + ", posicion=" + posicion + ", numeroCamiseta=" + numeroCamiseta + ", edad=" + edad + "]";
	}
}
