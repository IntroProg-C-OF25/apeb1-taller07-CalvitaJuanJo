/***
 * Problema 3
 * 
 * Realizar un programa Java que permita pedir por teclado el nombre de 5 
 * empleados. Por cada empleado se debe solicitar el nombre, numero de días 
 * trabajados y costo del día trabajo. Calcular el valor a cancelar por la 
 * empresa para cada empleado. Presentar un reporte como el siguiente:

 * Nombre 1	10	$2.5	$25
 * Nombre 2	11	$2	$22
 * Nombre 3	9	$3	$27
 * Nombre 4	5	$4	$20
 * Nombre 5	12	$2	$24
 * 
 * @author Juan Jose
 */
import java.util.Scanner;

public class Problema3_Reporte {
    public static void main(String[] args) {
        Scanner tcl = new Scanner(System.in);
        
        String nombre;
        double costod, diastra, total;

        int cont = 1;

        while (cont <= 5) {
            System.out.print("Ingrese el nombre de Ud.: ");
            nombre = tcl.next(); 
            System.out.print("Ingrese los dias trabajados: ");
            diastra = tcl.nextDouble(); 
            System.out.print("Ingrese el costo del dia: ");
            costod = tcl.nextDouble(); 
            
            total = diastra * costod;
            
            System.out.printf("|%s\t|%s|%s|%s\n", "Nombre", "Dias de Trabajo", "Costo del dia", "Total");
            System.out.printf("| %s\t|   %.2f\t|   %.2f\t|%.2f\t |\n", nombre, diastra, costod, total);

            cont++; 
        }
        tcl.close(); 
    }
}
/***
 * run:
 * Ingrese el nombre de Ud.: Juan 
 * Ingrese los dias trabajados: 10
 * Ingrese el costo del dia: 2,5
 * |Nombre	|Dias de Trabajo|Costo del dia|Total
 * | Juan	|   10,00	|   2,50	|25,00	 |
 * Ingrese el nombre de Ud.: Ramon 
 * Ingrese los dias trabajados: 11
 * Ingrese el costo del dia: 2
 * |Nombre	|Dias de Trabajo|Costo del dia|Total  
 * | Ramon	|   11,00	|   2,00	|22,00	 |
 * Ingrese el nombre de Ud.: Francisco
 * Ingrese los dias trabajados: 9
 * Ingrese el costo del dia: 3
 * |Nombre	|Dias de Trabajo|Costo del dia|Total
 * | Francisco	|   9,00	|   3,00	|27,00	 |
 * Ingrese el nombre de Ud.: Katy
 * Ingrese los dias trabajados: 5
 * Ingrese el costo del dia: 4
 * |Nombre	|Dias de Trabajo|Costo del dia|Total
 * | Katy	|   5,00	|   4,00	|20,00	 |
 * Ingrese el nombre de Ud.: Daniela
 * Ingrese los dias trabajados: 12
 * Ingrese el costo del dia: 2
 * |Nombre	|Dias de Trabajo|Costo del dia|Total
 * | Daniela	|   12,00	|   2,00	|24,00	 |
 * BUILD SUCCESSFUL (total time: 1 minute 0 seconds)

 */