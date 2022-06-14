
package cajeroautomatico;

import java.util.Scanner;


public class UsuarioContraseña {
    int lim = 0;
        String usuario = "usuario1";
        String contraseña = "12345";
        String usua;
        String contra;
        
        
        public void iniciarSesion(){
        Scanner entrada = new Scanner(System.in);
        System.out.println("Bienvenido porfavor ingrese su usuario y contraseña");
        System.out.print("Usuario: ");
        usua = entrada.nextLine();
        System.out.print("Contraseña: ");
        contra = entrada.nextLine();
        
        
        while(lim == 0){
          if(usua.equals(usuario)&& contra.equals(contraseña)){
            MenuOpciones fin = new ConsultarSaldo();
            fin.setSaldo(500);
            fin.mostarMenu();
            lim = 1;
            
          }else{
             System.out.println("Usuario o contraseña incorrectos porfavor vuelva a intentar");
             System.out.print("Usuario: ");
             usua = entrada.nextLine();
             System.out.print("Contraseña: ");
             contra = entrada.nextLine();
            } 
        }
    
    }
}
