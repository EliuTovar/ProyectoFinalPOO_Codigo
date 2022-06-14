package cajeroautomatico;


public class ConsultarSaldo extends MenuOpciones{
    
    @Override
    public void Transacciones(){
        System.out.println("----------------------------------");
        System.out.println("     Tu saldo actual es: $" + getSaldo());
        System.out.println("----------------------------------");
        
    }
    
}
