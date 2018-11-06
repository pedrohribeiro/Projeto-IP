package bebidas;

public interface repositorioBebidas {
	
	public void inserir (Bebidas valor);
	
	public void remover (Bebidas valor);
	
	public void alterar (Bebidas valor);
	
	public boolean procurar (String tipo, String sabor);
	
	public void promocao (String tipo, double preco);

}
