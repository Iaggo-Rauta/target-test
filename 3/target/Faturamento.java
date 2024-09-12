public class Faturamento {
    
    // Calcula o menor valor de faturamento
    public static double calcularMenorFaturamento(double[] faturamento) {
        if (faturamento == null || faturamento.length == 0) {
            throw new IllegalArgumentException("O vetor de faturamento não pode ser vazio.");
        }
        
        double menor = faturamento[0];
        for (double valor : faturamento) {
            if (valor < menor) {
                menor = valor;
            }
        }
        return menor;
    }

    // Calcula o maior valor de faturamento
    public static double calcularMaiorFaturamento(double[] faturamento) {
        if (faturamento == null || faturamento.length == 0) {
            throw new IllegalArgumentException("O vetor de faturamento não pode ser vazio.");
        }
        
        double maior = faturamento[0];
        for (double valor : faturamento) {
            if (valor > maior) {
                maior = valor;
            }
        }
        return maior;
    }

    // Calcula o número de dias com faturamento acima da média
    public static int calcularDiasAcimaMedia(double[] faturamento) {
        if (faturamento == null || faturamento.length == 0) {
            throw new IllegalArgumentException("O vetor de faturamento não pode ser vazio.");
        }
        
        double soma = 0;
        for (double valor : faturamento) {
            soma += valor;
        }
        double media = soma / faturamento.length;
        
        int diasAcimaMedia = 0;
        for (double valor : faturamento) {
            if (valor > media) {
                diasAcimaMedia++;
            }
        }
        return diasAcimaMedia;
    }
}


