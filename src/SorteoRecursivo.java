import java.util.ArrayList;
import java.util.Random;

public class SorteoRecursivo {
    public String emparejarEquipos(ArrayList<String> equiposArray) {
        if (equiposArray.size() == 2) {  // Caso base: Si quedan solo dos equipos, se emparejan entre sí
            return ("Emparejamiento: " + equiposArray.getFirst() + " vs " + equiposArray.getLast());
        } else {
            //Instancia de la clase Random para seleccinar equipos de forma aleatoria
            Random random = new Random();

            //Tomando el primer equipo del array de forma aleatoria
            int index1 = random.nextInt(equiposArray.size());
            String team1 = equiposArray.get(index1);
            equiposArray.remove(index1);  // Remueve el quipo para evitar duplicados

            //Tomando el segundo equipo del array de forma aleatoria
            int index2 = random.nextInt(equiposArray.size());
            String team2 = equiposArray.get(index2);
            equiposArray.remove(index2);  // Remueve el equipo para evitar duplicados

            //Llamada recursiva para emparejar los demas equipos
            return ("Emparejamiento: " + team1 + " vs " + team2 + "\n" + emparejarEquipos(equiposArray));
        }
    }
}
