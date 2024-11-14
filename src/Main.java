
import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

       SorteoRecursivo sorteoRecursivo = new SorteoRecursivo();
        boolean correctoIngreso = false;
        String ronda = "";
        int numeroEquipos = 0;
        Scanner scanner = new Scanner(System.in);

        System.out.println("Bienvenido");
        do {
            try{
                System.out.println("Selecciona el número de equipos para realizar el sorteo");
                System.out.println("- Octavos 16 equipos");
                System.out.println("- Cuartos 8 equipos");
                System.out.println("- Semifinales 4 equipos");
                System.out.println("- Final 2 equipos");
                String entradaUsuario = scanner.nextLine();
                ronda  = entradaUsuario.trim().toLowerCase();

                // Asignación el número de equipos basado en la etapa seleccionada
                switch (ronda){
                    case "octavos":
                        numeroEquipos = 16;
                        correctoIngreso = true;
                        break;
                    case "cuartos":
                        numeroEquipos = 8;
                        correctoIngreso = true;
                        break;
                    case "semifinales":
                        numeroEquipos = 4;
                        correctoIngreso = true;
                        break;
                    case "final":
                        numeroEquipos = 2;
                        correctoIngreso = true;
                        break;
                    default:
                        System.out.println("\nIngrese una de la opciones correctamente por favor\n");
                }
            }
            catch (Exception ex){
                System.out.println("Problema: " + ex.getMessage());
            }
        }
        while(!correctoIngreso);

        System.out.println("Ingresaste: " + ronda + " - total equipos " + numeroEquipos);

        //Se ingresa el nombre de los equipos
        ArrayList<String> equipos = new ArrayList<>(numeroEquipos);

        System.out.println("Ingrese el nombre de los equipos");
        for (int i = 0; i < numeroEquipos; i++){
            System.out.print("Equipo " + (i + 1)  +  ": " );
            String equipo = scanner.nextLine().trim();
            equipos.add(equipo);
        }

        //Se realizar el sorteo y se lo muestra en consola
        System.out.println(sorteoRecursivo.emparejarEquipos(equipos));
    }
}
