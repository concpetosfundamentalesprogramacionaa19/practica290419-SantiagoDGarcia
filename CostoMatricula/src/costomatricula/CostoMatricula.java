package costomatricula;
import datos.*;
import java.util.Scanner;
/**
 *
 * @author Sant Garcia
 */
public class CostoMatricula {
    public static void main(String[] args) {
        
        Scanner entrada = new Scanner (System.in);
        System.out.println("      Costo Base a Pagar de la Matrícula    ");
        
        
        double costo_b = Datos.costo_base;
        int edad;
        
        double descuento1, descuento2, descuento3, descuento4, resta_desc1;
        double costoF, costoF2, cargaf2, ndescuento4;
        String ubic, estado, cargaf;
        
        System.out.println("Descuento Adicional");
        
        // Desarollo
        // Descuento por Ubicacion
        System.out.println(Datos.m1);
        ubic = entrada.next();//se pide la ubicacion del estudiante

        
        if (ubic.equals ("loja") || ubic.equals ("Loja") || ubic.equals ("Zamora") || ubic.equals ("zamora")) {
            
            descuento1 = Datos.ubicacion*costo_b;
            System.out.println("Decuento por Ubicacion: 20%");
 
        }else{
            descuento1 = 0;
        }
        
        
        // Descuento por Edad
        System.out.println(Datos.m2);
        edad = entrada.nextInt();//se determina la edad del estudiante para 
                                 //realizar el descuento

        if (edad >= 17 && edad <= 20) {
            
            descuento2 = Datos.edad*costo_b;
            System.out.println("Decuento por Edad: 10%");
 
        }else{
            descuento2 = 0;
        }
        
        // Descuento por Estado Civil
        System.out.println(Datos.m3);
        estado = entrada.next();//se determina el Estado Civil del estudiante

        
        if (estado.equals ("casado") || estado.equals ("Casado")) {
            
            descuento3 = Datos.est_civil*costo_b;
            System.out.println("Decuento por Estado Civil:  5%");
 
        }else{
            descuento3 = 0;
        }
        
        // Descuento por Carga Familiar
        System.out.println(Datos.m4);
        cargaf = entrada.next();//se determina si el estudiante posee cargas 
                                //familiares

        
        if (cargaf.equals ("si") || cargaf.equals ("Si")) {
            
            System.out.println("Cantidad");
            cargaf2 = entrada.nextFloat();
            
           
            descuento4 = Datos.carg*costo_b;
            
 
        }else{
            descuento4 = 0;
        }
        
        costoF = costo_b-descuento1-descuento2-descuento3-descuento4;
        costoF2 = costoF*Datos.carg_ad;
        
        System.out.println("Costo a Pagar:"+costoF2);
    }
    
}
