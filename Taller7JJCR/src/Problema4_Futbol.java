
import java.util.Scanner;

/***
 * Problema 4
 * 
 * Generar una solución que permita ingresar jugadores de fútbol; por cada 
 * jugador se debe solicitar:

 * Nombre el jugador
 * Posición en el campo de juego
 * Edad
 * Estatura
 * El ciclo de ingreso de información deberá terminar cuando el usuario lo decida. Se debe imprimir el siguiente reporte (usar una cadena de acumulación):

 * Listado de Jugadores
1. Alexander Dominguez -Arquero-, edad 32, estatura 1.95
2. Xavier Arreaga -Defensa-, edad 24, estatura 1.85
3. Moisés Caicedo -Mediocentro-, edad 19, estatura 1.88
4. Ángel Mena -Delantero-, edad 32, estatura 1.75
5. Michael Estrada -Delantero-, edad 27, estatura 1.93
Promedio de edades:  26.8
Promedio de estaturas: 1.87
 * @author Juan Jose
 */
public class Problema4_Futbol {
    public static void main(String[] args) {
        Scanner tcl = new Scanner(System.in);
        
        String ljugadores = "", reporte = "Listado de jugadores"; 
        int cont = 1, sumaedad =0; 
        int totaledad = 0; 
        double totalestatura = 0, sumaestatura = 0; 
        int njugadores = 0; 

        while (true) {
            System.out.println("Ingrese datos del jugador #" + cont);

            System.out.print("Ingresa el nombre del jugador: ");
            String nombre = tcl.nextLine();
            System.out.print("Ingresa la posicion de juego: ");
            String posicion = tcl.nextLine();
            System.out.print("Ingresa la edad del jugador: ");
            int edad = tcl.nextInt();
            System.out.print("Ingresa la estatura del jugador (en metros): ");
            double estatura = tcl.nextDouble();

            ljugadores += cont + ". " + nombre + " -" + posicion + "-, edad " + edad + ", estatura " + estatura + "\n";

            totaledad += edad;
            totalestatura += estatura;
            njugadores++; 
            
            cont++; 
            
            System.out.print("Desea ingresar otro jugador (si/no): ");
            String respuesta = tcl.nextLine(); 
            tcl.nextLine();
            if (respuesta.equals("No") || respuesta.equals("no")) {
                break;
            }
        }
        totaledad = (int) ((cont - 1> 0) ?
                sumaedad / (cont - 1.0) : 0);
        totalestatura = (cont - 1 > 0)?
                sumaestatura / (cont - 1.0) : 0;
        
        reporte +=String.format("Promedio de edades: %.0f/n", totaledad);
        reporte += String.format("Promedio de estatura: %2f/n", totalestatura);
        System.out.println(reporte);
    }
}
/***
 * run:
 * Ingrese datos del jugador #1
 * Ingresa el nombre del jugador: Alexander Dominguez
 * Ingresa la posicion de juego: Arquero
 * Ingresa la edad del jugador: 32
 * Ingresa la estatura del jugador (en metros): 1,95
 * Desea ingresar otro jugador (si/no): si
 * Ingrese datos del jugador #2
 * Ingresa el nombre del jugador: Xavier Arreaga
 * Ingresa la posicion de juego: Defensa
 * Ingresa la edad del jugador: 24
 * Ingresa la estatura del jugador (en metros): 1,85
 * Desea ingresar otro jugador (si/no): si
 * Ingrese datos del jugador #3
 * Ingresa el nombre del jugador: Moisés Caicedo
 * Ingresa la posicion de juego: Mediocentro
 * Ingresa la edad del jugador: 19
 * Ingresa la estatura del jugador (en metros): 1,88
 * Desea ingresar otro jugador (si/no): si
 * Ingrese datos del jugador #4
 * Ingresa el nombre del jugador: Ángel Mena
 * Ingresa la posicion de juego: Delantero
 * Ingresa la edad del jugador: 32
 * Ingresa la estatura del jugador (en metros): 1,75
 * Desea ingresar otro jugador (si/no): si
 * Ingrese datos del jugador #5
 * Ingresa el nombre del jugador: Michael Estrada
 * Ingresa la posicion de juego:  Delantero
 * Ingresa la edad del jugador: 27
 * Ingresa la estatura del jugador (en metros): 1,93
 * Desea ingresar otro jugador (si/no): no
 * Listado de jugadores
 * 1. Alexander Dominguez -Arquero-, edad 32, estatura 1.95
 * 2. Xavier Arreaga -Defensa-, edad 24, estatura 1.85
 * 3. Moisés Caicedo -Mediocentro-, edad 19, estatura 1.88
 * 4. Ángel Mena -Delantero-, edad 32, estatura 1.75
 * 5. Michael Estrada -Delantero-, edad 27, estatura 1.93
 * Promedio de edades:  27
 * Promedio de estaturas: 1.87
 * BUILD STOPPED (total time: 3 minutes 7 seconds)
 */