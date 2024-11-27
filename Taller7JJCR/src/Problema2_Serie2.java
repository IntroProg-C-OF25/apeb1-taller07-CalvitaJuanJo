/***
 * Problema 2
 *
 * Realizar un programa Java que permita presentar en pantalla la siguiente 
 * secuencia: 5/10, 10/12, 15/14, 20/16, 25/18, 30/20
 * 
 * @author Juan Jose
 */
import java.util.Scanner;

public class Problema2_Serie2 {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
       int contador = 5, limite;
        System.out.print("Dame limite: ");
        limite = teclado.nextInt();
        while (contador <= limite) {
            System.out.print(contador + "/" + ((contador / 5) * 2 + 8) + ", ");
            contador += 5;
        }
        System.out.println("");
    }
}
/***
 * run:
 * Dame limite: 30
 * 5/10, 10/12, 15/14, 20/16, 25/18, 30/20, 
 * BUILD SUCCESSFUL (total time: 1 second)

 */
