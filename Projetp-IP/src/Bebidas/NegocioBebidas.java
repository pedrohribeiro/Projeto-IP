package Bebidas;
public class NegocioBebidas {

	private RepositorioBebidas repositorio;
	

	public NegocioBebidas(int x) {

		if (x == 0) {
			this.repositorio = new RepositorioBebidasLista();
		} else {
			this.repositorio = new RepositorioBebidasArray();
		}
	}

	public void inserir(Bebidas bebida) throws BebidaExistenteException {

		if (!repositorio.existe(bebida)) {
			repositorio.inserir(bebida);
		} else {
			throw new BebidaExistenteException();
		}
	}

	public void remover(Bebidas bebida) throws BebidaInexistenteException {

		if (repositorio.existe(bebida)) {
			repositorio.remover(bebida);
		} else {
			throw new BebidaInexistenteException();
		}
	}

	public Bebidas procurar(Bebidas bebida) throws BebidaInexistenteException {
		if (repositorio.existe(bebida)) {
			return repositorio.procurar(bebida);
		} else {
			throw new BebidaInexistenteException();
		}
	}

	public boolean existe(Bebidas bebida) {
		if (repositorio.existe(bebida)) {
			return true;
		} else {
			return false;
		}
	}

	public void atualizar(Bebidas bebida) throws BebidaInexistenteException {
		if (repositorio.existe(bebida)) {
			repositorio.atualizar(bebida);
		} else {
			throw new BebidaInexistenteException();
		}

	}
}
