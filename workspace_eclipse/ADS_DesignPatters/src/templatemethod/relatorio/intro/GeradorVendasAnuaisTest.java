package templatemethod.relatorio.intro;

import org.junit.Test;

public class GeradorVendasAnuaisTest {

	@Test
	void deveGerarRelatorioVendasAnuais() {
		GeradorRelatorioDeVendasAnuais gerador = new GeradorRelatorioDeVendasAnuais();
		
		String pagina = gerador.criarPagina(2022);
		
		System.out.println(pagina);
	}
}
