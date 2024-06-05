import java.util.LinkedList;

import javax.swing.JOptionPane;

public class GestorEquipos {

	
	private LinkedList<Equipo> equipos;

	/*============= CONSTRUCTOR =============*/
	public GestorEquipos(LinkedList<Equipo> equipos) {
		super();
		this.equipos = equipos;
	}

	/*============= GETTERS & SETTERS =============*/
	public LinkedList<Equipo> getEquipos() {
		return equipos;
	}

	public void setEquipos(LinkedList<Equipo> equipos) {
		this.equipos = equipos;
	}

	/*============= TOSTRING =============*/
	@Override
	public String toString() {
		return "GestorEquipos [equipos=" + equipos + "]";
	}
	
	/*============= FUNCIONES =============*/
	
	public void agregarEquipo(Equipo equipo) {
		equipos.add(equipo);
	}
	
	public void removerEquipo(Equipo equipo) {
		equipos.remove(equipo);
	}
	
	
	public int cantidaDeEquipos () {
		return equipos.size();
	}
	
	public LinkedList<Equipo> listaEquipo(){
		return equipos;
	}
	
	public Equipo buscarEquipo(String nombre) {
		for (Equipo equipo : equipos) {
			if (equipo.getNombre().equalsIgnoreCase(nombre)) {
				return equipo;
			} 
		}
		return null;
	}
	
	public String jugarPartido(String nombreEquipo1, String nombreEquipo2) {
		
		Equipo equipo1 = buscarEquipo(nombreEquipo1);
        Equipo equipo2 = buscarEquipo(nombreEquipo2);
		
		int resultadoEquipo1 = (int) (Math.random()*6+1);
		int resultadoEquipo2 = (int) (Math.random()*6+1);
		
		if (resultadoEquipo1==resultadoEquipo2) {
			JOptionPane.showMessageDialog(null, "Empate en el tiempo regular. Se juega tiempo extra");
			int resultadoEquipo1TE = (int) (Math.random()*6);
			int resultadoEquipo2TE = (int) (Math.random()*6);
			resultadoEquipo1+=resultadoEquipo1TE;
			resultadoEquipo2+=resultadoEquipo2TE;	
		}
		
		String ganador = "";
		if (resultadoEquipo1>resultadoEquipo2) { 
			ganador = equipo1.getNombre();
		}else {
			ganador = equipo2.getNombre();
		}
		
		return equipo1.getNombre() + " " + resultadoEquipo1  + " - "  + resultadoEquipo2 + " " + equipo2.getNombre() + "\nEl ganador del partido es: " + ganador;
		
		
		
	}
	 
	
	
	
	
}
