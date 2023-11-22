package Clases;
import java.util.Scanner;

import javax.lang.model.element.VariableElement;

public class ClaseRetiro extends ProyectoFinal {
    String nomtrans;
    

    public void Transacciones(){
        System.out.println("Ingrese CBU o Alias para la transferencia ");
        miTeclado();
        System.out.println("Realice una transferencia");
        Dinero();
        
            
        if (Dinero <= getsaldo() ) {
            transacciones = getsaldo();
            System.out.println("╔═════════════════════════════════════════════════════╗"); 
            System.out.println("Se transfirio "+Dinero+" al alias "+miTeclado());

        System.out.println("Su saldo actual es de: "+(getsaldo()-Dinero));
        System.out.println("╚══════════════════════════════════════════════════╝");
        } else {
            System.out.println("╔═════════════════════════════════════════════════════╗");
            System.out.println("La operación no puede realizarse por falta de fondos");
            System.out.println("╚═════════════════════════════════════════════════════╝");
        }
        
        
    }
}
