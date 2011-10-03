public class EstatisticasSimples {

	public static double calculaValorMinimo(double[] valoresDeEntrada){
		if(valoresDeEntrada[0] > valoresDeEntrada[1]){
			}
		return valoresDeEntrada[1];
		}

	public static double calculaValorMaximo(double[] valoresDeEntrada) {
		if (valoresDeEntrada[0] > valoresDeEntrada[1]){
		}
		return valoresDeEntrada[0];
	}

	public static int calculaQuantidade(double[] valoresDeEntrada) {
		int quantidade = (int) valoresDeEntrada.length;
		return quantidade;
	}

	public static double calculaMedia(double[] valoresDeEntrada) {
		double media = 0;
		media = (valoresDeEntrada[0] + valoresDeEntrada[1])/2;
		return media;
	}

	public static double[] calcula(double[] valoresDeEntrada) {
		double valor[] = new double[4];
		valor[0] = calculaValorMinimo(valoresDeEntrada);
		valor[1] = calculaValorMaximo(valoresDeEntrada);
		valor[2] = calculaQuantidade(valoresDeEntrada);
		valor[3] = calculaMedia(valoresDeEntrada);
		return valor;
	}

	public static int calculaValorMinimoDois(int[] valoresDeEntrada) {
		int menor = Integer.MAX_VALUE;
		for(int i = 0; i < valoresDeEntrada.length; i++){
			if(menor > valoresDeEntrada[i])
				menor = valoresDeEntrada[i];
		}
		return menor;
	}

	public static double calculaMediaDois(double[] valoresDeEntrada) {
		double media = 0;
		media = (valoresDeEntrada[0] + valoresDeEntrada[1] + valoresDeEntrada[2] + valoresDeEntrada[3])/4;
		return media;
	}

}