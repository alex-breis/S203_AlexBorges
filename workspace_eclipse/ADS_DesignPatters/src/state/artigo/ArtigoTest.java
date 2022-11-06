package state.artigo;

import static org.junit.Assert.*;

import org.junit.Test;

public class ArtigoTest {

	@Test 
	void deveArtigoTransitarDeRascunhoAteAprovado() {
		GerenteDeSeguranca gerenteDeSeguranca = GerenteDeSeguranca.getInstance();
		
		Artigo artigo = new Artigo();
		
		assertEquals("RASCUNHO", artigo.getEstado());
		
		//1. Rascunho > Revisando 
		gerenteDeSeguranca.setUsuarioCorrente ("AUTOR"); 
		artigo.publicar();
		
		assertEquals("REVISANDO", artigo.getEstado());
		
		//2. Revisando > Aprovado 
		gerenteDeSeguranca.setUsuarioCorrente("MODERADOR"); 
		artigo.publicar();
		
		assertEquals("APROVADO", artigo.getEstado());
		
		//imprime o historico 
		artigo.getLogHistorico().forEach( System.out::println );
	}

}
