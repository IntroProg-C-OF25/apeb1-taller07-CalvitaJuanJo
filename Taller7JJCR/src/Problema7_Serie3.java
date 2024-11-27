/***
 * Problema 7
 * 
 * Generar e imprimir la siguiente serie:
 * sumatoria
 * = -(1/1)+(1/2)-(1/3)+(1/4)-(1/5)+(1/6)-(1/7)+(1/8)-(1/9)+(1/10)
 * @author Juan Jose 
 */
public class Problema7_Serie3 {
    public static void main(String[] args) {
        double sumatoria = 0;
        
        for (int i = 1; i <= 10; i ++) {
            if (i % 2 != 0) {
                sumatoria -= 1.0 / i;
                System.out.print("-(1/" + i + ")");
            } else { 
                sumatoria += 1.0 / i;
                System.out.print("-(1/" + i + ")");
            }
        }
        System.out.println();
        System.out.println("La sumatoria es: " + sumatoria);
        }
    }
/***
 * run:
 * -(1/1)-(1/2)-(1/3)-(1/4)-(1/5)-(1/6)-(1/7)-(1/8)-(1/9)-(1/10)
 * La sumatoria es: -0.6456349206349207
 * BUILD SUCCESSFUL (total time: 0 seconds)
 */
