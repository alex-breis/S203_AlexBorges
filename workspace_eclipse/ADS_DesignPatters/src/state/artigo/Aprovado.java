package state.artigo;

public class Aprovado implements Estado{
	private Artigo artigo;
	
	public Aprovado(Artigo artigo) {
		
		this.artigo = artigo;
	}

	@Override
	public void publicar() {
		
	}

	@Override
	public void reprovar() {
			
	}

}