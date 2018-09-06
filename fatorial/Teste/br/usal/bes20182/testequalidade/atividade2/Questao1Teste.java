package br.usal.bes20182.testequalidade.atividade2;

import org.junit.Assert;
import org.junit.Test;

public class Questao1Teste {
	/*
	 * @Parameters(name = "{index} - calcularFatorial({0})={1}") public static
	 * Collection<Object[]> obterCasosTeste() { return Arrays.asList(new
	 * Object[][] { { 0, 1 }, { 3, 6 }, { 5, 120 } }); }
	 * 
	 * @Parameter public Integer a;
	 * 
	 * @Parameter(1) public Long fatorialEsperado;
	 * 
	 * @Test public void testarFarorial() { Long fatorialAtual =
	 * Questao1.calcularFatorial(a);
	 * 
	 * Assert.assertEquals(fatorialEsperado, fatorialAtual); }
	 */

	@Test
	public void Fatorial0Test() {

		int n = 0;

		long fatorial = Questao1.calcularFatorial(n);

		long resultadoEsperado = 1;

		Assert.assertEquals(resultadoEsperado, fatorial);
	}

}
