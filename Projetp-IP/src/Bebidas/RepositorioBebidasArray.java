package Bebidas;

public class RepositorioBebidasArray {

	Bebidas [] arrayBebidas;
	public RepositorioBebidasArray() {
		this.arrayBebidas = new Bebidas[200];
	}

	public void inserir(Bebidas bebida) {

		int index = 0;
		boolean pausa = false;

		for (int i = 0; i < this.arrayBebidas.length && !pausa; i++) {

			if (this.arrayBebidas[i] == null) {

				index = i;
				pausa = !pausa;

			}
		}

		this.arrayBebidas[index] = bebida;
	}

	public void remover(Bebidas bebida) {

		int index = 0;
		boolean pausa = false;

		for (int i = 0; i < this.arrayBebidas.length && !pausa; i++) {
			if (this.arrayBebidas[i] == bebida) {
				index = i;
				pausa = !pausa;
			}
		}

		for (int i = index; i < arrayBebidas.length - 1; i++) {
			this.arrayBebidas[i] = this.arrayBebidas[i + 1];
		}

	}

	public Bebidas procurar(String sabor) {

		for (int i = 0; i < arrayBebidas.length; i++) {

			if (this.arrayBebidas[i].getSabor().equals(sabor)) {
				return this.arrayBebidas[i];
			} else {
				return null;
			}
		}
		return null;
	}

	public void atualizarPreco(String tipo, char tamanho, double preco) {

		boolean parada = false;
		for (int i = 0; i < arrayBebidas.length && !parada; i++) {
			if (this.arrayBebidas[i] != null) {
				if (this.arrayBebidas[i].getSabor().equals(tipo)
						&& this.arrayBebidas[i].getTamanho() == tamanho) {
					this.arrayBebidas[i].setPreco(preco);
					parada = true;
					
				}
			}
		}
	}
}
