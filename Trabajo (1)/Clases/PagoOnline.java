package Clases;

import java.util.Scanner;

public class PagoOnline extends ProyectoFinal {
  
  public void Transacciones() {
  
    int eleccion = 0;
    int seleccionar = 0;
    String eleccionSN;
    
     do{
    
    System.out.println("╔═════════════════════════════════════════════════════╗");
                System.out.println("Realice su pago online aqui");
                System.out.println("Por favor seleccione una empresa o servicio");

                System.out.println("1.- Luz ");
                System.out.println("2.- Gas");
                System.out.println("3.- Servicio telefonico");
                System.out.println("4.- Tarjetas de credito");
                System.out.println("Por favor ingrese una opción: ");
                System.out.println("╚═════════════════════════════════════════════════════╝");
                    seleccionar = entrada.nextInt();
                    if (seleccionar >= 1 && seleccionar <= 4){
                        eleccion = 1;
                    } else {
                        System.out.println("Opcion no disponible, vuelva a intentarlo nuevamente");
                    }
            System.out.println("Queres realizar otra operacion? (S/N)");
                
           eleccionSN = miTeclado.nextLine();
        
         } while (eleccionSN.equalsIgnoreCase("s"));
                
        
            if (seleccionar == 1){
                System.out.println("Ha seleccionado la opcion del servicio de Luz");
                    System.out.println("Ingrese el monto a pagar: ");
                    Dinero = entrada.nextInt();

                    if (getsaldo() >= Dinero ) {
                        System.out.println("╔══════════════════════════════════════╗");
            
                        System.out.println("El pago se realizo con exito");
                        System.out.println("Su saldo actual es de: "+(getsaldo()-Dinero));
                        System.out.println("╚══════════════════════════════════════╝");
                    } else {
                        System.out.println("▂▂▂▂▂▂▂▂▂▂▂▂▂▂▂▂▂▂▂");
                        System.out.println("Saldo insuficiente");
                        System.out.println("▂▂▂▂▂▂▂▂▂▂▂▂▂▂▂▂▂▂▂");
                    }
            }else if (seleccionar == 2){

                System.out.println("Ha seleccionado la opcion del servicio de Luz");
                    System.out.println("Ingrese el monto a pagar: ");
                    Dinero = entrada.nextInt();

                    if (getsaldo() >= Dinero ) {
                        System.out.println("╔══════════════════════════════════════╗");
            
                        System.out.println("El pago se realizo con exito");
                        System.out.println("Su saldo actual es de: "+(getsaldo()-Dinero));
                        System.out.println("╚══════════════════════════════════════╝");
                    } else {
                        System.out.println("▂▂▂▂▂▂▂▂▂▂▂▂▂▂▂▂▂▂▂");
                        System.out.println("Saldo insuficiente");
                        System.out.println("▂▂▂▂▂▂▂▂▂▂▂▂▂▂▂▂▂▂▂");
                    }

           
            }else if (seleccionar == 3){
                System.out.println("Ha seleccionado la opcion del servicio de Luz");
                    System.out.println("Ingrese el monto a pagar: ");
                    Dinero = entrada.nextInt();

                    if (getsaldo() >= Dinero ) {
                        System.out.println("╔══════════════════════════════════════╗");
            
                        System.out.println("El pago se realizo con exito");
                        System.out.println("Su saldo actual es de: "+(getsaldo()-Dinero));
                        System.out.println("╚══════════════════════════════════════╝");
                    } else {
                        System.out.println("▂▂▂▂▂▂▂▂▂▂▂▂▂▂▂▂▂▂▂");
                        System.out.println("Saldo insuficiente");
                        System.out.println("▂▂▂▂▂▂▂▂▂▂▂▂▂▂▂▂▂▂▂");
                    }
            }else if (seleccionar == 4){
                System.out.println("Ha seleccionado la opcion del servicio de Luz");
                    System.out.println("Ingrese el monto a pagar: ");
                    Dinero = entrada.nextInt();

                    if (getsaldo() >= Dinero ) {
                        System.out.println("╔══════════════════════════════════════╗");
            
                        System.out.println("El pago se realizo con exito");
                        System.out.println("Su saldo actual es de: "+(getsaldo()-Dinero));
                        System.out.println("╚══════════════════════════════════════╝");
                    } else {
                        System.out.println("▂▂▂▂▂▂▂▂▂▂▂▂▂▂▂▂▂▂▂");
                        System.out.println("Saldo insuficiente");
                        System.out.println("▂▂▂▂▂▂▂▂▂▂▂▂▂▂▂▂▂▂▂");
                   
                    }
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    /*Scanner Leer = new Scanner(System.in);
    int op = Leer.nextInt();
            
   
    int eleccion = 0;
    int seleccionar = 0;

        do{
            System.out.println("╔═════════════════════════════════════════════════════╗");
            System.out.println("Realice su pago online aqui");
            System.out.println("Por favor seleccione una empresa o servicio");

            System.out.println("1.- Luz ");
            System.out.println("2.- Gas");
            System.out.println("3.- Servicio telefonico");
            System.out.println("4.- Tarjetas de credito");
            System.out.println("Por favor ingrese una opción: ");
            System.out.println("╚═════════════════════════════════════════════════════╝");
            op = Leer.nextInt();
            
                if (seleccionar >= 1 && seleccionar <= 4){
                    eleccion = 1;
                } else {
                    System.out.println("Opcion no disponible, vuelva a intentarlo nuevamente");
                }
         }while(eleccion == 0);

         //Declaracion de variables
    
    /*int op;*/

   /* //Inicializacion
    op = seleccionar;

    //Estructura de Switch
    switch (op) {
        case (1):

        System.out.println("Ha seleccionado la opcion del servicio de Luz");
                System.out.println("Ingrese el monto a pagar: ");
                Dinero();

                if (getsaldo() <= Dinero ) {
                    System.out.println("╔══════════════════════════════════════╗");
        
                    System.out.println("El pago se realizo con exito");
                    System.out.println("Su saldo actual es de: "+(getsaldo()-Dinero));
                    System.out.println("╚══════════════════════════════════════╝");
                } else {
                    System.out.println("▂▂▂▂▂▂▂▂▂▂▂▂▂▂▂▂▂▂▂");
                    System.out.println("Saldo insuficiente");
                    System.out.println("▂▂▂▂▂▂▂▂▂▂▂▂▂▂▂▂▂▂▂");
           
                }
             break;
       
        case 2:
        System.out.println("Ha seleccionado la opcion del servicio de Luz");
        System.out.println("Ingrese el monto a pagar: ");
        Dinero();

        if (getsaldo() <= Dinero ) {
            System.out.println("╔══════════════════════════════════════╗");

            System.out.println("El pago se realizo con exito");
            System.out.println("Su saldo actual es de: "+(getsaldo()-Dinero));
            System.out.println("╚══════════════════════════════════════╝");
        } else {
            System.out.println("▂▂▂▂▂▂▂▂▂▂▂▂▂▂▂▂▂▂▂");
            System.out.println("Saldo insuficiente");
            System.out.println("▂▂▂▂▂▂▂▂▂▂▂▂▂▂▂▂▂▂▂");
        }
        
          break;
       
               
         case 3:
             
         System.out.println("Ha seleccionado la opcion del servicio de Luz");
         System.out.println("Ingrese el monto a pagar: ");
         Dinero();

         if (getsaldo() <= Dinero ) {
             System.out.println("╔══════════════════════════════════════╗");
 
             System.out.println("El pago se realizo con exito");
             System.out.println("Su saldo actual es de: "+(getsaldo()-Dinero));
             System.out.println("╚══════════════════════════════════════╝");
         } else {
             System.out.println("▂▂▂▂▂▂▂▂▂▂▂▂▂▂▂▂▂▂▂");
             System.out.println("Saldo insuficiente");
             System.out.println("▂▂▂▂▂▂▂▂▂▂▂▂▂▂▂▂▂▂▂");
         } 
            
            break;
        
         case 4:

         System.out.println("Ha seleccionado la opcion del servicio de Luz");
                System.out.println("Ingrese el monto a pagar: ");
                Dinero();

                if (getsaldo() <= Dinero ) {
                    System.out.println("╔══════════════════════════════════════╗");
        
                    System.out.println("El pago se realizo con exito");
                    System.out.println("Su saldo actual es de: "+(getsaldo()-Dinero));
                    System.out.println("╚══════════════════════════════════════╝");
                } else {
                    System.out.println("▂▂▂▂▂▂▂▂▂▂▂▂▂▂▂▂▂▂▂");
                    System.out.println("Saldo insuficiente");
                    System.out.println("▂▂▂▂▂▂▂▂▂▂▂▂▂▂▂▂▂▂▂");
                }

         break;


        default:
        System.out.println("La opcion elegida es incorrecta");
            break;
    }

    //Instruccion de salida
    System.out.println("**El programa ha finalizado**");*/
            
    
  
  }
}
}






































