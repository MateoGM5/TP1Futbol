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
	        Equipo equipo5 = new Equipo("Manchester City", "Manchester", new LinkedList<>());
	        Equipo equipo6 = new Equipo("Arsenal", "Londres", new LinkedList<>());
	        Equipo equipo7 = new Equipo("Milan", "Milano", new LinkedList<>());
	        Equipo equipo8 = new Equipo("Inter", "Milano", new LinkedList<>());

	        // Agregar jugadores al equipo 1 (Real Madrid)
	        equipo1.agregarJugador(new Jugador("Andriy Lunin", "Arquero", "13", 25));
	        equipo1.agregarJugador(new Jugador("Daniel Carvajal", "Defensor", "2", 32));
	        equipo1.agregarJugador(new Jugador("Antonio Rüdiger", "Defensor", "22", 31));
	        equipo1.agregarJugador(new Jugador("Nacho", "Defensor", "6", 34));
	        equipo1.agregarJugador(new Jugador("Ferland Mendy", "Defensor", "23", 28));
	        equipo1.agregarJugador(new Jugador("Federico Valverde", "Mediocampista", "15", 25));
	        equipo1.agregarJugador(new Jugador("Eduardo Camavinga", "Mediocampista", "12", 21));
	        equipo1.agregarJugador(new Jugador("Toni Kroos", "Mediocampista", "8", 34));
	        equipo1.agregarJugador(new Jugador("Jude Bellingham", "Mediocampista", "5", 20));
	        equipo1.agregarJugador(new Jugador("Vinicius", "Delantero", "7", 23));
	        equipo1.agregarJugador(new Jugador("Rodrygo", "Delantero", "11", 23));
	        
	        // Agregar jugadores al equipo 2 (Barcelona)
	        equipo2.agregarJugador(new Jugador("Marc-André ter Stegen", "Arquero", "1", 32));
	        equipo2.agregarJugador(new Jugador("Jules Koundé", "Defensor", "23", 25));
	        equipo2.agregarJugador(new Jugador("Pau Bucarsí", "Defensor", "33", 17));
	        equipo2.agregarJugador(new Jugador("Íñigo Martínez", "Defensor", "5", 33));
	        equipo2.agregarJugador(new Jugador("João Cancelo", "Defensor", "2", 29));
	        equipo2.agregarJugador(new Jugador("Sergi Roberto", "Mediocampista", "20", 32));
	        equipo2.agregarJugador(new Jugador("Ilkay Gündogan", "Mediocampista", "22", 33));
	        equipo2.agregarJugador(new Jugador("Lamine Yamal", "Mediocampista", "27", 16));
	        equipo2.agregarJugador(new Jugador("Fermín López", "Mediocampista", "16", 21));
	        equipo2.agregarJugador(new Jugador("Raphinha", "Mediocampista", "11", 27));
	        equipo2.agregarJugador(new Jugador("Robert Lewandowski", "Delantero", "9", 35));
	        
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
	        
	     // Agregar jugadores al equipo 5 (Manchester City)
	        equipo5.agregarJugador(new Jugador("Stefan Ortega", "Arquero", "18", 31));
	        equipo5.agregarJugador(new Jugador("Kyle Walker", "Defensor", "2", 33));
	        equipo5.agregarJugador(new Jugador("Rúben Dias", "Defensor", "3", 27));
	        equipo5.agregarJugador(new Jugador("Manuel Akanji", "Defensor", "25", 28));
	        equipo5.agregarJugador(new Jugador("Joško Gvardiol", "Defensor", "24", 22));
	        equipo5.agregarJugador(new Jugador("Rodri", "Mediocampista", "16", 27));
	        equipo5.agregarJugador(new Jugador("Bernardo Silva", "Mediocampista", "20", 29));
	        equipo5.agregarJugador(new Jugador("Kevin De Bruyne", "Mediocampista", "17", 32));
	        equipo5.agregarJugador(new Jugador(" Phil Foden", "Mediocampista", "47", 23));
	        equipo5.agregarJugador(new Jugador("Jeremy Doku", "Mediocampista", "11", 21));
	        equipo5.agregarJugador(new Jugador(" Erling Haaland", "Delantero", "9", 23));
	        
	        // Agregar jugadores al equipo 6 (Arsenal)
	        equipo6.agregarJugador(new Jugador("David Raya Martin", "Arquero", "22", 28));
	        equipo6.agregarJugador(new Jugador("Ben White", "Defensor", "4", 26));
	        equipo6.agregarJugador(new Jugador("William Saliba", "Defensor", "2", 23));
	        equipo6.agregarJugador(new Jugador("Gabriel", "Defensor", "6", 26));
	        equipo6.agregarJugador(new Jugador("Takehiro Tomiyasu", "Defensor", "18", 25));
	        equipo6.agregarJugador(new Jugador("Martin Odegaard", "Mediocampista", "8", 25));
	        equipo6.agregarJugador(new Jugador("Thomas Partey", "Mediocampista", "5", 30));
	        equipo6.agregarJugador(new Jugador("Declan Rice", "Mediocampista", "41", 25));
	        equipo6.agregarJugador(new Jugador("Gabriel Martinelli", "Delantero", "11", 22));
	        equipo6.agregarJugador(new Jugador("Kai Havertz", "Delantero", "29", 24));
	        equipo6.agregarJugador(new Jugador("Leandro Trossard", "Delantero", "19", 29));
	        
	     // Agregar jugadores al equipo 7 (Milan)
	        equipo7.agregarJugador(new Jugador("Antonio Mirante", "Arquero", "83", 40));
	        equipo7.agregarJugador(new Jugador("Davide Calabria", "Defensor", "2", 27));
	        equipo7.agregarJugador(new Jugador("Matteo Gabbia", "Defensor", "46", 24));
	        equipo7.agregarJugador(new Jugador("Fikayo Tomor", "Defensor", "23", 26));
	        equipo7.agregarJugador(new Jugador("Theo Hernández", "Defensor", "19", 26));
	        equipo7.agregarJugador(new Jugador("Alessandro Florenzi", "Mediocampista", "42", 33));
	        equipo7.agregarJugador(new Jugador("Tijjani Reijnders", "Mediocampista", "14", 25));
	        equipo7.agregarJugador(new Jugador("Christian Pulisic", "Mediocampista", "11", 25));
	        equipo7.agregarJugador(new Jugador("Ismael Bennacer", "Mediocampista", "4", 26));
	        equipo7.agregarJugador(new Jugador("Rafael Leão", "Mediocampista", "10", 24));
	        equipo7.agregarJugador(new Jugador(" Olivier Giroud", "Delantero", "9", 37));
	       
	     // Agregar jugadores al equipo 8 (Inter)
	        equipo8.agregarJugador(new Jugador("Emil Audero", "Arquero", "77", 27));
	        equipo8.agregarJugador(new Jugador("Yann Bisseck", "Defensor", "31", 23));
	        equipo8.agregarJugador(new Jugador("Francesco Acerbi", "Defensor", "15", 36));
	        equipo8.agregarJugador(new Jugador("Carlos Augusto", "Defensor", "30", 25));
	        equipo8.agregarJugador(new Jugador("Denzel Dumfries", "Mediocampista", "2", 28));
	        equipo8.agregarJugador(new Jugador("Davide Frattesi", "Mediocampista", "16", 24));
	        equipo8.agregarJugador(new Jugador("Nicolò Barella", "Mediocampista", "23", 27));
	        equipo8.agregarJugador(new Jugador("Federico Dimarco ", "Mediocampista", "32", 26));
	        equipo8.agregarJugador(new Jugador("Hakan Calhanoglu", "Mediocampista", "20", 30));
	        equipo8.agregarJugador(new Jugador("Marko Arnautovic", "Delantero", "8", 35));
	        equipo8.agregarJugador(new Jugador("Marcus Thuram", "Delantero", "9", 26));
	       
	        gestor.agregarEquipo(equipo1);
	        gestor.agregarEquipo(equipo2);
	        gestor.agregarEquipo(equipo3);
	        gestor.agregarEquipo(equipo4);
	        gestor.agregarEquipo(equipo5);
	        gestor.agregarEquipo(equipo6);
	        gestor.agregarEquipo(equipo7);
	        gestor.agregarEquipo(equipo8);
	        
	        boolean activo = true;

	        while (activo) {
	            String[] opciones = {"Agregar Equipo", "Agregar Jugador", "Buscar Jugador", "Eliminar Equipo", "Mostrar Equipos", "Jugar Partido","Ver partidos jugados","Salir"};
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

	                	if (equipos.size() < 2) {
	                        JOptionPane.showMessageDialog(null, "No hay suficientes equipos para jugar un partido.");
	                    } else {
	                        String resultado = gestor.jugarPartido();
	                        JOptionPane.showMessageDialog(null, resultado);
	                    }
	                    break;
	                    // Ver los partidos jugados
	                case 6: 
	                	 JOptionPane.showMessageDialog(null, gestor.verPartidosJugados());
	                	
	                    break;
	                case 7:
	                	activo = false;
	                	break;
	                default:
	                    break;
	            }
	        }
		

	}

}
