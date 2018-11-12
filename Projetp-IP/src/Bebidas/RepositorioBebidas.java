package Bebidas;

public interface RepositorioBebidas {
	
	public void inserir (Bebidas valor);
	
	public void remover (String sabor);
	
	public Bebidas procurar (String sabor);
	
	public void atualizar (Bebidas valor);
		
	
}