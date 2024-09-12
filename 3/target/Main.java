package teste.target;

public class Main {
    public static void main(String[] args) {
        double[] faturamento = {200.0, 300.0, 150.0, 400.0, 350.0};
        
        double menorFaturamento = Faturamento.calcularMenorFaturamento(faturamento);
        double maiorFaturamento = Faturamento.calcularMaiorFaturamento(faturamento);
        int diasAcimaMedia = Faturamento.calcularDiasAcimaMedia(faturamento);
        
        System.out.println("O menor valor de faturamento é: " + menorFaturamento);
        System.out.println("O maior valor de faturamento é: " + maiorFaturamento);
        System.out.println("Número de dias com faturamento acima da média mensal: " + diasAcimaMedia);
    }
}