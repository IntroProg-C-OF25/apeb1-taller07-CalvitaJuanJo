/***
 * Problema 6
 * 
 * Una empresa de comercialización de computadoras realiza el proceso de venta 
 * haciendo un descuento por tipo de cliente: Si es cliente tipo 1 hay un 
 * descuento del 10% Si es cliente tipo 2 hay un descuento del 20% En caso 
 * que sea otro tipo de cliente, no hay descuento. Generar un proceso que 
 * permita ingresar 7 ventas: por cada venta preguntar los siguiente datos:

 * Nombre del cliente
 * Costo de la computadora (solo se vende una computadora por transacción)
 * Tipo de cliente Presentar el siguiente reporte: Cliente tipo 1, compra 
 * computadora con precio $100
 * @author Juan Jose 
 */

import java.util.Scanner;

public class Problema6_Empresa {
    public static void main(String[] args) {
        Scanner tcl = new Scanner(System.in);
        
        for (int i = 1; i <=7; i++) {
            System.out.print("Orden #" + i);
            System.out.println();
            
            System.out.print("Ingrese el nombre del cliente: ");
            String nombrecliente = tcl.nextLine();
            System.out.print("Ingrese el costo de la computadora: ");
            double costocomputadora = tcl.nextDouble();
            System.out.print("Ingrese el tipo de cliente ( 1 o 2 ): ");
            int tipocliente = tcl.nextInt();
            tcl.nextLine();
            
            double descuento = 0;
            
            if (tipocliente == 1) {
                descuento = 0.10;
            } else if (tipocliente == 2) {
                descuento = 0.20;
            }
            double preciofinal = costocomputadora - (costocomputadora * descuento);
            
            System.out.println("Reporte de venta:");
            System.out.println("Cliente: " + nombrecliente);
            System.out.println("Tipo Cliente: " + tipocliente);
            System.out.println("Costo Computadora: $" + costocomputadora);
            System.out.println("Descuento Aplicado: " + (descuento * 100)+ "%");
            System.out.println("Precio Final con descuento: $" + preciofinal);
            System.out.println();
        }
    }
}
/***
 * run:
 * 
 * Orden #1
 * Ingrese el nombre del cliente: Ramon
 * Ingrese el costo de la computadora: 100
 * Ingrese el tipo de cliente ( 1 o 2 ): 1
 * Reporte de venta:
 * Cliente: Ramon
 * Tipo Cliente: 1
 * Costo Computadora: $100.0
 * Descuento Aplicado: 10.0%
 * Precio Final con descuento: $90.0

 * Orden #2
 * Ingrese el nombre del cliente: Katy
 * Ingrese el costo de la computadora: 2000
 * Ingrese el tipo de cliente ( 1 o 2 ): 2
 * Reporte de venta:
 * Cliente: Katy
 * Tipo Cliente: 2
 * Costo Computadora: $2000.0
 * Descuento Aplicado: 20.0%
 * Precio Final con descuento: $1600.0

 * Orden #3
 * Ingrese el nombre del cliente: Ramon Jr
 * Ingrese el costo de la computadora: 1500
 * Ingrese el tipo de cliente ( 1 o 2 ): 1
 * Reporte de venta:
 * Cliente: Ramon Jr
 * Tipo Cliente: 1
 * Costo Computadora: $1500.0
 * Descuento Aplicado: 10.0%
 * Precio Final con descuento: $1350.0

 * Orden #4
 * Ingrese el nombre del cliente: Francisco
 * Ingrese el costo de la computadora: 5000
 * Ingrese el tipo de cliente ( 1 o 2 ): 2
 * Reporte de venta:
 * Cliente: Francisco
 * Tipo Cliente: 2
 * Costo Computadora: $5000.0
 * Descuento Aplicado: 20.0%
 * Precio Final con descuento: $4000.0

 * Orden #5
 * Ingrese el nombre del cliente: Daniela
 * Ingrese el costo de la computadora: 2500
 * Ingrese el tipo de cliente ( 1 o 2 ): 1
 * Reporte de venta:
 * Cliente: Daniela
 * Tipo Cliente: 1
 * Costo Computadora: $2500.0
 * Descuento Aplicado: 10.0%
 * Precio Final con descuento: $2250.0

 * Orden #6
 * Ingrese el nombre del cliente: Juan
 * Ingrese el costo de la computadora: 3500
 * Ingrese el tipo de cliente ( 1 o 2 ): 2
 * Reporte de venta:
 * Cliente: Juan
 * Tipo Cliente: 2
 * Costo Computadora: $3500.0
 * Descuento Aplicado: 20.0%
 * Precio Final con descuento: $2800.0

 * Orden #7
 * Ingrese el nombre del cliente: Rocky
 * Ingrese el costo de la computadora: 500
 * Ingrese el tipo de cliente ( 1 o 2 ): 1
 * Reporte de venta:
 * Cliente: Rocky
 * Tipo Cliente: 1
 * Costo Computadora: $500.0
 * Descuento Aplicado: 10.0%
 * Precio Final con descuento: $450.0

 * BUILD SUCCESSFUL (total time: 3 minutes 38 seconds)
 */