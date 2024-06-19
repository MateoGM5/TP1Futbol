import java.util.LinkedList;
import javax.swing.JOptionPane;

public class GestorEquipos {

    private LinkedList<Equipo> equipos;
    private LinkedList<Partido> partidos = new LinkedList<>();

    public GestorEquipos(LinkedList<Equipo> equipos) {
        this.equipos = equipos;
    }

    public LinkedList<Equipo> getEquipos() {
        return equipos;
    }

    public void setEquipos(LinkedList<Equipo> equipos) {
        this.equipos = equipos;
    }

    public LinkedList<Partido> getPartidos() {
        return partidos;
    }

    public void setPartidos(LinkedList<Partido> partidos) {
        this.partidos = partidos;
    }

    @Override
    public String toString() {
        return "GestorEquipos [equipos=" + equipos + "]";
    }

    public void agregarEquipo(Equipo equipo) {
        equipos.add(equipo);
    }

    public void removerEquipo(Equipo equipo) {
        equipos.remove(equipo);
    }

    public int cantidadDeEquipos() {
        return equipos.size();
    }

    public LinkedList<Equipo> listaEquipo() {
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

    public String jugarPartido() {
        if (equipos.size() < 2) {
            return "No hay suficientes equipos para jugar un partido.";
        }

        Equipo equipo1 = seleccionarEquipo("Seleccione el primer equipo");
        Equipo equipo2 = seleccionarEquipo("Seleccione el segundo equipo");

        if (equipo1 == null || equipo2 == null || equipo1 == equipo2) {
            return "Error. Uno o ambos equipos no existen o son el mismo.";
        }

        String fase = determinarFase(equipos.size());

        JOptionPane.showMessageDialog(null, "Va a comenzar el partido entre " + equipo1.getNombre() + " y " + equipo2.getNombre() + " (Fase: " + fase + ")");

        int resultadoEquipo1 = (int) (Math.random() * 6 + 1);
        int resultadoEquipo2 = (int) (Math.random() * 6 + 1);

        JOptionPane.showMessageDialog(null, "Resultado del primer tiempo: " + equipo1.getNombre() + " " + resultadoEquipo1 + " - " + equipo2.getNombre() + " " + resultadoEquipo2);

        JOptionPane.showMessageDialog(null, "Comienza el segundo tiempo.");
        resultadoEquipo1 += (int) (Math.random() * 3);
        resultadoEquipo2 += (int) (Math.random() * 3);
        JOptionPane.showMessageDialog(null, "Resultado final del partido: " + equipo1.getNombre() + " " + resultadoEquipo1 + " - " + resultadoEquipo2 + " " + equipo2.getNombre());

        if (resultadoEquipo1 == resultadoEquipo2) {
            JOptionPane.showMessageDialog(null, "Empate en el tiempo regular. Se juega tiempo extra");
            int resultadoEquipo1TE = (int) (Math.random() * 6);
            int resultadoEquipo2TE = (int) (Math.random() * 6);
            resultadoEquipo1 += resultadoEquipo1TE;
            resultadoEquipo2 += resultadoEquipo2TE;
            JOptionPane.showMessageDialog(null, "Resultado final del partido después del tiempo extra: " + equipo1.getNombre() + " " + resultadoEquipo1 + " - " + equipo2.getNombre() + " " + resultadoEquipo2);
        }

        if (resultadoEquipo1 == resultadoEquipo2) {
            JOptionPane.showMessageDialog(null, "Empate en el tiempo extra. Hay penales.");
            int penalesEquipo1 = 0;
            int penalesEquipo2 = 0;

            while (penalesEquipo1 == penalesEquipo2) {
                penalesEquipo1 = (int) (Math.random() * 6);
                penalesEquipo2 = (int) (Math.random() * 6);
                JOptionPane.showMessageDialog(null, "Resultado final después de los penales: " + equipo1.getNombre() + " " + resultadoEquipo1 + " (" + penalesEquipo1 + ") - " + resultadoEquipo2 + " (" + penalesEquipo2 + ") " + equipo2.getNombre());
            }

            resultadoEquipo1 += penalesEquipo1;
            resultadoEquipo2 += penalesEquipo2;
        }

        String ganador;
        Equipo equipoGanador;
        Equipo equipoPerdedor;

        if (resultadoEquipo1 > resultadoEquipo2) {
            ganador = equipo1.getNombre();
            equipoGanador = equipo1;
            equipoPerdedor = equipo2;
        } else {
            ganador = equipo2.getNombre();
            equipoGanador = equipo2;
            equipoPerdedor = equipo1;
        }

        Partido partido = new Partido(equipo1, equipo2, resultadoEquipo1, resultadoEquipo2, fase);
        partidos.add(partido);

        removerEquipo(equipoPerdedor);

        return equipo1.getNombre() + " " + resultadoEquipo1 + " - " + resultadoEquipo2 + " " + equipo2.getNombre() + "\nEl ganador del partido es: " + ganador + "\nEl equipo " + equipoPerdedor.getNombre() + " ha sido eliminado.";
    }

    private Equipo seleccionarEquipo(String mensaje) {
        String[] equiposArray = new String[equipos.size()];
        for (int i = 0; i < equipos.size(); i++) {
            equiposArray[i] = equipos.get(i).getNombre();
        }
        int opcion = JOptionPane.showOptionDialog(null, mensaje, null, 0, 0, null, equiposArray, equiposArray[0]);

        if (opcion == -1) {
            return null;
        }

        return equipos.get(opcion);
    }

    private String determinarFase(int equiposRestantes) {
        if (equiposRestantes >= 5 && equiposRestantes <= 8) {
            return "Cuartos de Final";
        } else if (equiposRestantes >= 3 && equiposRestantes <= 4) {
            return "Semifinal";
        } else if (equiposRestantes == 2) {
            return "Final";
        } else {
            return "Fase de Grupos";
        }
    }

    public String verPartidosJugados() {
        if (partidos.isEmpty()) {
            return "No se han jugado partidos todavía.";
        }

        StringBuilder mensaje = new StringBuilder("Partidos jugados:\n");
        for (Partido partido : partidos) {
            mensaje.append(partido).append("\n");
        }
        return mensaje.toString();
    }
}
