package teste.target;

public class Main {

	public static void main(String[] args) {
        String original = "Esperando a entrevista";
        
        char[] caracteres = original.toCharArray();
        
        int inicio = 0;
        int fim = caracteres.length - 1;
        
        while (inicio < fim) {
            char temp = caracteres[inicio];
            caracteres[inicio] = caracteres[fim];
            caracteres[fim] = temp;
            
            inicio++;
            fim--;
        }
        String invertida = new String(caracteres);
        
        System.out.println("String original: " + original);
        System.out.println("String invertida: " + invertida);
    }
}
