import java.util.Scanner;

public class testesvariaveis {
    
        public static void main(String[] args) {
            // Cria o objeto Scanner para ler a entrada do usuário
            Scanner scanner = new Scanner(System.in);
            
            // Solicita os números para o usuário
            System.out.println("Digite o primeiro número:");
            double num1 = scanner.nextDouble();
            
            System.out.println("Digite o segundo número:");
            double num2 = scanner.nextDouble();
            
            // Realiza a soma
            double soma = num1 + num2;
            
            // Exibe o resultado
            System.out.println("A soma de " + num1 + " e " + num2 + " é: " + soma);
            
            // Fecha o scanner
            scanner.close();
        }
    }
    
    
