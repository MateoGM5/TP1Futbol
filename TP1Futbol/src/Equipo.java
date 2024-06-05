import java.util.LinkedList;

public class Equipo {
	
	private String nombre;
	private String ciudad;
	private LinkedList<Jugador> jugadores;
	
	/*============= CONSTRUCTOR =============*/
	public Equipo(String nombre, String ciudad, LinkedList<Jugador> jugadores) {
		super();
		this.nombre = nombre;
		this.ciudad = ciudad;
		this.jugadores = jugadores;
	}

	/*============= GETTERS & SETTERS =============*/
	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public String getCiudad() {
		return ciudad;
	}

	public void setCiudad(String ciudad) {
		this.ciudad = ciudad;
	}

	public LinkedList<Jugador> getJugadores() {
		return jugadores;
	}

	public void setJugadores(LinkedList<Jugador> jugadores) {
		this.jugadores = jugadores;
	}

	/*============= TOSTRING =============*/
	@Override
	public String toString() {
		return "Equipo [nombre=" + nombre + ", ciudad=" + ciudad + ", jugadores=" + jugadores + "]";
	}
	
	/*============= FUNCIONES =============*/
	
	public void agregarJugador(Jugador jugador) {
		jugadores.add(jugador);
	}
	
	public void removerJugador(Jugador jugador) {
		jugadores.remove(jugador);
	}
	
	public Jugador buscarJugador(String nombre) {
		for (Jugador jugador : jugadores) {
			if (jugador.getNombre().equalsIgnoreCase(nombre)) {
				return jugador;
			} 
		}
		return null;
	}
	
	public int cantidadJugadores () {
		return jugadores.size();
	}
	
	public LinkedList<Jugador> listaJugadores(){
		return jugadores;
	}
	 
	

}
