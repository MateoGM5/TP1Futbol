import java.util.LinkedList;

import javax.swing.JOptionPane;

public class Main {

	public static void main(String[] args) {
		
		  LinkedList<Equipo> equipos = new LinkedList<>();
	        GestorEquipos gestor = new GestorEquipos(equipos);
	        
	        // Crear equipos y jugadores predefinidos
	        Equipo equipo1 = new Equipo("Real Madrid", "Madrid", new LinkedList<>());
	        Equipo equipo2 = new Equipo("Barcelona", "Barcelona", new LinkedList<>());
	        Equipo equipo3 = new Equipo("Boca", "La Boca", new LinkedList<>());
	        Equipo equipo4 = new Equipo("River", "Núñez", new LinkedList<>());

	        // COMENTAR ESTO SI QUERES AGREGAR LOS NOMBRES DE LOS JUGADORES - ESTO ES PARA HACER LOS JUGADORES AL AZAR
	        // Agregar jugadores al equipo 1 (Real Madrid)
	        for (int i = 1; i <= 18; i++) {
	            equipo1.agregarJugador(new Jugador("Jugador " + i, "Posición " + i, String.valueOf(i), 20 + i));
	        }
	        // Agregar jugadores al equipo 2 (Barcelona)
	        for (int i = 1; i <= 18; i++) {
	            equipo2.agregarJugador(new Jugador("Jugador " + (i + 18), "Posición " + i, String.valueOf(i), 20 + i));
	        }
	        
	     // Agregar jugadores al equipo 3 (Boca)
	        equipo3.agregarJugador(new Jugador("Sergio Romero", "Arquero", "1", 37));
	        equipo3.agregarJugador(new Jugador("Marcelo Saracchi", "Defensor", "3", 26));
	        equipo3.agregarJugador(new Jugador("Lautaro Di Lollo", "Defensor", "40", 20));
	        equipo3.agregarJugador(new Jugador("Cristian Lema", "Defensor", "2", 34));
	        equipo3.agregarJugador(new Jugador("Lautaro Blanco", "Defensor", "23", 25));
	        equipo3.agregarJugador(new Jugador("Vicente Taborda", "Mediocampista", "39", 22));
	        equipo3.agregarJugador(new Jugador("Guillermo Fernández", "Mediocampista", "8", 32));
	        equipo3.agregarJugador(new Jugador("Cristian Médina", "Mediocampista", "36", 21));
	        equipo3.agregarJugador(new Jugador("Ezequiel Férnandez", "Mediocampista", "21", 21));
	        equipo3.agregarJugador(new Jugador("Edinson Cavani", "Delantero", "10", 37));
	        equipo3.agregarJugador(new Jugador("Miguel Merentiel", "Delantero", "16", 28));
	        
	     // Agregar jugadores al equipo 4 (River)
	        equipo4.agregarJugador(new Jugador("Franco Armani", "Arquero", "1", 37));
	        equipo4.agregarJugador(new Jugador("Agustín Santanna", "Defensor", "27", 26));
	        equipo4.agregarJugador(new Jugador("Leandro González Pirez", "Defensor", "14", 32));
	        equipo4.agregarJugador(new Jugador("Paulo Díaz", "Defensor", "17", 29));
	        equipo4.agregarJugador(new Jugador("Milton Casco", "Defensor", "20", 36));
	        equipo4.agregarJugador(new Jugador("Rodrigo Aliendro", "Mediocampista", "29", 33));
	        equipo4.agregarJugador(new Jugador("Rodrigo Villagra", "Mediocampista", "23", 23));
	        equipo4.agregarJugador(new Jugador("Ezequiel Barco", "Mediocampista", "21", 25));
	        equipo4.agregarJugador(new Jugador("Claudio Echeverri", "Mediocampista", "19", 18));
	        equipo4.agregarJugador(new Jugador("Facundo Colidio", "Delantero", "11", 24));
	        equipo4.agregarJugador(new Jugador("Miguel Borja", "Delantero", "9", 31));

	        gestor.agregarEquipo(equipo1);
	        gestor.agregarEquipo(equipo2);
	        gestor.agregarEquipo(equipo3);
	        gestor.agregarEquipo(equipo4);
	        
	        boolean activo = true;

	        while (activo) {
	            String[] opciones = {"Agregar Equipo", "Agregar Jugador", "Buscar Jugador", "Eliminar Equipo", "Mostrar Equipos", "Jugar Partido", "Salir"};
	            int opcion = JOptionPane.showOptionDialog(null, "Selecciona una opción", "Torneillo de fútbol",
	                    JOptionPane.DEFAULT_OPTION, JOptionPane.INFORMATION_MESSAGE, null, opciones, opciones[0]);

	            switch (opcion) {
	            // Agregar Equipo
	            case 0: 
	                    String nombreEquipo = JOptionPane.showInputDialog("Nombre del equipo:");
	                    String ciudad = JOptionPane.showInputDialog("Ciudad del equipo:");
	                    Equipo nuevoEquipo = new Equipo(nombreEquipo, ciudad, new LinkedList<Jugador>());
	                    gestor.agregarEquipo(nuevoEquipo);
	                    JOptionPane.showMessageDialog(null, "Equipo agregado con éxito.");
	                    break;
	                    // Agregar Jugador
	                case 1: 
	                    String nombreJugador = JOptionPane.showInputDialog("Nombre del jugador:");
	                    String posicion = JOptionPane.showInputDialog("Posición del jugador:");
	                    String numeroCamiseta = JOptionPane.showInputDialog("Número de camiseta:");
	                    int edad = Integer.parseInt(JOptionPane.showInputDialog("Edad del jugador:"));

	                    Jugador nuevoJugador = new Jugador(nombreJugador, posicion, numeroCamiseta, edad);

	                    String equipoParaJugador = JOptionPane.showInputDialog("Nombre del equipo para el jugador:");
	                    Equipo equipoEncontrado = gestor.buscarEquipo(equipoParaJugador);
	                    if (equipoEncontrado != null) {
	                        equipoEncontrado.agregarJugador(nuevoJugador);
	                        JOptionPane.showMessageDialog(null, "Jugador agregado con éxito al equipo " + equipoParaJugador);
	                    } else {
	                        JOptionPane.showMessageDialog(null, "Equipo no encontrado.");
	                    }
	                    break;
	                    // Buscar Jugador
	                case 2: 
	                    String nombreJugadorBuscar = JOptionPane.showInputDialog("Nombre del jugador a buscar:");
	                    boolean jugadorEncontrado = false;
	                    for (Equipo equipo : gestor.listaEquipo()) {
	                        Jugador jugador = equipo.buscarJugador(nombreJugadorBuscar);
	                        if (jugador != null) {
	                            JOptionPane.showMessageDialog(null, "Jugador encontrado: " + jugador + " Equipo: "+ equipo.getNombre());
	                            jugadorEncontrado = true;
	                            break;
	                        }
	                    }
	                    if (!jugadorEncontrado) {
	                        JOptionPane.showMessageDialog(null, "Jugador no encontrado.");
	                    }
	                    break;
	                    // Eliminar Equipo
	                case 3: 
	                    String nombreEquipoEliminar = JOptionPane.showInputDialog("Nombre del equipo a eliminar:");
	                    Equipo equipoEliminar = gestor.buscarEquipo(nombreEquipoEliminar);
	                    if (equipoEliminar != null) {
	                        gestor.removerEquipo(equipoEliminar);
	                        JOptionPane.showMessageDialog(null, "Equipo eliminado con éxito.");
	                    } else {
	                        JOptionPane.showMessageDialog(null, "Equipo no encontrado.");
	                    }
	                    break;
	                    // Mostrar Equipos
	                case 4: 
	                	 String[] listaEquipos = new String[gestor.getEquipos().size()];
	                     int i = 0;
	                     for (Equipo equipo : gestor.getEquipos()) {
	                         listaEquipos[i++] = equipo.getNombre();
	                     }
	                     String equipoSeleccionado = (String) JOptionPane.showInputDialog(null, "Seleccione un equipo",
	                             "Mostrar equipos", JOptionPane.QUESTION_MESSAGE, null, listaEquipos, listaEquipos[0]);
	                     if (equipoSeleccionado != null) {
	                         Equipo equipo = gestor.buscarEquipo(equipoSeleccionado);
	                         StringBuilder jugadores = new StringBuilder("Jugadores de " + equipo.getNombre() + ":\n");
	                         for (Jugador jugador : equipo.getJugadores()) {
	                             jugadores.append(jugador.toString()).append("\n");
	                         }
	                         JOptionPane.showMessageDialog(null, jugadores.toString());
	                     }
	                     break;
	                     // Jugar Partido
	                case 5: 
	                    String equipo1Nombre = JOptionPane.showInputDialog("Nombre del primer equipo:");
	                    String equipo2Nombre = JOptionPane.showInputDialog("Nombre del segundo equipo:");
	                    if (equipo1Nombre != null && equipo2Nombre != null) {
	                        String resultado = gestor.jugarPartido(equipo1Nombre, equipo2Nombre);
	                        JOptionPane.showMessageDialog(null, "Resultado del partido:\n" + resultado);
	                    } else {
	                        JOptionPane.showMessageDialog(null, "Uno o ambos equipos no fueron encontrados.");
	                    }
	                    break;
	                    // Salir
	                case 6: 
	                	activo = false;
	                    break;
	                default:
	                    break;
	            }
	        }
		

	}

}
