package Excecoes;

public class BebidaInexistenteException extends Exception{
	
	public BebidaInexistenteException() {
		super("Essa bebida n�o est� cadastrada no Sistema!");
	}

}
