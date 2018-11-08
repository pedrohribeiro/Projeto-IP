package bebidas;

public class repositorioBebidasLista implements repositorioBebidas {
	
	private Bebidas valor;
	private repositorioBebidasLista proximo;
	
	public repositorioBebidasLista() {
		this.valor = null;
		this.proximo = null;
	}

	public void inserir(Bebidas valor) {
		
		if (this.valor == null) {
			this.valor = valor;
			this.proximo = new repositorioBebidasLista();
			
		} else {
			this.proximo.inserir(valor);
		}
	}

	public void remover(String sabor) {
		if(this.valor.getSabor() == sabor) {
			this.valor= this.proximo.valor;
			this.proximo = this.proximo.proximo;
		} else {
			this.proximo.remover(sabor);
		}

	}

	//public void alterar(String tipo, String sabor, char tamanho, double custo, double preco) {
		// == 
	public void alterarTipo(String tipo) {
		if(!this.valor.getTipo().equals(tipo)) {
			this.valor.setTipo(tipo);					
		}
	}
	
	public void alterarSabor(String sabor) {
		if (!this.valor.getSabor().equals(sabor)) {
			this.valor.setSabor(sabor);
		}
	}
	

	public boolean procurar(String tipo, String sabor) {
		// TODO Auto-generated method stub
		return false;
	}

	public void promocao(String tipo, double preco) {
		// TODO Auto-generated method stub

	}

	
	public void remover(Bebidas valor) {
		// TODO Auto-generated method stub
		
	}

	
	public void alterar(Bebidas valor) {
		// TODO Auto-generated method stub
		
	}

}
