import static org.junit.Assert.*;

import org.junit.Test;


public class EstatisticasSimplesTest {

	@Test
	public void deveCalcularValorMinimoEntreDoisValores() {
	double valoresDeEntrada[] = {9,5};
	double valorMinimoCalculado = EstatisticasSimples.calculaValorMinimo(valoresDeEntrada);
	assertEquals(5, valorMinimoCalculado, 0);
	
	
	}

	@Test
	public void deveCalcularValorMaximoEntreDoisValores() {
	double valoresDeEntrada[] = {9,5};
	double valorMaximoCalculado = EstatisticasSimples.calculaValorMaximo(valoresDeEntrada);
	assertEquals(9, valorMaximoCalculado, 0);
	}

	@Test
	public void deveCalcularQuantidadeDeValores() {
	double valoresDeEntrada[] = {9,5,4,3,2};
	int quantidadeDeValores = EstatisticasSimples.calculaQuantidade(valoresDeEntrada);
	assertEquals(5, quantidadeDeValores);
	}

	@Test
	public void deveCalcularMediaDeDoisValores() {
	double valoresDeEntrada[] = {9,5};
	double mediaDeValores = EstatisticasSimples.calculaMedia(valoresDeEntrada);
	assertEquals(7, mediaDeValores, 0);
	}

	@Test
	public void deveEfetuarTodosCalculosParaDoisValores() {
	double valoresDeEntrada[] = {9,5};
	double valoresDeSaida[] = EstatisticasSimples.calcula(valoresDeEntrada);
	assertArrayEquals(new double[] {5,9,2,7}, valoresDeSaida, 0);
	}
	
	
    @Test
    public void deveCalcularValorMinimoEntreMaisValores() {
    int valoresDeEntrada[] = {3,5,6,2,4,1};
    int valorMinimoCalculadoDois = EstatisticasSimples.calculaValorMinimoDois(valoresDeEntrada);
    assertEquals(1, valorMinimoCalculadoDois,0);

    }
    
	@Test
	public void deveCalcularMediaDeQuatroValores() {
	double valoresDeEntrada[] = {8,6,4,2};
	double mediaDeValores = EstatisticasSimples.calculaMediaDois(valoresDeEntrada);
	assertEquals(5, mediaDeValores, 0);
	}

}
	
