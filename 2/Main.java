package teste.target;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        int entrada, fibonacci, anterior;                                         // declaração das variáveis
        boolean condicao = false;
         
        Scanner scanner = new Scanner(System.in);           // abertura do scanner 
        System.out.println("Digite um número: ");
        entrada = scanner.nextInt();                                         // salvando a entrada do usuário
           
        if (entrada == 0 || entrada == 1) {                             // verificando se é igual oas primeiros valores de fibonacci
            condicao = true;
        } else {
            anterior = 0;
            fibonacci = 1;
            while (fibonacci <= entrada) {                             //linha 19 a 26: subindo e comparando o valor da variavel fibonacci até ela igualar ou passar entrada.
                if (fibonacci == entrada) {
                    condicao = true;
                    break;
                }
                int temp = fibonacci;
                fibonacci = fibonacci + anterior;
                anterior = temp;
            }
        }
  
        if (condicao) {                                                                                            //retorno                                  
            System.out.println("A entrada pertence a sequência.");
        } else {
            System.out.println("A entrada não pertence a sequência.");
        }
        					
        scanner.close();
    }
}
