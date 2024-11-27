
import java.util.Scanner;

/***
 * Problema 5
 * 
 * Generar un programa Java que permita ingresar 4 estudiantes; por cada uno de 
 * ellos ingresar el nombre del estudiante, el promedio de ciclo. Presentar el 
 * siguiente reporte
 * Estudiante1	10	Aprobado
 * Estudiante2	6.9	Reprobado
 * Estudiante3	7	Aprobado
 * Estudiante4	5	Reprobado
 * Atención; con base al valor del promedio, usted debe asignar en cada registro 
 * el tipo Aprobado o Reprobado.
 * @author Juan Jose
 */
public class Problema5_Promedios {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        String nombre, estado;
        double promedio;
        int contador = 1;
        while (contador <= 4) {
            System.out.print("Dame nombre del estudiante y su promedio del EST_" + contador + ": ");
            nombre = teclado.next();
            promedio = teclado.nextDouble();
            if (promedio < 6.5)
                estado = "Reprobado";
            else
                estado = "Aprobado";
            System.out.printf("|%s\t|%s | %s|\n","nombre", "promedio", "estado");
            System.out.printf("| %s\t | %.2f | %s\t|\n", nombre, promedio, estado);
            contador ++;
        }
    }
}
/***
 * run:
 * Dame nombre del estudiante y su promedio del EST_1: juan 5 
 * |nombre |promedio | estado|
 * | juan  | 5,00    | Reprobado|	
 * Dame nombre del estudiante y su promedio del EST_2: pedro 5
 * |nombre | promedio| estado|
 * | pedro |   5,00  | Reprobado| 
 * Dame nombre del estudiante y su promedio del EST_3: angel 3
 * |nombre |promedio | estado|
 * | angel | 3,00    | Reprobado|
 * Dame nombre del estudiante y su promedio del EST_4: chofa 1
 * |nombre |promedio | estado|
 * | chofa | 1,00    | Reprobado|
 * BUILD SUCCESSFUL (total time: 48 seconds)
 */