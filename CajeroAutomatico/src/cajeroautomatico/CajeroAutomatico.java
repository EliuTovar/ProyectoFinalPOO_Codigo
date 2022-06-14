package cajeroautomatico;
import java.io.*;
import java.util.Scanner;
import java.util.logging.Level;
import java.util.logging.Logger;

public class CajeroAutomatico {

    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        
        System.out.println("A CONTINUACION SE LE APLICARA UN BREVE FORMULARIO PARA CUALQUIER INCONVENIENTE PODER COMUNICARNOS CON MAYOR FACILIDAD");
        
        File archivo;
        FileWriter escribir;
        PrintWriter linea;
        String nombre = "", dir = "", email = "";
        archivo = new File("usuarios.txt");
        if(!archivo.exists()){
            try {
                archivo.createNewFile();
                System.out.print("Porfavor ingresa tu Nombre: ");
                nombre = entrada.nextLine();
                System.out.print("Porfavor ingresa tu Direccion: ");
                dir = entrada.nextLine();
                System.out.print("Porfavor ingresa tu Email: ");
                email = entrada.nextLine();
                escribir = new FileWriter(archivo, true);
                linea = new PrintWriter(escribir);
                linea.println(nombre);
                linea.println(dir);
                linea.println(email);
                linea.close();
                escribir.close();
                
            } catch (IOException ex) {
                Logger.getLogger(CajeroAutomatico.class.getName()).log(Level.SEVERE, null, ex);
            }
        }else{
            try {
                System.out.print("Prfavor ingresa tu Nombre");
                nombre = entrada.nextLine();
                System.out.print("Prfavor ingresa tu Direccion");
                dir = entrada.nextLine();
                System.out.print("Prfavor ingresa tu Email");
                email = entrada.nextLine();
                escribir = new FileWriter(archivo, true);
                linea = new PrintWriter(escribir);
                linea.println(nombre);
                linea.println(dir);
                linea.println(email);
                linea.close();
                escribir.close();
                
            } catch (IOException ex) {
                Logger.getLogger(CajeroAutomatico.class.getName()).log(Level.SEVERE, null, ex);
            }   
        }
        UsuarioContraseña usucon = new UsuarioContraseña();
        usucon.iniciarSesion();
    }
}