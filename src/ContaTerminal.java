
import java.util.Scanner;

public class ContaTerminal {
    public static void main(String[] args){

       Scanner teclado = new Scanner(System.in);

       System.out.print("Por favor, digite o número da Conta: ");
       int numero = teclado.nextInt();
       teclado.nextLine();

       System.out.print("Por favor, digite a agência: ");
       String agencia = teclado.nextLine();
       
       
       System.out.print("Por favor, digite o seu Nome: ");
       String nomecliente = teclado.nextLine();
    


       System.out.print("Por favor, digite o Saldo: ");
       Double saldo = teclado.nextDouble();
       

       System.out.println("Olá " + nomecliente + ", obrigado por criar uma conta em nosso banco, sua agência é " + agencia + ", conta " + numero + " e seu saldo " + saldo + " já está disponível para saque ");












        
    }
    
}
