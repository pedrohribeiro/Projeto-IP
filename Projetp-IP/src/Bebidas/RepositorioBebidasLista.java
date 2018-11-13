package Bebidas;

public class RepositorioBebidasLista implements RepositorioBebidas {


	private Bebidas bebida;
	private RepositorioBebidasLista proximo;

	public RepositorioBebidasLista() {
		this.bebida = null;
		this.proximo = null;
	}

	public void inserir(Bebidas bebida) {
		if (this.proximo != null) {
			if (this.bebida == null) {
				this.bebida = bebida;
				this.proximo = new RepositorioBebidasLista();
			} else {
				this.proximo.inserir(bebida);
			}
		}
	}

	public void remover(String sabor) {
		if (this.proximo != null) {
			if(this.bebida.getSabor().equals(sabor)) {
				this.bebida= this.proximo.bebida;
				this.proximo = this.proximo.proximo;
			} else {
				this.proximo.remover(sabor);
			}
		}
	}

	public Bebidas procurar(String sabor) {		
		if (this.proximo != null) {
			if (this.bebida.getSabor().equals(sabor)) {
				return bebida;
			} else {
				return this.proximo.procurar(sabor);
			}
		} else
			return null;		
	}
	

	public void atualizar(Bebidas bebida) {
		if (this.proximo != null) {
		if (!this.bebida.getSabor().equals(bebida.getSabor())) {
			this.bebida.setSabor(bebida);
		} else 
			this.proximo.atualizar(bebida);
		}
	}

	

}