import java.util.Scanner;

public class ContaBancaria {

     public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        String numero, Agencia, NomedoCliente, Saldo;

        System.out.println("Informe o numero: ");
        numero = teclado.nextLine();

        System.out.println("Informe sua agencia bancaria: ");
        Agencia = teclado.nextLine();

        System.out.println("Informe o seu nome: ");
        NomedoCliente = teclado.nextLine();

        System.out.println("Saldo bancario: ");
        Saldo = teclado.nextLine();

        System.out.println("\nOlá " + NomedoCliente + ", obrigado por criar uma conta em nosso banco, "
                + "sua agência é " + Agencia + ", conta " + numero + " e seu saldo "
                + Saldo + " já está disponível para saque.");


        teclado.close();


     }

    
}
