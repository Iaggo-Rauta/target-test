package teste.target;

public class Main {
	public static void main(String[] args) {
	    double faturamentoSP = 67836.43;
	    double faturamentoRJ = 36678.66;
	    double faturamentoMG = 29229.88;
	    double faturamentoES = 27165.48;
	    double faturamentoOutros = 19849.53;
	
	    // Calcula o valor total de faturamento
	    double totalFaturamento = faturamentoSP + faturamentoRJ + faturamentoMG + faturamentoES + faturamentoOutros;
	
	    // Calcula o percentual de representação de cada estado
	    double percentualSP = (faturamentoSP / totalFaturamento) * 100;
	    double percentualRJ = (faturamentoRJ / totalFaturamento) * 100;
	    double percentualMG = (faturamentoMG / totalFaturamento) * 100;
	    double percentualES = (faturamentoES / totalFaturamento) * 100;
	    double percentualOutros = (faturamentoOutros / totalFaturamento) * 100;
	
	    // Exibe os resultados
	    System.out.println("Percentual de representação de cada estado:");
	    System.out.printf("SP: %.2f%%\n", percentualSP);
	    System.out.printf("RJ: %.2f%%\n", percentualRJ);
	    System.out.printf("MG: %.2f%%\n", percentualMG);
	    System.out.printf("ES: %.2f%%\n", percentualES);
	    System.out.printf("Outros: %.2f%%\n", percentualOutros);
	}
}