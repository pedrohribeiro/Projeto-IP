package Bebidas;

public class RepositorioBebidasLista implements RepositorioBebidas {


	private Bebidas valor;
	private RepositorioBebidasLista proximo;

	public RepositorioBebidasLista() {
		this.valor = null;
		this.proximo = null;
	}

	public void inserir(Bebidas valor) {
		if (this.proximo != null) {
			if (this.valor == null) {
				this.valor = valor;
				this.proximo = new RepositorioBebidasLista();
			} else {
				this.proximo.inserir(valor);
			}
		}
	}

	public void remover(String sabor) {
		if (this.proximo != null) {
			if(this.valor.getSabor().equals(sabor)) {
				this.valor= this.proximo.valor;
				this.proximo = this.proximo.proximo;
			} else {
				this.proximo.remover(sabor);
			}
		}
	}

	public Bebidas procurar(String sabor) {		
		if (this.proximo != null) {
			if (this.valor.getSabor().equals(sabor)) {
				return valor;
			} else {
				return this.proximo.procurar(sabor);
			}
		} else
			return null;		
	}
	

	public void atualizar(Bebidas valor) {
		if (this.proximo != null) {
		if (!this.valor.getSabor().equals(valor.getSabor())) {
			this.valor.setSabor(valor);
		} else 
			this.proximo.atualizar(valor);
		}
	}

	

}