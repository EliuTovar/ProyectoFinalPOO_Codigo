package cajeroautomatico;

import java.util.Scanner;


public abstract class MenuOpciones {//Inica clase
    
    protected int transacciones, retiro, deposito;
    private static int saldo;
    Scanner entrada = new Scanner(System.in);
    
    public void mostarMenu(){//Inicia metodo
        
        int limite = 0;
        
        while(limite == 0){//Inicia while
            
            System.out.println("Bienvenido a MY MONEY BANK");
            System.out.println("MENU:");
            System.out.println("1. Consultar Saldo");
            System.out.println("2. Depositar");
            System.out.println("3. Retirar");
            System.out.println("4. Salir");
            System.out.print("Ingrese el numero de la opcion que desea: ");
            int op = entrada.nextInt();
            
            switch(op){//inicia switch
                case 1:
                    MenuOpciones consultar = new ConsultarSaldo();
                    consultar.Transacciones();
                    break;
                case 2:
                    MenuOpciones deposito = new Deposito();
                    deposito.Transacciones();
                    break;
                case 3:
                    MenuOpciones retiro = new Retiro();
                    retiro.Transacciones();
                    break;
                case 4:
                    System.out.println("------------------------");
                    System.out.println(" Gracias, vuelva pronto");
                    System.out.println("------------------------");
                    limite = 1;
                    break;
                default:
                    System.out.println("-------------------------------------");
                    System.out.println(" Opcion no valida, vuelva a intentar");
                    System.out.println("-------------------------------------");
            }//termina el switch
        }//termina while
    }//fin mostrarMenu
    
    //Metodo para solicitar cantidad de retiro
    public void Retiro(){
        retiro = entrada.nextInt();
    }
    
    //Metodo para solicitar deposito
    public void Deposito(){
        deposito = entrada.nextInt();
    }
    
    //Metodo abstracto
    public abstract void Transacciones();

    //Metodos get y set
    public static int getSaldo() {
        return saldo;
    }

    public static void setSaldo(int saldo) {
        MenuOpciones.saldo = saldo;
    }
    
    
}//termina la clase
