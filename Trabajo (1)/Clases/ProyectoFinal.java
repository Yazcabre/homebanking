package Clases;
import java.util.*;

/**
 * ProyectoFinal
 */
public class ProyectoFinal {

        int transacciones, Dinero, deposito;
        
        private static int saldo;
        Scanner entrada = new Scanner(System.in);
        /*Scanner Nombres = new Scanner(System.in);*/

        public void Operaciones(){

            int eleccion = 0;
            int seleccion = 0;

            do{
               
            do{
                System.out.println("1.- Datos del usuario"); //Datos usuario
                    System.out.println("2.- Saldo actual"); //Trans
                    System.out.println("3.- Transferencia");//Retiro
                    System.out.println("4.- Pago online");//Pago Online
                    System.out.println("5.- Salir");
                    System.out.println("Por favor ingrese una opción: ");
                    seleccion = entrada.nextInt();

                if (seleccion >= 1 && seleccion <=5){
                    eleccion =1;
                } else {
                    System.out.println("Opcion no disponible, vuelva a intentarlo por favor");
                }


            }while(eleccion == 0);

            if (seleccion == 1){ 

                System.out.println("Bienvenido, usted ha accedido a sus datos, precione una tecla para continuar"); 
                //esperar tecla
        
                System.out.println("╔═════════════════════════════════════╗");
                System.out.println("""
                    Nombre y apellido: Persona Apellido
                    Alias: Hola.Mundo.proyecto
                    Cbu: 038156947814535864985
                    Cuenta Nro: 2745/77 """);
                System.out.println("╚═════════════════════════════════════╝");
                
              //aca iria una opcion de si y no y en caso de ser no la leyenda "por favor extraiga su tarjeta" 
              
              System.out.println("La operación no puede realizarse por falta de fondos");

            }else if (seleccion == 2){
                ProyectoFinal mensajero = new ClaseConsulta();
            mensajero.Transacciones();

            }else if (seleccion == 3){
                ProyectoFinal mensajero = new ClaseRetiro();
            mensajero.Transacciones();

            }else if (seleccion == 4){
                ProyectoFinal mensajero = new PagoOnline();
            mensajero.Transacciones();

            }else if (seleccion == 5){

                System.out.println("Gracias por elegirnos, ¡Por favor retire su tarjeta!");
                eleccion=2;
            }

            
        }while(eleccion !=2);

        }
        //retiro
        public void Dinero(){
            Dinero = entrada.nextInt();

        }

        //Metodo para solicitar pagoonline
        public void Deposito(){
            deposito = entrada.nextInt();
        }

        public void Transacciones(){

        }
        public int getsaldo(){
            return saldo;
        }
        public void setSaldo( int saldo){
            this.saldo = saldo;

        }
        public static String miTeclado(){
            Scanner miTeclado = new Scanner(System.in);
          
            String variable = miTeclado.nextLine();
         
            return variable;
        }

        /*public int op() {
            Scanner Leer = new Scanner(System.in);
            int op = Leer.nextInt();
            return op; 
            
        }*/
        

}
