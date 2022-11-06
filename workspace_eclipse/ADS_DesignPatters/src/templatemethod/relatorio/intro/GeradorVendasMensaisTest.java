package templatemethod.relatorio.intro;

import org.junit.Test;

public class GeradorVendasMensaisTest {

	@Test
	void deveGerarRelatorioVendasMensais() {
		GeradorRelatorioDeVendasMensais gerador = new GeradorRelatorioDeVendasMensais();
		
		String pagina = gerador.criarPagina(2022, 10);
		
		System.out.println(pagina);
	}
}
