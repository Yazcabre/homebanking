package Clases;
import java.util.Scanner;

public class Final {
    public static void main(String[] args) {
       
        Scanner sc= new Scanner(System.in);
            String usuario = "persona", pass="persona123"; 
            String user, password;
            System.out.println("Bienvenido al sistema");
            System.out.println("Por favor ingrese su usuario: ");
            user=sc.nextLine();
            System.out.println("Ingrese su contraseña: ");
            password=sc.nextLine();
            int intentos=0;
            if (usuario.equals(user) && pass.equals(password)){
                System.out.println("Bienvenidos al sistema");
          
                ProyectoFinal mensajero = new ProyectoFinal();
        mensajero.setSaldo(5000);
        mensajero.Operaciones();
    
            
            }

             while (pass.equals(password)==false && intentos < 2){
                System.out.println("Hay un error en los datos, por favor intente nuevamente");
                System.out.println("Por favor ingrese su usuario: ");
            user=sc.nextLine();
            System.out.println("Ingrese su contraseña: ");
            password=sc.nextLine();
           
            if (usuario.equals(user) && pass.equals(password)) {
                System.out.println("Bienvenidos al sistema");

                ProyectoFinal mensajero = new ProyectoFinal();
                mensajero.setSaldo(5000);
                mensajero.Operaciones();
            
            } else {
               if (pass.equals(password)==false && intentos <2) {
                System.out.println("Sistema bloqueado, por favor intente mas tarde");
               }
            }
            }
        }
    
       
       
       
       
       
       
       
       
       
       
       
       
       
       
       
        
    
    }

