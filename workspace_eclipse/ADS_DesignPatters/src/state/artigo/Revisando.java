package state.artigo;

public class Revisando implements Estado{
	 
	private Artigo artigo;
	
	public Revisando(Artigo artigo) {
		
		this.artigo = artigo;
	}
	
	@Override
	public void publicar() {	
		
	}

	@Override
	public void reprovar() {
			
	}

}