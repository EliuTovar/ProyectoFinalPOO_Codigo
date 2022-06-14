/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package cajeroautomatico;

/**
 *
 * @author tovar
 */
public class Deposito extends MenuOpciones{
    
    @Override
    public void Transacciones(){
        System.out.println("");
        System.out.print("Cuanto deseas depositar: ");
        Deposito();
        
        transacciones = getSaldo();
        setSaldo(transacciones + deposito);
        System.out.println("-----------------------------------");
        System.out.println("          Depositaste: $" + deposito);
        System.out.println("      Tu saldo actual es: $" + getSaldo());
        System.out.println("-----------------------------------");
    }
    
}
